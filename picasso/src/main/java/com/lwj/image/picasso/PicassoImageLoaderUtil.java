package com.lwj.image.picasso;

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

public class PicassoImageLoaderUtil implements IImageLoader {


    private PicassoImageLoaderUtil() {

    }

    private static final PicassoImageLoaderUtil ourInstance = new PicassoImageLoaderUtil();

    public static PicassoImageLoaderUtil getInstance() {
        return ourInstance;
    }

    @Override
    public void loadImageCircle(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadImageCircle(context, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageCircle(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadImageCircle(fragment, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageCircleWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadImageCircleWithBorder(context, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageCircleWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadImageCircleWithBorder(fragment, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadRoundImage(context, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadRoundImage(fragment, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImageWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadRoundImageWithBorder(context, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadRoundImageWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadRoundImageWithBorder(fragment, urlType, imageView, url, defaultImg, errorImg, tlradius, trradius, brRadius, blRadius, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadImage(context, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadImage(fragment, urlType, imageView, url, defaultImg, errorImg, reSize, isAnim, iterations, blurRadius);
    }


    @Override
    public void loadImageWithBorder(Context context, int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadImageWithBorder(context, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadImageWithBorder(Fragment fragment, int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {
        PicassoImageLoader.loadImageWithBorder(fragment, urlType, imageView, url, defaultImg, errorImg, borderWidth, borderColor, reSize, isAnim, iterations, blurRadius);
    }

    @Override
    public void loadGifImage(Context context, @ImageType int urlType, ImageView imageView, String url) {
        PicassoImageLoader.loadGifImage(context, urlType, imageView, url);
    }

    @Override
    public void loadGifImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url) {
        PicassoImageLoader.loadGifImage(fragment, urlType, imageView, url);
    }

    @Override
    public void downLoad(Context context, String url, DownLoadListener listener) {
        PicassoDownLoader.downLoad(context, url, listener);
    }

    @Override
    public void downLoad(Fragment fragment, String url, DownLoadListener listener) {
        PicassoDownLoader.downLoad(fragment, url, listener);
    }

    @Override
    public void downLoad(Context context, String url, DownLoadListener listener, int width, int height) {
        PicassoDownLoader.downLoad(context, url, listener, width, height);
    }

    @Override
    public void downLoad(Fragment fragment, String url, DownLoadListener listener, int width, int height) {
        PicassoDownLoader.downLoad(fragment, url, listener, width, height);
    }

    @Override
    public long getDiskCacheSize(Context context) {
        return PicassoManger.getDiskCacheSize(context);
    }

    @Override
    public void clearMemoryCache(Context context) {
        PicassoManger.clearMemoryCache(context);
    }

    @Override
    public void clearDiskCache(Context context) {
        PicassoManger.clearDiskCache(context);
    }

    @Override
    public void clearCache(Context context) {
        PicassoManger.clearCache(context);
    }

    @Override
    public String getCacheDir(Context context) {
        return PicassoManger.getCacheDir(context);
    }

    @Override
    public void pause(Context context) {
        PicassoManger.pause(context);
    }

    @Override
    public void resume(Context context) {
        PicassoManger.resume(context);
    }

    @Override
    public void onTrimMemory(Context context, int level) {
        PicassoManger.onTrimMemory(context, level);
    }

    @Override
    public void onLowMemory(Context context) {
        PicassoManger.onLowMemory(context);
    }

    @Override
    public boolean isMemoryCache(Context context, String url, int imageType) {
        return PicassoManger.isMemoryCache(context, url, imageType);
    }

    @Override
    public boolean isDiskCache(Context context, String url, int imageType) {
        return PicassoManger.isDiskCache(context, url, imageType);
    }

    @Override
    public String convertFile(String filePath) {
        return PicassoUrlConverter.convertFile(filePath);
    }

    @Override
    public String convertContent(String contentPath) {
        return PicassoUrlConverter.convertContent(contentPath);
    }

    @Override
    public String convertAssets(String assets) {
        return PicassoUrlConverter.convertAssets(assets);
    }

    @Override
    public String convertDrawable(String drawable) {
        return PicassoUrlConverter.convertDrawable(drawable);
    }
}
