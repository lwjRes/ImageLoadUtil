package com.lwj.image.fresco;

import android.content.Context;


import com.lwj.image.download.ILoadImageUrlConverter.ImageType;
import com.lwj.image.helper.BaseImageLoaderManager;
import com.lwj.image.helper.IImageLoaderManagerHelper;


/**
 * The type Fresco manger.
 */
public class FrescoManger extends BaseImageLoaderManager {


    public FrescoManger(Context context) {
        super(context);
    }

    @Override
    protected BaseImageLoaderManager config(Context context) {
        return this;
    }


    @Override
    public long getDiskCacheSize(Context context) {


        return 0;
    }


    @Override
    public void clearMemoryCache(Context context) {

    }


    @Override
    public void clearDiskCache(Context context) {


    }


    @Override
    public void clearCache(Context context) {
        clearMemoryCache(context);
        clearDiskCache(context);
    }


    /**
     * Gets cache dir.
     *
     * @param context the context
     * @return 磁盘缓存目录
     */
    @Override
    public String getCacheDir(Context context) {
        return "";
    }


    /**
     * Pause load image
     *
     * @param context the context
     */
    @Override
    public void pause(Context context) {

    }


    /**
     * Resume load image
     *
     * @param context the context
     */
    @Override
    public void resume(Context context) {

    }


    @Override
    public void onTrimMemory(Context context, int level) {

    }


    @Override
    public void onLowMemory(Context context) {

    }


    /**
     * Is memory cache boolean.
     *
     * @param context   the context
     * @param url       图片ulr
     * @param imageType url 类型
     * @return the boolean
     */
    @Override
    public boolean isMemoryCache(Context context, String url, @ImageType int imageType) {
        return false;
    }


    /**
     * Is disk cache boolean.
     *
     * @param context   the context
     * @param url       the url
     * @param imageType the image type
     * @return the boolean
     */
    @Override
    public boolean isDiskCache(Context context, String url, @ImageType int imageType) {
        return false;
    }
}
