package com.diego.radious.aplication;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by diego on 17/02/2018.
 */

public class MyAplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(3000);
    }
}
