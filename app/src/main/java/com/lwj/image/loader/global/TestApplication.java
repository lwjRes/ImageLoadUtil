package com.lwj.image.loader.global;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

import com.lwj.image.download.DownLoadListener;
import com.lwj.image.fresco.FrescoDownLoader;
import com.lwj.image.fresco.FrescoImageLoader;
import com.lwj.image.fresco.FrescoManger;
import com.lwj.image.glide.GlideDownLoader;
import com.lwj.image.glide.GlideImageLoader;
import com.lwj.image.glide.GlideManger;
import com.lwj.image.picasso.PicassoDownLoader;
import com.lwj.image.picasso.PicassoImageLoader;
import com.lwj.image.picasso.PicassoManger;
import com.lwj.image.transformation.CircleTransformation;
import com.lwj.image.util.BitmapUtil;
import com.lwj.image.util.ImageLoaderUtil;

/**
 * Created by lwj on 2018/7/3.
 * lwjfork@gmail.com
 */

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        configGlide(this);
        ImageLoaderUtil.get().downLoad(this, "https://upload-images.jianshu.io/upload_images/2158254-679dd9abb7e6210a.png?imageMogr2/auto-orient/", new DownLoadListener() {
            @Override
            public void onSuccess(Bitmap bitmap) {
                BitmapUtil.cropCircleBitmap(bitmap, 20, Color.BLUE);
            }

            @Override
            public void onFail(Throwable throwable) {

            }

            @Override
            public void onStart() {

            }
        });
    }

    public static void configPicasso(Context context) {
        ImageLoaderUtil.setDownLoaderHelper(new PicassoDownLoader());
        ImageLoaderUtil.setLoader(new PicassoImageLoader());
        ImageLoaderUtil.setManagerHelper(new PicassoManger(context));
    }

    public static void configFresco(Context context) {
        ImageLoaderUtil.setDownLoaderHelper(new FrescoDownLoader());
        ImageLoaderUtil.setLoader(new FrescoImageLoader());
        ImageLoaderUtil.setManagerHelper(new FrescoManger(context));
    }

    public static void configGlide(Context context) {
        ImageLoaderUtil.setDownLoaderHelper(new GlideDownLoader());
        ImageLoaderUtil.setLoader(new GlideImageLoader());
        ImageLoaderUtil.setManagerHelper(new GlideManger(context));
    }


    /**
     * 将给定图片维持宽高比缩放后，截取正中间的正方形部分。
     *
     * @param bitmap 原图
     * @param width  希望得到的正方形部分的边长
     * @return 缩放截取正中部分后的位图。
     */
    public static Bitmap cropSquareBitmap(Bitmap bitmap, int width) {
        if (null == bitmap || 0 >= width) {
            return null;
        }
        int widthOrg = bitmap.getWidth();
        int heightOrg = bitmap.getHeight();
        int minWidth = Math.min(widthOrg, heightOrg);// 获取最小的边
        float scale = (float) width / (float) minWidth;
        int startX = 0;
        int startY = 0;
        if (minWidth < widthOrg) {
            startX = (widthOrg - minWidth) / 2;
        }

        if (minWidth < heightOrg) {
            startY = (heightOrg - minWidth) / 2;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(scale, scale);
        Bitmap result = Bitmap.createBitmap(bitmap, startX, startY, minWidth, minWidth, matrix, false);
        recycleBitmap(bitmap, result);
        return result;
    }


    /**
     * Bitmap recycle
     * 防止在某些情况下两个Bitmap一样，导致使用了已经recycle的Bitmap
     *
     * @param recycle
     * @param another
     */
    public static void recycleBitmap(Bitmap recycle, Bitmap another) {
        if (recycle == null) {
            return;
        }
        if (recycle.isRecycled()) {
            return;
        }
        if (recycle != another) {
            recycle.recycle();
        }
    }

    /**
     * 获取圆角图片
     *
     * @param srcBitmap
     * @param radius    圆角图
     * @return Bitmap
     */
    public static Bitmap bitmap2RoundBitmap(Bitmap srcBitmap, int radius) {
        Bitmap output = Bitmap.createBitmap(srcBitmap.getWidth(), srcBitmap
                .getHeight(), srcBitmap.getConfig());
        Canvas canvas = new Canvas(output);
        final Paint paint = new Paint();
        final Rect rect = new Rect(0, 0, srcBitmap.getWidth(), srcBitmap.getHeight());
        final RectF rectF = new RectF(rect);

        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(0xff424242);
        canvas.drawRoundRect(rectF, radius, radius, paint);

        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(srcBitmap, rect, rect, paint);

        return output;
    }

}
