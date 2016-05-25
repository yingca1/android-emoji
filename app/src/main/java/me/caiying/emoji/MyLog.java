package me.caiying.emoji;

import android.util.Log;

/**
 * Created by caiying on 24/05/2016.
 */
public class MyLog {
    public static void d(String tag, String message) {
        Log.d(tag, message);
    }

    public static void i(String tag, String message) {
        Log.i(tag, message);
    }

    public static void w(String tag, String message) {
        Log.w(tag, message);
    }

    public static void e(String tag, String message) {
        Log.e(tag, message);
    }
}
