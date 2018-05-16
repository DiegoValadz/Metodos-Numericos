package com.diego.radious.utilities;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MyAppUtilities {
    public final static int ADD = 1;
    public final static int REPLACE = 2;

    public static void changeFragment(int container, Fragment fragment, Context context, int action, String tag) {
        AppCompatActivity activity = (AppCompatActivity) context;
        switch (action) {
            case ADD:
                activity.getSupportFragmentManager().beginTransaction().add(container, fragment, tag).commit();
                break;
            case REPLACE:
                activity.getSupportFragmentManager().beginTransaction().replace(container, fragment, tag).addToBackStack(null).commit();
                break;
        }
    }
}
