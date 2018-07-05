package com.lwj.image.glide;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.util.Util;
import com.lwj.image.helper.BaseImageLoaderManager;
import com.lwj.image.util.LogUtil;
import com.lwj.image.download.ILoadImageUrlConverter.ImageType;

/**
 * The type Glide manger.
 */
public class GlideManger extends BaseImageLoaderManager {


    private final String TAG = "GlideManger";


    public GlideManger(Context context) {
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

        if (Util.isOnMainThread()) {
            Glide.get(context).clearMemory();
        } else {
            LogUtil.e(TAG, "必须在主线程里清除内存缓存！");
        }
    }


    @Override
    public void clearDiskCache(Context context) {
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
        Glide.with(context).pauseRequests();
    }


    /**
     * Resume load image
     *
     * @param context the context
     */
    @Override
    public void resume(Context context) {
        if (Glide.with(context).isPaused()) {
            Glide.with(context).resumeRequests();
        }
    }


    @Override
    public void onTrimMemory(Context context, int level) {
        Glide.get(context).onTrimMemory(level);
    }


    @Override
    public void onLowMemory(Context context) {
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
