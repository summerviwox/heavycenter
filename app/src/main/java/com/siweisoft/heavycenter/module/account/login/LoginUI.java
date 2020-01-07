package com.siweisoft.heavycenter.module.account.login;

import android.text.TextUtils;

import com.blankj.utilcode.util.EncryptUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.reflect.TypeToken;
import com.siweisoft.heavycenter.data.locd.LocalValue;
import com.siweisoft.heavycenter.data.netd.acct.login.LoginReqBean;
import com.siweisoft.heavycenter.data.netd.acct.login.LoginResBean;
import com.siweisoft.heavycenter.databinding.FragAcctLoginBinding;
import com.summer.x.base.ui.UI;

import cn.jpush.android.api.JPushInterface;

public class LoginUI extends UI <FragAcctLoginBinding>{


    public void initUI() {
        if(!TextUtils.isEmpty(SPUtils.getInstance().getString(LocalValue.LOGIN_REQ))){
            LoginReqBean loginReqBean = GsonUtils.fromJson(SPUtils.getInstance().getString(LocalValue.LOGIN_REQ),LoginReqBean.class);
            getUI().phone.getEditText().setText(loginReqBean.getTel());
            getUI().pwd.getEditText().setText(loginReqBean.getInputPwd());
        }
    }

    public boolean isInputReady(){
        if(TextUtils.isEmpty(getUI().phone.getText().toLowerCase())){
            ToastUtils.showLong("手机号不能为空");
            return false;
        }

        if(TextUtils.isEmpty(getUI().pwd.getText().toLowerCase())){
            ToastUtils.showLong("密码不能为空");
            return false;
        }
        return true;
    }

    public LoginReqBean getLoginReqBean() {
        LoginReqBean loginReqBean = new LoginReqBean();
        loginReqBean.setIdentityType(1);
        loginReqBean.setTel(getUI().phone.getText().toString());
        loginReqBean.setPassWord(EncryptUtils.encryptMD5ToString(getUI().pwd.getText().toString()));
        loginReqBean.setInputPwd(getUI().pwd.getText().toString());
        loginReqBean.setDeviceId(JPushInterface.getRegistrationID(getContext()));
        loginReqBean.setDeviceType(1);
        return loginReqBean;
    }
}