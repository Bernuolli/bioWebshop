package com.example.biowebshop;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.Random;

public class AppAsyncLoader extends AsyncTaskLoader<String> {

    public AppAsyncLoader(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();

        forceLoad();
    }

    @Nullable
    @Override
    public String loadInBackground() {
        Random random = new Random();
        int number = random.nextInt(11);
        int ms = number * 300;

        try {
            Thread.sleep(ms);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return "Bejelentkezés vendégként " + ms + "ms után.";
    }
}
