package com.gsls.myapplication.mvvm.view_model;

import android.view.View;

import com.gsls.gt.GT;
import com.gsls.myapplication.all.bean.LoginBean;
import com.gsls.myapplication.all.callback.OnLoginCallback;
import com.gsls.myapplication.all.model.Login_Model;
import com.gsls.myapplication.mvvm.Login_ActivityBinding;

/**
 * @Author PlayfulKing
 * @Date 2022/1/8 18:33
 * @CSDN https://blog.csdn.net/qq_39799899
 * @GitHub https://github.com/1079374315/GT
 * @Description:
 */
public class Login_ViewModel extends GT.Frame.MVVM_ViewModel<Login_ActivityBinding> implements View.OnClickListener {

    public Login_ViewModel(Login_ActivityBinding bindingView) {
        super(bindingView);
        bindingView.btn_login.setOnClickListener(this);
    }

    public LoginBean getLoginBean() {
        return new LoginBean(bindingView.et_userName.getText().toString(), bindingView.et_passWord.getText().toString());
    }

    @Override
    public void onClick(View v) {
        Login_Model.loginRequest(getLoginBean(), new OnLoginCallback() {
            @Override
            public void onSuccess(LoginBean loginBean) {
                bindingView.tv_showData.setText("登录成功:" + loginBean);
            }

            @Override
            public void onError(String err) {
                bindingView.tv_showData.setText(err);
            }
        });
    }
}
