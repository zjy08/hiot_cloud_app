package com.example.hiot_cloud.test.mvptest;

import com.example.hiot_cloud.test.mvptest.model.User;

public class TestPresenter {

    private com.huatec.hiot_cloud.test.mvptest.TestView view;

    public TestPresenter(com.huatec.hiot_cloud.test.mvptest.TestView view){
        this.view = view;
    }

    public void login(User user){
        if ("zengjiaying".equals(user.getUserName()) && "111".equals(user.getPassword())){
            view.showMessage("登录成功");
        }else{
            view.showMessage("登录失败");
        }
    }
}

