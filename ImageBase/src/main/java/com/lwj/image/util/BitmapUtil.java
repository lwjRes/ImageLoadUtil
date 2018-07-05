package com.lwj.image.util;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.ColorInt;

/**
 * Created by lwj on 2018/7/4.
 * lwjfork@gmail.com
 */

public class BitmapUtil {

    /**
     * 获取圆形图片
     *
     * @param srcBitmap
     * @return Drawable
     */
    public static Bitmap cropCircleBitmap(Bitmap srcBitmap) {
        return cropCircleBitmap(srcBitmap, 0, Color.TRANSPARENT);
    }


    /**
     * 获取圆形图片
     *
     * @param srcBitmap
     * @return Drawable
     */
    public static Bitmap cropCircleBitmap(Bitmap srcBitmap, int borderWidth, @ColorInt int borderColor) {
        int minEdge = Math.min(srcBitmap.getWidth(), srcBitmap.getHeight());
        int dx = (srcBitmap.getWidth() - minEdge) / 2;
        int dy = (srcBitmap.getHeight() - minEdge) / 2;

        // Init shader
        Shader shader = new BitmapShader(srcBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setTranslate(-dx, -dy);   // Move the target area to center of the source bitmap
        shader.setLocalMatrix(matrix);
        // Init paint
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setShader(shader);
        // Create and draw circle bitmap
        Bitmap output = Bitmap.createBitmap(minEdge, minEdge, srcBitmap.getConfig());
        Canvas canvas = new Canvas(output);

        if (borderWidth > 0) {
            canvas.drawOval(new RectF(0, 0, minEdge, minEdge), paint);
            Paint mBorderPaint = new Paint();
            mBorderPaint.setStyle(Paint.Style.STROKE);
            mBorderPaint.setStrokeWidth(borderWidth);
            mBorderPaint.setColor(borderColor);
            mBorderPaint.setStrokeJoin(Paint.Join.ROUND);
            mBorderPaint.setStrokeCap(Paint.Cap.ROUND);
            mBorderPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            int radius = (int) (minEdge / 2f);
            canvas.drawCircle(radius, radius, radius, mBorderPaint);
        } else {
            canvas.drawOval(new RectF(0, 0, minEdge, minEdge), paint);
        }
        // Recycle the source bitmap, because we already generate a new one
        srcBitmap.recycle();
        return output;
    }


}
