package com.example.hp.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import java.net.URL;

public class SplashAsyncTask extends AsyncTask<URL, Integer, String> {
    private SplashActivity mSplashActivity;

    public SplashAsyncTask(SplashActivity splashActivity) {
        this.mSplashActivity = splashActivity;
    }

    @Override
    protected String doInBackground(final URL... urls) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Ola Cliente";
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String message) {
        Context mContext = mSplashActivity.getBaseContext();
        Bundle bundle = new Bundle();
        bundle.putString(SplashActivity.MESSAGE, message);
        Intent intent = new Intent(mContext, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent, bundle);
        mSplashActivity.finish();
    }
}
