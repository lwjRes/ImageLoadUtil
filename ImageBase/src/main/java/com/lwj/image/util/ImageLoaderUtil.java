package com.lwj.image.util;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.lwj.image.R;
import com.lwj.image.download.DownLoadListener;
import com.lwj.image.download.ILoadImageUrlConverter;
import com.lwj.image.helper.IImageDownLoaderHelper;
import com.lwj.image.helper.IImageLoaderHelper;
import com.lwj.image.helper.IImageLoaderManagerHelper;
import com.lwj.image.loader.IImageLoader;


/**
 * Created by lwj on 2017/11/14.
 * lwjfork@gmail.com
 */

public class ImageLoaderUtil implements IImageLoaderHelper, IImageDownLoaderHelper, IImageLoaderManagerHelper {


    private int defaultRes = R.drawable.default_load_img;

    private int errorRes = R.drawable.error_load_img;

    private int borderColor = Color.WHITE;

    private int borderWidth = 10;


    private float topLeftRadius;
    private float topRightRadius;
    private float bottomRightRadius;
    private float bottomLeftRadius;

    private boolean isCircle = false;

    private boolean isBorder = false;

    private boolean isRound = false;
    private boolean isAnim = true;

    private boolean isGif;

    private int iterations;
    private int blurRadius;
    private boolean isBlur = false;

    private Context context;
    private Fragment fragment;
    private ReSize resize = new ReSize(400, 400);


    private String url;

    @ILoadImageUrlConverter.ImageType
    private int type = ILoadImageUrlConverter.NET;


    private static IImageLoader imageLoader;

    public static ImageLoaderUtil get() {
        if (imageLoader == null) {
            throw new NullPointerException("imageLoader 必须初始化，即通过调用 setLoader 方法初始化！");
        }
        return new ImageLoaderUtil();
    }


    public static void setLoader(IImageLoader imageLoader) {
        ImageLoaderUtil.imageLoader = imageLoader;
    }


    private ImageLoaderUtil() {
    }


    @Override
    public void load(ImageView imageView) {
        if (isCircle) {
            loadCircle(imageView);
            return;
        }
        if (isRound) {
            loadRound(imageView);
            return;
        }

        if (isGif) {
            loadGif(imageView);
            return;
        }
        loadImage(imageView);
    }


    /**
     * 圆形图
     *
     * @param imageView target
     */
    private void loadCircle(ImageView imageView) {
        if (!isBlur) { // 高斯模糊
            iterations = 0;
            blurRadius = 0;
        }
        if (isBorder) { // 带边框
            if (context != null) {
                imageLoader.loadImageCircleWithBorder(context, type, imageView, url, borderWidth, borderColor, defaultRes, errorRes, resize, isAnim, iterations, blurRadius);
            } else if (fragment != null) {
                imageLoader.loadImageCircleWithBorder(fragment, type, imageView, url, borderWidth, borderColor, defaultRes, errorRes, resize, isAnim, iterations, blurRadius);
            }
        } else {  // 不带边框
            if (context != null) {
                imageLoader.loadImageCircle(context, type, imageView, url, defaultRes, errorRes, resize, isAnim, iterations, blurRadius);
            } else if (fragment != null) {
                imageLoader.loadImageCircle(fragment, type, imageView, url, defaultRes, errorRes, resize, isAnim, iterations, blurRadius);
            }

        }
    }

    /**
     * 圆角图加载
     *
     * @param imageView target
     */
    private void loadRound(ImageView imageView) {
        if (!isBlur) { // 高斯模糊
            iterations = 0;
            blurRadius = 0;
        }
        if (isBorder) {

            if (context != null) {
                imageLoader.loadRoundImageWithBorder(context, type, imageView, url, defaultRes, errorRes, topLeftRadius, topRightRadius, bottomRightRadius, bottomLeftRadius, borderWidth, borderColor, resize, isAnim, iterations, blurRadius);
            } else if (fragment != null) {
                imageLoader.loadRoundImageWithBorder(fragment, type, imageView, url, defaultRes, errorRes, topLeftRadius, topRightRadius, bottomRightRadius, bottomLeftRadius, borderWidth, borderColor, resize, isAnim, iterations, blurRadius);
            }
        } else {

            if (context != null) {
                imageLoader.loadRoundImage(context, type, imageView, url, defaultRes, errorRes, topLeftRadius, topRightRadius, bottomRightRadius, bottomLeftRadius, resize, isAnim, iterations, blurRadius);
            } else if (fragment != null) {
                imageLoader.loadRoundImage(fragment, type, imageView, url, defaultRes, errorRes, topLeftRadius, topRightRadius, bottomRightRadius, bottomLeftRadius, resize, isAnim, iterations, blurRadius);
            }
        }


    }

