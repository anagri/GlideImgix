package com.gojek.glideimgix;

import android.content.Context;

import com.bumptech.glide.load.model.stream.BaseGlideUrlLoader;

public class ImgixGlideModelLoader extends BaseGlideUrlLoader<ImgixUrl> {
    public ImgixGlideModelLoader(Context context) {
        super(context);
    }

    @Override
    protected String getUrl(ImgixUrl model, int width, int height) {
        return model.getImgixOptimizedUrl(width, height);
    }
}
