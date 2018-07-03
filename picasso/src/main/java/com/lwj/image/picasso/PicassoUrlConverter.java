package com.lwj.image.picasso;

/**
 * Created:2018/7/2
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

 abstract class PicassoUrlConverter {

     PicassoUrlConverter() {
        throw new AbstractMethodError("PicassoUrlConverter can't init!");
    }

     static String convertNetUrl(String url) {
        return url;
    }

     static String convertFile(String filePath) {
        return filePath;
    }


     static String convertContent(String contentPath) {
        return null;
    }


     static String convertAssets(String assets) {
        return "file:///android_asset/" + assets;
    }


     static String convertDrawable(String drawable) {
        return drawable;
    }
}
