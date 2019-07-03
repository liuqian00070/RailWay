package com.example.test;

import android.app.Application;
import android.content.Context;

/**
 * @classname：TextApplication
 * @author：liujiyuan
 * @date：2019-07-02 18:46
 * @description：
 */
public class TestApplication extends Application {

    private static TestApplication instance;

    public static TestApplication getInstance() {
        return instance;
    }

    public static Context getContext() {
        return instance.getApplicationContext();
    }
}
