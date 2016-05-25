package me.caiying.emoji;

import android.graphics.Bitmap;

/**
 * Created by caiying on 24/05/2016.
 */
public class Utilities {
    public static volatile DispatchQueue globalQueue = new DispatchQueue("globalQueue");

    public native static void loadBitmap(String path, Bitmap bitmap, int scale, int width, int height, int stride);

    static
    {
        System.loadLibrary("emoji");
    }
}
