package com.gsls.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.gsls.myapplication.mvvm_binding.view.LoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_gt_mvc).setOnClickListener(this);
        findViewById(R.id.btn_gt_mvp).setOnClickListener(this);
        findViewById(R.id.btn_gt_mvvm).setOnClickListener(this);
        findViewById(R.id.btn_gt_mvvm_gt).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_gt_mvc:
                startActivity(new Intent(MainActivity.this, com.gsls.myapplication.mvc.Login_Activity.class));
                break;
            case R.id.btn_gt_mvp:
                startActivity(new Intent(MainActivity.this, com.gsls.myapplication.mvp.Login_Activity.class));
                break;
            case R.id.btn_gt_mvvm:
                startActivity(new Intent(MainActivity.this, com.gsls.myapplication.mvvm.Login_Activity.class));
                break;
            case R.id.btn_gt_mvvm_gt:
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;

        }
    }

}