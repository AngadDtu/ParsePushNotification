package com.example.dell.sampleparseapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;

/**
 * Created by DELL on 16-11-2015.
 */
public class parsepush extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "app ID", "profile Id");
        ParseInstallation.getCurrentInstallation().saveInBackground();

    }
}
