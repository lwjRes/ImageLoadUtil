package com.lwj.image.fresco;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.lwj.image.download.ILoadImageUrlConverter.ImageType;
import com.lwj.image.util.ReSize;

/**
 * Created by lwj on 2018/7/3.
 * lwjfork@gmail.com
 */

abstract class FrescoImageLoader {

    public FrescoImageLoader() {
        throw new AbstractMethodError("FrescoImageLoader can't init!");
    }

    static void loadImageCircle(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    static void loadImageCircle(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    static void loadImageCircleWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    static void loadImageCircleWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    static void loadRoundImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    static void loadRoundImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    static void loadRoundImageWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    static void loadRoundImageWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    static void loadImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    static void loadImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    static void loadImageWithBorder(Context context, int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    static void loadImageWithBorder(Fragment fragment, int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    static void loadGifImage(Context context, @ImageType int urlType, ImageView imageView, String url) {

    }


    static void loadGifImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url) {

    }


}
