package com.oneblue3.la001.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.oneblue3.la001.R;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    private TextView tvLifecycle;

    private void updateLifecycle(String msg) {
        tvLifecycle.setText(msg);
        Log.d(TAG, msg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvLifecycle = findViewById(R.id.tv_lifecycle);
        Button btnSetting = findViewById(R.id.btn_setting);
        btnSetting.setOnClickListener(v -> {
            startActivity(new Intent(this, SettingActivity.class));
        });
        updateLifecycle("onCreate: 主页创建");
        Toast.makeText(this, "主页已创建", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        updateLifecycle("onStart: 主页可见");
        Toast.makeText(this, "主页已可见", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateLifecycle("onResume: 主页获得焦点");
        Toast.makeText(this, "主页已获得焦点", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        updateLifecycle("onPause: 主页失去焦点");
    }

    @Override
    protected void onStop() {
        super.onStop();
        updateLifecycle("onStop: 主页不可见");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        updateLifecycle("onDestroy: 主页被销毁");
    }
}