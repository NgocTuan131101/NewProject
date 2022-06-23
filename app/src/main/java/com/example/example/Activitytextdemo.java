package com.example.example;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

public class Activitytextdemo extends AppCompatActivity {
    private final String TAG = getClass().getSimpleName();
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate: ");
        setContentView(R.layout.activity_demotest);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart():  ");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume: ");
    }
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onPause: ");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"onRestart: ");
    }
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"onPause: ");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy: ");
    }
}
