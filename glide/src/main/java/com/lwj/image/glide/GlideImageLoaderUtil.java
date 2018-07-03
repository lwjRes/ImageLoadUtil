package com.lwj.image.glide;

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

public class GlideImageLoaderUtil implements IImageLoader {


    private GlideImageLoaderUtil() {

    }

    private static final GlideImageLoaderUtil ourInstance = new GlideImageLoaderUtil();

    public static GlideImageLoaderUtil getInstance() {
        return ourInstance;
    }

    @Override
    public void loadImageCircle(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadImageCircle(context, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageCircle(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadImageCircle(fragment, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageCircleWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadImageCircleWithBorder(context, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageCircleWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadImageCircleWithBorder(fragment, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadRoundImage(context, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadRoundImage(fragment, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImageWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadRoundImageWithBorder(context, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImageWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadRoundImageWithBorder(fragment, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadImage(context, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadImage(fragment, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }


    @Override
    public void loadImageWithBorder(Context context, int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadImageWithBorder(context, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageWithBorder(Fragment fragment, int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        GlideImageLoader.loadImageWithBorder(fragment, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadGifImage(Context context, @ImageType int urlType, ImageView imageView, String url) {
        GlideImageLoader.loadGifImage(context, urlType, imageView, url);
    }

    @Override
    public void loadGifImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url) {
        GlideImageLoader.loadGifImage(fragment, urlType, imageView, url);
    }

    @Override
    public void downLoad(Context context, String url, DownLoadListener listener) {
        GlideDownLoader.downLoad(context, url, listener);
    }

    @Override
    public void downLoad(Fragment fragment, String url, DownLoadListener listener) {
        GlideDownLoader.downLoad(fragment, url, listener);
    }

    @Override
    public void downLoad(Context context, String url, DownLoadListener listener, int width, int height) {
        GlideDownLoader.downLoad(context, url, listener, width, height);
    }

    @Override
    public void downLoad(Fragment fragment, String url, DownLoadListener listener, int width, int height) {
        GlideDownLoader.downLoad(fragment, url, listener, width, height);
    }

    @Override
    public long getDiskCacheSize(Context context) {
        return GlideManger.getDiskCacheSize(context);
    }

    @Override
    public void clearMemoryCache(Context context) {
        GlideManger.clearMemoryCache(context);
    }

    @Override
    public void clearDiskCache(Context context) {
        GlideManger.clearDiskCache(context);
    }

    @Override
    public void clearCache(Context context) {
        GlideManger.clearCache(context);
    }

    @Override
    public String getCacheDir(Context context) {
        return GlideManger.getCacheDir(context);
    }

    @Override
    public void pause(Context context) {
        GlideManger.pause(context);
    }

    @Override
    public void resume(Context context) {
        GlideManger.resume(context);
    }

    @Override
    public void onTrimMemory(Context context, int level) {
        GlideManger.onTrimMemory(context, level);
    }

    @Override
    public void onLowMemory(Context context) {
        GlideManger.onLowMemory(context);
    }

    @Override
    public boolean isMemoryCache(Context context, String url, int imageType) {
        return GlideManger.isMemoryCache(context, url, imageType);
    }

    @Override
    public boolean isDiskCache(Context context, String url, int imageType) {
        return GlideManger.isDiskCache(context, url, imageType);
    }

    @Override
    public String convertFile(String filePath) {
        return GlideUrlConverter.convertFile(filePath);
    }

    @Override
    public String convertContent(String contentPath) {
        return GlideUrlConverter.convertContent(contentPath);
    }

    @Override
    public String convertAssets(String assets) {
        return GlideUrlConverter.convertAssets(assets);
    }

    @Override
    public String convertDrawable(String drawable) {
        return GlideUrlConverter.convertDrawable(drawable);
    }
}
