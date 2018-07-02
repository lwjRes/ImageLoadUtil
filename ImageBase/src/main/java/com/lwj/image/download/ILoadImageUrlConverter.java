package com.lwj.image.download;

import android.support.annotation.IntDef;

/**
 * Created by lwj on 2017/9/20.
 * lwjfork@gmail.com
 */


public interface ILoadImageUrlConverter {


    int NET = 1;
    int FILE = 1 + NET;
    int CONTENT = 1 + FILE;
    int ASSETS = 1 + CONTENT;
    int DRAWABLE = 1 + ASSETS;

    @IntDef({FILE, NET, CONTENT, ASSETS, DRAWABLE})
    @interface ImageType {
    }


    String convertNetUrl(String url);

    String convertFile(String filePath);

    String convertContent(String contentPath);

    String convertAssets(String assets);

    String convertDrawable(String drawable);

    default String convert(@ImageType int type, String url) {
        switch (type) {
            case NET:
                return convertNetUrl(url);
            case FILE:
                return convertFile(url);
            case CONTENT:
                return convertContent(url);
            case ASSETS:
                return convertAssets(url);
            case DRAWABLE:
                return convertDrawable(url);
            default:
                return convertNetUrl(url);

        }


    }


}