    /**
     * gif 图加载
     *
     * @param imageView target
     */
    private void loadGif(ImageView imageView) {
        if (!isBlur) { // 高斯模糊
            iterations = 0;
            blurRadius = 0;
        }
        if (context != null) {
            imageLoader.loadGifImage(context, type, imageView, url);
        } else if (fragment != null) {
            imageLoader.loadGifImage(fragment, type, imageView, url);
        }
    }

    /**
     * 普通图加载
     *
     * @param imageView target
     */
    private void loadImage(ImageView imageView) {
        // 普通图加载

        if (!isBlur) { // 高斯模糊
            iterations = 0;
            blurRadius = 0;
        }
        if (context != null) {
            imageLoader.loadImage(context, type, imageView, url, defaultRes, errorRes, resize, isAnim, iterations, blurRadius);
        } else if (fragment != null) {
            imageLoader.loadImage(fragment, type, imageView, url, defaultRes, errorRes, resize, isAnim, iterations, blurRadius);
        }
    }


    @Override
    public IImageLoaderHelper init(Context context) {
        this.context = context;
        return this;
    }

    @Override
    public IImageLoaderHelper init(Fragment fragment) {
        this.fragment = fragment;
        return this;
    }


    @Override
    public IImageLoaderHelper withDefaultRes(int defaultRes) {
        this.defaultRes = defaultRes;
        return this;
    }


    @Override
    public IImageLoaderHelper withErrorRes(int errorRes) {
        this.errorRes = errorRes;
        return this;
    }


    @Override
    public IImageLoaderHelper withCircle() {
        this.isBorder = false;
        this.isCircle = true;
        this.isRound = false;
        return this;
    }

    @Override
    public IImageLoaderHelper withBorder(int width, int colors) {
        this.isBorder = true;
        this.borderWidth = width;
        this.borderColor = colors;
        return this;
    }

    @Override
    public IImageLoaderHelper withResize(ReSize resize) {
        this.resize = resize;
        return this;
    }


    @Override
    public IImageLoaderHelper withRound(float topLeftRadius, float topRightRadius, float bottomRightRadius, float bottomLeftRadius) {
        this.isBorder = false;
        this.isCircle = false;
        this.isRound = true;
        this.topLeftRadius = topLeftRadius;
        this.topRightRadius = topRightRadius;
        this.bottomRightRadius = bottomRightRadius;
        this.bottomLeftRadius = bottomLeftRadius;
        return this;
    }

    @Override
    public IImageLoaderHelper isAnim(boolean isAnim) {
        this.isAnim = isAnim;
        return this;
    }

    @Override
    public IImageLoaderHelper withUrl(String url, int type) {
        this.url = url;
        this.type = type;
        return this;
    }


    @Override
    public IImageLoaderHelper isGif(boolean isGif) {
        this.isGif = isGif;
        return this;
    }

    @Override
    public IImageLoaderHelper withBlur(int iterations, int blurRadius) {
        this.isBlur = true;
        this.iterations = iterations;
        this.blurRadius = blurRadius;
        return this;
    }


    @Override
    public long getDiskCacheSize(Context context) {
        return imageLoader.getDiskCacheSize(context);
    }

    @Override
    public void clearMemoryCache(Context context) {
        imageLoader.clearMemoryCache(context);
    }


    @Override
    public void clearDiskCache(Context context) {
        imageLoader.clearDiskCache(context);
    }

    @Override
    public void clearCache(Context context) {
        imageLoader.clearCache(context);
    }

    @Override
    public String getCacheDir(Context context) {
        return imageLoader.getCacheDir(context);
    }

    @Override
    public void pause(Context context) {
        imageLoader.pause(context);
    }


    @Override
    public void resume(Context context) {
        imageLoader.resume(context);
    }

    @Override
    public void onTrimMemory(Context context, int level) {
        imageLoader.onTrimMemory(context, level);
    }

    @Override
    public void onLowMemory(Context context) {
        imageLoader.onLowMemory(context);
    }

    @Override
    public boolean isMemoryCache(Context context, String url, int imageType) {
        return imageLoader.isMemoryCache(context, url, imageType);
    }

    @Override
    public boolean isDiskCache(Context context, String url, int imageType) {
        return imageLoader.isDiskCache(context, url, imageType);
    }

    @Override
    public void downLoad(Context context, String url, DownLoadListener listener) {
        imageLoader.downLoad(context, url, listener);
    }

    @Override
    public void downLoad(Fragment fragment, String url, DownLoadListener listener) {
        imageLoader.downLoad(fragment, url, listener);
    }

    @Override
    public void downLoad(Context context, String url, DownLoadListener listener, int width, int height) {
        imageLoader.downLoad(context, url, listener, width, height);
    }

    @Override
    public void downLoad(Fragment fragment, String url, DownLoadListener listener, int width, int height) {
        imageLoader.downLoad(fragment, url, listener, width, height);
    }
}
