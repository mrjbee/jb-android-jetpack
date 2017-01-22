package org.monroe.team.android.jetpack.logger;

import android.util.Log;

public class Logger {

    private final String tag;

    public Logger(String tag) {
        this.tag = tag;
    }

    public void i(String message){
        Log.i(tag, bake_message(message));
    }

    private String bake_message(String message) {
        return "["+Thread.currentThread().getName()+":"+Thread.currentThread().getId()+"]" + message;
    }

    public void w(String message){
        Log.w(tag, bake_message(message));
    }

    public void w(String message, Throwable throwable){
        Log.w(tag, bake_message(message), throwable);
    }

    public void e(String message){
        Log.e(tag, bake_message(message));
    }

    public void e(String message, Throwable throwable){
        Log.e(tag, bake_message(message), throwable);
    }
}
