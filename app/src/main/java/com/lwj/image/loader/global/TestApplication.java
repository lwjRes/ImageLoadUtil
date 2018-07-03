package com.lwj.image.loader.global;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;

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
import com.lwj.image.transformation.CircleBorderTransformation;
import com.lwj.image.util.ImageLoaderUtil;
import com.lwj.image.util.LogUtil;

/**
 * Created by lwj on 2018/7/3.
 * lwjfork@gmail.com
 */

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        configGlide(this);
        ImageLoaderUtil.get().downLoad(this, "https://upload.jianshu.io/users/upload_avatars/2405826/9ca67ca1a64c.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/114/h/114", new DownLoadListener() {
            @Override
            public void onSuccess(Bitmap bitmap) {
                LogUtil.d("BITMAP", "BITMAP");

                CircleBorderTransformation borderTransformation = new CircleBorderTransformation(10, Color.BLUE);
                borderTransformation.transformBitmap(bitmap);
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
}
