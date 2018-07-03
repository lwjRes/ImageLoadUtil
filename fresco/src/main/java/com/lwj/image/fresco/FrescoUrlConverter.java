package com.lwj.image.fresco;

/**
 * Created:2018/7/2
 * User：liuwenjie
 * Email:liuwnejie180423@credithc.com
 * Des:
 * ====================
 */

 abstract class FrescoUrlConverter {

     FrescoUrlConverter() {
        throw new AbstractMethodError("FrescoUrlConverter can't init!");
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
