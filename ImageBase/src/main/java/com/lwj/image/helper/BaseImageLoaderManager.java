package com.lwj.image.helper;

import android.content.Context;

/**
 * Created by lwj on 2018/7/3.
 * lwjfork@gmail.com
 */

public abstract class BaseImageLoaderManager implements IImageLoaderManagerHelper {

    public BaseImageLoaderManager(Context context) {
        config(context);
    }

    protected abstract BaseImageLoaderManager config(Context context);
}
