package com.gsls.myapplication.mvvm_binding.model;

import com.gsls.gt.GT;
import com.gsls.myapplication.all.bean.LoginBean;
import com.gsls.myapplication.all.bean.SQL_Utils;
import com.gsls.myapplication.all.callback.OnLoginCallback;

/**
 * @Author PlayfulKing
 * @Date 2022/1/8 12:04
 * @CSDN https://blog.csdn.net/qq_39799899
 * @GitHub https://github.com/1079374315/GT
 * @Description: 非静态Model
 */
public class LoginModel<T> extends GT.Frame.GT_Model<T> {

    private SQL_Utils dbUtils;

    public LoginModel() {
        dbUtils = new SQL_Utils();
    }

    public void loginRequest(LoginBean loginBean, OnLoginCallback onLoginCallback) {
        //进行数据库里的数据查询后进行对比
        if (dbUtils.queryUserName().equals(loginBean.getUserName()) && dbUtils.queryPassWord().equals(loginBean.getPassWord())) {
            onLoginCallback.onSuccess(loginBean);
        } else {
            onLoginCallback.onError("账号或密码错误！");
        }
    }


}
