package com.oneblue3.la001.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.oneblue3.la001.R;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private TextView tvLifecycle;

    private void updateLifecycle(String msg) {
        tvLifecycle.setText(msg);
        Log.d(TAG, msg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvLifecycle = findViewById(R.id.tv_lifecycle);
        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(v -> {
            startActivity(new Intent(this, HomeActivity.class));
        });
        updateLifecycle("onCreate: 登录页面创建");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        updateLifecycle("onRestart: 登录页面重新创建");
    }

    @Override
    protected void onStart() {
        super.onStart();
        updateLifecycle("onStart: 登录页面可见");
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateLifecycle("onResume: 登录页面获得焦点");
    }

    @Override
    protected void onPause() {
        super.onPause();
        updateLifecycle("onPause: 登录页面失去焦点");
    }

    @Override
    protected void onStop() {
        super.onStop();
        updateLifecycle("onStop: 登录页面不可见");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        updateLifecycle("onDestroy: 登录页面被销毁");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        updateLifecycle("onSaveInstanceState: 登录页面状态保存");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        updateLifecycle("onRestoreInstanceState: 登录页面状态恢复");
    }
}