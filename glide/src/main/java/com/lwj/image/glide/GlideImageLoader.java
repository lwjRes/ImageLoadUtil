package com.lwj.image.glide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.lwj.image.download.DownLoadListener;
import com.lwj.image.download.ILoadImageUrlConverter;
import com.lwj.image.download.ILoadImageUrlConverter.ImageType;
import com.lwj.image.loader.IImageLoader;
import com.lwj.image.util.ReSize;

/**
 * Created:2018/7/2
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

public class GlideImageLoader implements IImageLoader {

    private ILoadImageUrlConverter urlConverter;


    private GlideImageLoader() {
        setConverter(new GlideUrlConverter());
    }

    private static final GlideImageLoader ourInstance = new GlideImageLoader();

    public static GlideImageLoader getInstance() {
        return ourInstance;
    }

    @Override
    public void setConverter(ILoadImageUrlConverter urlConverter) {
        this.urlConverter = urlConverter;
    }


    private String getRealUrl(String url, @ImageType int type) {
        return urlConverter.convert(type, url);
    }


    @Override
    public void setLog(boolean isLog) {

    }

    @Override
    public void loadImageCircle(Context context,@ImageType  int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadImageCircle(Fragment fragment,@ImageType  int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadImageCircleWithBorder(Context context,@ImageType  int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadImageCircleWithBorder(Fragment fragment,@ImageType  int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadRoundImage(Context context,@ImageType  int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadRoundImage(Fragment fragment,@ImageType  int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadRoundImageWithBorder(Context context,@ImageType  int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadRoundImageWithBorder(Fragment fragment,@ImageType  int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadImage(Context context,@ImageType  int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadImage(Fragment fragment,@ImageType  int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadGifImage(Context context,@ImageType  int urlType, ImageView imageView, String url) {

    }

    @Override
    public void loadGifImage(Fragment fragment,@ImageType  int urlType, ImageView imageView, String url) {

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
}
