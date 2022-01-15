package com.gsls.myapplication.mvvm_binding.view_model;

import android.view.View;

import com.gsls.gt.GT;
import com.gsls.myapplication.all.bean.LoginBean;
import com.gsls.myapplication.all.callback.OnLoginCallback;
import com.gsls.myapplication.mvvm_binding.model.LoginModel;
import com.gsls.myapplication.mvvm_binding.view.LoginActivityBinding;

/**
 * @Author PlayfulKing
 * @Date 2022/1/8 18:33
 * @CSDN https://blog.csdn.net/qq_39799899
 * @GitHub https://github.com/1079374315/GT
 * @Description:
 */
public class LoginViewModel extends GT.Frame.GT_BindingViewModel<LoginActivityBinding, LoginModel> implements View.OnClickListener, OnLoginCallback {

    public LoginViewModel(LoginActivityBinding bindingData) {
        super(bindingData);
        bindingView.btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        bindingModel.loginRequest(getLoginBean(), this);//非静态-登录业务
//        Login_Model.loginRequest(getLoginBean(), this);//静态-登录业务
    }

    public LoginBean getLoginBean() {
        return new LoginBean(bindingView.et_userName.getText().toString(), bindingView.et_passWord.getText().toString());
    }

    @Override
    public void onSuccess(LoginBean loginBean) {
        bindingView.tv_showData.setText("登录成功:" + loginBean);
    }

    @Override
    public void onError(String err) {
        bindingView.tv_showData.setText(err);
    }
}
