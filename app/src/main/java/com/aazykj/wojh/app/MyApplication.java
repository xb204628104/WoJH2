package com.aazykj.wojh.app;

import android.app.Application;

import com.aazykj.wojh.utils.W;

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
