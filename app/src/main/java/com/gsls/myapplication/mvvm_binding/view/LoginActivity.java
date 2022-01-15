package com.gsls.myapplication.mvvm_binding.view;

import android.os.Bundle;

import com.gsls.gt.GT;
import com.gsls.gt_databinding.annotation.DataBinding;
import com.gsls.myapplication.R;
import com.gsls.myapplication.mvvm_binding.view_model.LoginViewModel;

/**
 * @Author PlayfulKing
 * @Date 2022/1/15 13:24
 * @CSDN https://blog.csdn.net/qq_39799899
 * @GitHub https://github.com/1079374315/GT
 * @Description:
 */
@GT.Annotations.GT_AnnotationActivity(R.layout.activity_login)//加载布局
@DataBinding(setLayout = "activity_login", setBindingType = DataBinding.Activity)//使用 GT-DataBinding 映射自动生成 绑定类
public class LoginActivity extends LoginActivityBinding {//继承 GT-DataBinding 自动生成的 LoginActivityBinding 类

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        new LoginViewModel(this);//初始化 ViewModel
    }
}