package com.gsls.myapplication.mvc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gsls.myapplication.R;
import com.gsls.myapplication.all.bean.LoginBean;
import com.gsls.myapplication.all.callback.OnLoginCallback;
import com.gsls.myapplication.all.model.Login_Model;


public class Login_Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_showData;
    public EditText et_userName;
    public EditText et_passWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv_showData = findViewById(R.id.tv_showData);
        et_userName = findViewById(R.id.et_userName);
        et_passWord = findViewById(R.id.et_passWord);
        findViewById(R.id.btn_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Login_Model.loginRequest(getLoginData(), new OnLoginCallback() {
            @Override
            public void onSuccess(LoginBean loginBean) {
                tv_showData.setText("登录成功:" + loginBean.toString());
            }

            @Override
            public void onError(String err) {
                tv_showData.setText(err);
            }
        });
    }

    //获取登录数据
    public LoginBean getLoginData() {
        String userName = et_userName.getText().toString();
        String passWord = et_passWord.getText().toString();
        return new LoginBean(userName, passWord);
    }

}