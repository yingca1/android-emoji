package me.caiying.emoji;

import android.app.Application;

/**
 * Created by caiying on 25/05/2016.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Emoji.init(this, false);
    }
}
