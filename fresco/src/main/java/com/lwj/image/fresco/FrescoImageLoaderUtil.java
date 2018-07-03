package com.lwj.image.fresco;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.lwj.image.download.DownLoadListener;
import com.lwj.image.loader.IImageLoader;
import com.lwj.image.util.ReSize;

/**
 * Created:2018/7/2
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public class FrescoImageLoaderUtil implements IImageLoader {


    private FrescoImageLoaderUtil() {

    }

    private static final FrescoImageLoaderUtil ourInstance = new FrescoImageLoaderUtil();

    public static FrescoImageLoaderUtil getInstance() {
        return ourInstance;
    }

    @Override
    public void loadImageCircle(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadImageCircle(context, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageCircle(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadImageCircle(fragment, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageCircleWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadImageCircleWithBorder(context, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageCircleWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadImageCircleWithBorder(fragment, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadRoundImage(context, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadRoundImage(fragment, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImageWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadRoundImageWithBorder(context, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImageWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadRoundImageWithBorder(fragment, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadImage(context, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadImage(fragment, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }


    @Override
    public void loadImageWithBorder(Context context, int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadImageWithBorder(context, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageWithBorder(Fragment fragment, int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        FrescoImageLoader.loadImageWithBorder(fragment, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadGifImage(Context context, @ImageType int urlType, ImageView imageView, String url) {
        FrescoImageLoader.loadGifImage(context, urlType, imageView, url);
    }

    @Override
    public void loadGifImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url) {
        FrescoImageLoader.loadGifImage(fragment, urlType, imageView, url);
    }

    @Override
    public void downLoad(Context context, String url, DownLoadListener listener) {
        FrescoDownLoader.downLoad(context, url, listener);
    }

    @Override
    public void downLoad(Fragment fragment, String url, DownLoadListener listener) {
        FrescoDownLoader.downLoad(fragment, url, listener);
    }

    @Override
    public void downLoad(Context context, String url, DownLoadListener listener, int width, int height) {
        FrescoDownLoader.downLoad(context, url, listener, width, height);
    }

    @Override
    public void downLoad(Fragment fragment, String url, DownLoadListener listener, int width, int height) {
        FrescoDownLoader.downLoad(fragment, url, listener, width, height);
    }

    @Override
    public long getDiskCacheSize(Context context) {
        return FrescoManger.getDiskCacheSize(context);
    }

    @Override
    public void clearMemoryCache(Context context) {
        FrescoManger.clearMemoryCache(context);
    }

    @Override
    public void clearDiskCache(Context context) {
        FrescoManger.clearDiskCache(context);
    }

    @Override
    public void clearCache(Context context) {
        FrescoManger.clearCache(context);
    }

    @Override
    public String getCacheDir(Context context) {
        return FrescoManger.getCacheDir(context);
    }

    @Override
    public void pause(Context context) {
        FrescoManger.pause(context);
    }

    @Override
    public void resume(Context context) {
        FrescoManger.resume(context);
    }

    @Override
    public void onTrimMemory(Context context, int level) {
        FrescoManger.onTrimMemory(context, level);
    }

    @Override
    public void onLowMemory(Context context) {
        FrescoManger.onLowMemory(context);
    }

    @Override
    public boolean isMemoryCache(Context context, String url, int imageType) {
        return FrescoManger.isMemoryCache(context, url, imageType);
    }

    @Override
    public boolean isDiskCache(Context context, String url, int imageType) {
        return FrescoManger.isDiskCache(context, url, imageType);
    }

    @Override
    public String convertFile(String filePath) {
        return FrescoUrlConverter.convertFile(filePath);
    }

    @Override
    public String convertContent(String contentPath) {
        return FrescoUrlConverter.convertContent(contentPath);
    }

    @Override
    public String convertAssets(String assets) {
        return FrescoUrlConverter.convertAssets(assets);
    }

    @Override
    public String convertDrawable(String drawable) {
        return FrescoUrlConverter.convertDrawable(drawable);
    }
}
