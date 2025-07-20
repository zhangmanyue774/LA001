package com.oneblue3.la001.Activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.oneblue3.la001.R;

public class SettingActivity extends AppCompatActivity {
    private static final String TAG = "SettingActivity";
    private TextView tvLifecycle;

    private void updateLifecycle(String msg) {
        tvLifecycle.setText(msg);
        Log.d(TAG, msg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        tvLifecycle = findViewById(R.id.tv_lifecycle);
        updateLifecycle("onCreate: 设置页面创建");
    }

    @Override
    protected void onStart() {
        super.onStart();
        updateLifecycle("onStart: 设置页面可见");
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateLifecycle("onResume: 设置页面获得焦点");
    }

    @Override
    protected void onPause() {
        super.onPause();
        updateLifecycle("onPause: 设置页面失去焦点");
    }

    @Override
    protected void onStop() {
        super.onStop();
        updateLifecycle("onStop: 设置页面不可见");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        updateLifecycle("onDestroy: 设置页面被销毁");
    }
}