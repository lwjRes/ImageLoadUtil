package com.lwj.image.transformation;

import android.graphics.Bitmap;
import android.graphics.Color;

import com.lwj.image.util.BitmapUtil;

/**
 * Created by lwj on 2018/7/3.
 * lwjfork@gmail.com
 * 圆形转换器
 */

public class CircleTransformation implements ITransformation {

    private int borderColor = Color.TRANSPARENT;
    private int borderWidth = 0;

    public CircleTransformation() {
    }

    public CircleTransformation(int borderWidth, int borderColor) {
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
    }

    @Override
    public Bitmap transformBitmap(Bitmap source) {
        return BitmapUtil.cropCircleBitmap(source, borderColor, borderWidth);
    }
}
