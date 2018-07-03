package com.lwj.image.picasso;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.lwj.image.download.DownLoadListener;

/**
 * Created:2018/7/2
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

abstract class PicassoDownLoader {
    public PicassoDownLoader() {
        throw new AbstractMethodError("PicassoUrlConverter can't init!");
    }

    static void downLoad(Context context, String url, DownLoadListener listener) {

    }


    static void downLoad(Fragment fragment, String url, DownLoadListener listener) {

    }


    static void downLoad(Context context, String url, DownLoadListener listener, int width, int height) {

    }


    static void downLoad(Fragment fragment, String url, DownLoadListener listener, int width, int height) {

    }


}
