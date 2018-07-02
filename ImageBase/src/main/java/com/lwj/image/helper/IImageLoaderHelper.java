package com.lwj.image.helper;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.lwj.image.download.ILoadImageUrlConverter;
import com.lwj.image.download.ILoadImageUrlConverter.ImageType;
import com.lwj.image.util.ReSize;


/**
 * Created by lwj on 2017/11/14.
 * lwjfork@gmail.com
 */

public interface IImageLoaderHelper {

    void load(ImageView imageView);


    IImageLoaderHelper init(Context context);

    IImageLoaderHelper init(Fragment fragment);

    IImageLoaderHelper withDefaultRes(int defaultRes);


    IImageLoaderHelper withErrorRes(int errorRes);


    IImageLoaderHelper isAnim(boolean isAnim);


    IImageLoaderHelper withCircle();

    IImageLoaderHelper withBorder(int width, int colors);

    IImageLoaderHelper withResize(ReSize resize);


    default IImageLoaderHelper withRound(float radius) {
        return withRound(radius, radius, radius, radius);
    }

    IImageLoaderHelper withRound(float tlradius, float trradius, float brRadius, float blRadius);


    IImageLoaderHelper withUrl(String url, @ImageType int type);

    default IImageLoaderHelper withUrl(String url) {
        return withUrl(url, ILoadImageUrlConverter.NET);
    }

    IImageLoaderHelper isGif(boolean isGif);


    IImageLoaderHelper withBlur(int iterations, int blurRadius);


}
