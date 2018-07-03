package com.lwj.image.loader;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.lwj.image.download.ILoadImageUrlConverter;
import com.lwj.image.download.ILoadImageUrlConverter.ImageType;
import com.lwj.image.helper.IImageDownLoaderHelper;
import com.lwj.image.helper.IImageLoaderManagerHelper;
import com.lwj.image.util.ReSize;


/**
 * Created by lwj on 2016/12/30.
 * lwjfork@gmail.com
 */

public abstract class AImageLoader {


    protected ILoadImageUrlConverter urlConverter;

    public AImageLoader(ILoadImageUrlConverter urlConverter) {
        this.urlConverter = urlConverter;
    }

    //----圆形图加载
    public abstract void loadImageCircle(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆形图加载
    public abstract void loadImageCircle(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆形图带边框加载
    public abstract void loadImageCircleWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆形图带边框加载
    public abstract void loadImageCircleWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆角图加载
    public abstract void loadRoundImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆角图加载
    public abstract void loadRoundImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆角图加载带边框
    public abstract void loadRoundImageWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆角图加载带边框
    public abstract void loadRoundImageWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius);


    //---普通加载
    public abstract void loadImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //---普通加载
    public abstract void loadImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //---普通加载加边框
    public abstract void loadImageWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //---普通加载加边框
    public abstract void loadImageWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius);


    //  加载 gif 图

    public abstract void loadGifImage(Context context, @ImageType int urlType, ImageView imageView, String url);

    //  加载 gif 图
    public abstract void loadGifImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url);


}
