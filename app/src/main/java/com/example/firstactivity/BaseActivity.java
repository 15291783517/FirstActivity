package com.example.firstactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by 王宇飞  on2017/2/26/026.
 */
public class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity",getClass().getSimpleName());
        ActivityCollertor.addActivity(this);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        ActivityCollertor.removeActivity(this);
    }
}
