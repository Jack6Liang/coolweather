package com.ljk.coolweather.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by LJK on 2016/7/31.
 */
public class BaseActivity extends AppCompatActivity {
    /**
     * 设置activity的基础类
     * 变量可以在这里设置 (所有活动都可以继承)
     */
        public static final String TAG="tag";
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        /**
         *用于所有活动测试
         */
        public void toast(String msg){
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
            Log.d(TAG, msg);
        }
}
