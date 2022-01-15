package com.gsls.myapplication.mvp.presenter;

import com.gsls.gt.GT;
import com.gsls.myapplication.all.callback.OnLoginCallback;
import com.gsls.myapplication.all.model.Login_Model;
import com.gsls.myapplication.mvp.Login_Activity;

/**
 * @Author PlayfulKing
 * @Date 2022/1/8 12:04
 * @CSDN https://blog.csdn.net/qq_39799899
 * @GitHub https://github.com/1079374315/GT
 * @Description: 主要负责View数据的 获取 与 赋值
 */
public class Login_Presenter extends GT.Frame.MVP_Presenter<Login_Activity> {

    public Login_Presenter(Login_Activity loginActivity) {
        super(loginActivity);
    }

    //登录业务
    public void login(OnLoginCallback onLoginCallback) {
        Login_Model.loginRequest(bindingView.getLoginBean(), onLoginCallback);
    }

}
