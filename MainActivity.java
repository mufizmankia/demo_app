package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate","onCreate is Called...");
    }

    @Override
    protected void onStart() {
        super.onStart();
    Log.e("onStart","onStart is Called...");
    }

    @Override
    protected void onPause() {
        super.onPause();
    Log.e("onPause","onPause is Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
    Log.e("onResume","onResume is Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
    Log.e("onStop","onStop is Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    Log.e("onRestart","onRestart is Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy","onDestroy is Called");
    }
}