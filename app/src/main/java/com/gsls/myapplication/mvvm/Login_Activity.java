package com.gsls.myapplication.mvvm;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.gsls.gt.GT;
import com.gsls.gt_databinding.annotation.DataBinding;
import com.gsls.myapplication.R;
import com.gsls.myapplication.mvvm.view_model.Login_ViewModel;

/**
 * @Author PlayfulKing
 * @Date 2022/1/15 13:24
 * @CSDN https://blog.csdn.net/qq_39799899
 * @GitHub https://github.com/1079374315/GT
 * @Description:
 */
@DataBinding(setLayout = "activity_login", setBindingType = DataBinding.Activity)//使用 GT-DataBinding
public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Login_ActivityBinding binding = GT.DataBindingUtil.setContentView(this);
        Login_ViewModel viewModel = new Login_ViewModel(binding);
    }

}