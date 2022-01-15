package com.gsls.myapplication.all.callback;


import com.gsls.myapplication.all.bean.LoginBean;

/**
 * author：hello
 * time：2020/7/30
 * CSDN： qq_39799899
 * explain：
 **/
public interface OnLoginCallback {
    void onSuccess(LoginBean loginBean);

    void onError(String err);
}
