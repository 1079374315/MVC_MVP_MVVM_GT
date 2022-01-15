package com.gsls.myapplication.all.model;

import com.gsls.gt.GT;
import com.gsls.myapplication.all.bean.LoginBean;
import com.gsls.myapplication.all.bean.SQL_Utils;
import com.gsls.myapplication.all.callback.OnLoginCallback;

/**
 * @Author PlayfulKing
 * @Date 2022/1/15 13:02
 * @CSDN https://blog.csdn.net/qq_39799899
 * @GitHub https://github.com/1079374315/GT
 * @Description: 登录模型
 */
public class Login_Model extends GT.Frame.MVC_Model {

    private final static SQL_Utils sql_utils = new SQL_Utils();

    //登录请求逻辑
    public static void loginRequest(LoginBean loginBean, OnLoginCallback loginCallback) {

        if (sql_utils.queryUserName().equals(loginBean.getUserName()) && sql_utils.queryPassWord().equals(loginBean.getPassWord())) {
            //登录成功
            loginCallback.onSuccess(loginBean);
        } else {
            //登录失败
            loginCallback.onError("账号或密码错误！");
        }
    }

}
