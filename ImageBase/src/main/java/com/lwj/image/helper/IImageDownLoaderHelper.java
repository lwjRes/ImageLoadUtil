package com.lwj.image.helper;

import com.lwj.image.download.DownLoadListener;

/**
 * Created by lwj on 2016/12/30.
 * lwjfork@gmail.com
 * 下载帮助类
 */

public interface IImageDownLoaderHelper {

    /**
     * 下载图片
     *
     * @param url      url 只用网络图片支持下载
     * @param listener 下载监听
     */
    void downLoad(String url, DownLoadListener listener);

    /**
     * 下载图片
     *
     * @param url      url 只用网络图片支持下载
     * @param listener 下载监听
     * @param width    下载图片的宽度
     * @param height   下载图片的高度
     */
    void downLoad(String url, DownLoadListener listener, int width, int height);

}
