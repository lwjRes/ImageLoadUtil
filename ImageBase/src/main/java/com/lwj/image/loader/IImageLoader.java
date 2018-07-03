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

public interface IImageLoader extends IImageDownLoaderHelper, IImageLoaderManagerHelper {


    void setConverter(ILoadImageUrlConverter urlConverter);

    /**
     * 设置log 等级
     *
     * @param isLog 是否打印日志
     *
     * @see android.util.Log
     */
    void setLog(boolean isLog);

    //----圆形图加载
    void loadImageCircle(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆形图加载
    void loadImageCircle(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆形图带边框加载
    void loadImageCircleWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆形图带边框加载
    void loadImageCircleWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆角图加载
    void loadRoundImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆角图加载
    void loadRoundImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆角图加载带边框
    void loadRoundImageWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //----圆角图加载带边框
    void loadRoundImageWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius);


    //---普通加载
    void loadImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //---普通加载
    void loadImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius);

    //  加载 gif 图

    void loadGifImage(Context context, @ImageType int urlType, ImageView imageView, String url);

    //  加载 gif 图
    void loadGifImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url);


}
