package com.aazykj.wojh.app;
import android.app.Application;
import android.content.Context;
import android.widget.ImageView;
import com.aazykj.wojh.R;
import com.aazykj.wojh.utils.W;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by zykj on 2017/5/16.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        W.context=this;
    }
}
