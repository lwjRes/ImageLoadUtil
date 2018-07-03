package com.lwj.image.fresco;

import android.content.Context;


import com.lwj.image.download.ILoadImageUrlConverter.ImageType;


/**
 * The type Fresco manger.
 */
abstract class FrescoManger {

    public FrescoManger() {
        throw new AbstractMethodError("FrescoManger can't init!");
    }

    public static final String TAG = "FrescoManger";

    static long getDiskCacheSize(Context context) {


        return 0;
    }


    static void clearMemoryCache(Context context) {

    }


    static void clearDiskCache(Context context) {


    }


    static void clearCache(Context context) {
        clearMemoryCache(context);
        clearDiskCache(context);
    }


    /**
     * Gets cache dir.
     *
     * @param context the context
     * @return 磁盘缓存目录
     */
    static String getCacheDir(Context context) {
        return "";
    }


    /**
     * Pause load image
     *
     * @param context the context
     */
    static void pause(Context context) {

    }


    /**
     * Resume load image
     *
     * @param context the context
     */
    static void resume(Context context) {

    }


    static void onTrimMemory(Context context, int level) {

    }


    static void onLowMemory(Context context) {

    }


    /**
     * Is memory cache boolean.
     *
     * @param context   the context
     * @param url       图片ulr
     * @param imageType url 类型
     * @return the boolean
     */
    static boolean isMemoryCache(Context context, String url, @ImageType int imageType) {
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
    static boolean isDiskCache(Context context, String url, @ImageType int imageType) {
        return false;
    }
}
