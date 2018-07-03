package com.lwj.image.fresco;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.lwj.image.download.ILoadImageUrlConverter;
import com.lwj.image.download.ILoadImageUrlConverter.ImageType;
import com.lwj.image.loader.AImageLoader;
import com.lwj.image.util.ReSize;

/**
 * Created by lwj on 2018/7/3.
 * lwjfork@gmail.com
 */

public class FrescoImageLoader extends AImageLoader {

    public FrescoImageLoader(ILoadImageUrlConverter urlConverter) {
        super(urlConverter);
    }

    public FrescoImageLoader() {
        this(new FrescoUrlConverter());
    }

    @Override
    public void loadImageCircle(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadImageCircle(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    @Override
    public void loadImageCircleWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    @Override
    public void loadImageCircleWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    @Override
    public void loadRoundImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    @Override
    public void loadRoundImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }

    @Override
    public void loadRoundImageWithBorder(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    @Override
    public void loadRoundImageWithBorder(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, float tlradius, float trradius, float brRadius, float blRadius, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    @Override
    public void loadImage(Context context, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    @Override
    public void loadImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url, int defaultImg, int errorImg, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    @Override
    public void loadImageWithBorder(Context context, int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    @Override
    public void loadImageWithBorder(Fragment fragment, int urlType, ImageView imageView, String url, int defaultImg, int errorImg, int borderWidth, int borderColor, ReSize reSize, boolean isAnim, int iterations, int blurRadius) {

    }


    @Override
    public void loadGifImage(Context context, @ImageType int urlType, ImageView imageView, String url) {

    }


    @Override
    public void loadGifImage(Fragment fragment, @ImageType int urlType, ImageView imageView, String url) {

    }


}
