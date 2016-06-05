package com.gojek.glideimgix;

import android.content.Context;

import com.bumptech.glide.load.model.GenericLoaderFactory;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;

import java.io.InputStream;

public class ImgixGlideModelLoaderFactory implements ModelLoaderFactory<ImgixUrl, java.io.InputStream> {
    @Override
    public ModelLoader<ImgixUrl, InputStream> build(Context context, GenericLoaderFactory factories) {
        return new ImgixGlideModelLoader(context);
    }

    @Override
    public void teardown() {

    }
}
