package com.gojek.glideimgix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgSplash = (ImageView) findViewById(R.id.img_splash);
        Glide.with(this)
                .load("http://gojek-gomart.imgix.net/gojek_blog_splash_sample.jpg")
                .into(imgSplash);
    }
}
