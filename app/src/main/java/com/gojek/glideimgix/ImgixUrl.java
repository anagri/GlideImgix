package com.gojek.glideimgix;

import java.util.Locale;

public class ImgixUrl {
    private final String url;

    public ImgixUrl(String url) {
        this.url = url;
    }

    public String getImgixOptimizedUrl(int width, int height) {
        return String.format(Locale.US, "%s?w=%d&h=%d", url, width, height);
    }
}
