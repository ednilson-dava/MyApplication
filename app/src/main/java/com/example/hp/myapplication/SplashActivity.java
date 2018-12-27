package com.example.hp.myapplication;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SplashAsyncTask splashAsyncTask = new SplashAsyncTask(this);
        try {
            splashAsyncTask.execute(new URL("http://localhost:8080/frango"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static final String MESSAGE = "MSG_SPLASH";
}
