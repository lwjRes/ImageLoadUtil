package com.lwj.image.helper;

import android.content.Context;

/**
 * Created by lwj on 2016/12/30.
 * lwjfork@gmail.com
 * 管理帮助类
 */

public interface IImageLoaderManagerHelper {



    //  获取硬盘缓存大小
    long getDiskCacheSize(Context context);

    //  清除内存缓存
    void clearMemoryCache(Context context);

    // 清除硬盘缓存
    void clearDiskCache(Context context);

    // 清除硬盘缓存／内存缓存
    void clearCache(Context context);

    // 获取缓存目录
    String getCacheDir(Context context);

    // 暂停请求
    void pause(Context context);

    //  恢复请求
    void resume(Context context);

    // 不同的内存策略
    void onTrimMemory(Context context, int level);

    // 低内存情况下
    void onLowMemory(Context context);

    /**
     * 判断该 url 是否在内存缓存中
     *
     * @param url       url
     * @param imageType url 类型
     * @return true 在，false 不在
     */
    boolean isMemoryCache(Context context, String url, int imageType);

    /**
     * 判断该 url 的图片是否在硬盘缓存中
     *
     * @param url
     * @param imageType
     * @return true 在，false 不在
     */
    boolean isDiskCache(Context context, String url, int imageType);


}
