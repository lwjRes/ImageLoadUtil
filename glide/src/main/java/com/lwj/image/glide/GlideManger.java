package com.lwj.image.glide;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.util.Util;
import com.lwj.image.util.LogUtil;
import com.lwj.image.download.ILoadImageUrlConverter.ImageType;

/**
 * The type Glide manger.
 */
class GlideManger {

    public static final String TAG = "GlideManger";

    static long getDiskCacheSize(Context context) {


        return 0;
    }


    static void clearMemoryCache(Context context) {

        if (Util.isOnMainThread()) {
            Glide.get(context).clearMemory();
        } else {
            LogUtil.e(TAG, "必须在主线程里清除内存缓存！");
        }
    }


    static void clearDiskCache(Context context) {
        if (Util.isOnBackgroundThread()) {
            Glide.get(context).clearDiskCache();
        } else {
            new Thread() {
                @Override
                public void run() {
                    super.run();
                    Glide.get(context).clearDiskCache();
                }
            }.start();


        }

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
        Glide.with(context).pauseRequests();
    }


    /**
     * Resume load image
     *
     * @param context the context
     */
    static void resume(Context context) {
        if (Glide.with(context).isPaused()) {
            Glide.with(context).resumeRequests();
        }
    }


    static void onTrimMemory(Context context, int level) {
        Glide.get(context).onTrimMemory(level);
    }


    static void onLowMemory(Context context) {
        Glide.get(context).onLowMemory();
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
