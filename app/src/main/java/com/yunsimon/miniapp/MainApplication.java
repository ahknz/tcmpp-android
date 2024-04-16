package com.yunsimon.miniapp;

import android.app.Application;
import android.util.Log;

public class MainApplication extends Application {

    public static Application mApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }
}
