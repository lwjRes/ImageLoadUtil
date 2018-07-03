package com.lwj.image.transformation;

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
import android.graphics.Xfermode;

/**
 * Created by lwj on 2018/7/3.
 * lwjfork@gmail.com
 * 圆形加边框
 */

public class CircleBorderTransformation implements ITransformation {

    private int borderColor = Color.TRANSPARENT;
    private int borderWidth = 0;


    public CircleBorderTransformation(int borderWidth, int borderColor) {
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
    }

    @Override
    public Bitmap transformBitmap(Bitmap source) {
        int minEdge = Math.min(source.getWidth(), source.getHeight());
        int dx = (source.getWidth() - minEdge) / 2;
        int dy = (source.getHeight() - minEdge) / 2;

        // Init shader
        Shader shader = new BitmapShader(source, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setTranslate(-dx, -dy);   // Move the target area to center of the source bitmap
        shader.setLocalMatrix(matrix);

        // Init paint
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setShader(shader);
        int radius = (int) (minEdge / 2f);
        // Create and draw circle bitmap
        Bitmap output = Bitmap.createBitmap(minEdge, minEdge, source.getConfig());
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
            canvas.drawCircle(radius, radius, radius, mBorderPaint);
        } else {
            canvas.drawOval(new RectF(0, 0, minEdge, minEdge), paint);
        }
        // Recycle the source bitmap, because we already generate a new one
        source.recycle();
        return output;
    }
}
