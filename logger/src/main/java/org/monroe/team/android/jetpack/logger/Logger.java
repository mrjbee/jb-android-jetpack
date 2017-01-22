package org.monroe.team.android.jetpack.logger;

import android.util.Log;

public class Logger {

    private final String tag;

    public Logger(String tag) {
        this.tag = tag;
    }

    public void i(String message){
        Log.i(tag, message);
    }

    public void w(String message){
        Log.w(tag, message);
    }

    public void w(String message, Throwable throwable){
        Log.w(tag, message, throwable);
    }

    public void e(String message){
        Log.e(tag, message);
    }

    public void e(String message, Throwable throwable){
        Log.e(tag, message, throwable);
    }
}
