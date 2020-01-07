package com.siweisoft.heavycenter.module.account.regist;

import android.text.TextUtils;
import android.view.View;

import com.blankj.utilcode.util.EncryptUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.siweisoft.heavycenter.data.netd.acct.code.CodeReqBean;
import com.siweisoft.heavycenter.data.netd.acct.login.LoginReqBean;
import com.siweisoft.heavycenter.data.netd.acct.regist.RegistReqBean;
import com.siweisoft.heavycenter.databinding.FragAcctRegistBinding;
import com.siweisoft.heavycenter.util.MD5Util;
import com.summer.x.base.ui.UI;
import com.summer.x.base.ui.XFragment;

import cn.jpush.android.api.JPushInterface;

public class RegistUI extends UI<FragAcctRegistBinding> {

    RegistReqBean registReqBean = new RegistReqBean();

    CodeReqBean codeReqBean = new CodeReqBean();

    LoginReqBean loginReqBean = new LoginReqBean();



    public void initUI(View.OnClickListener onClickListener) {
        getUI().code.getCodeText().setOnClickListener(onClickListener);
        getUI().tvRead.getCheckIV().setSelected(true);
    }

    public boolean is都输入好了(){
        if(TextUtils.isEmpty(getUI().phone.getText())){
            ToastUtils.showLong("请输入手机号");
            return false;
        }
        if(getUI().phone.getText().length()!=11){
            ToastUtils.showLong("手机号格式不正确");
            return false;
        }
        if(TextUtils.isEmpty(getUI().code.getText().toString())){
            ToastUtils.showLong("请输入验证码");
            return false;
        }

        if(!getUI().pwd.getText().toString().equals(getUI().repwd.getText().toString())){
            ToastUtils.showLong("密码不一致");
            return false;
        }
        if(getUI().pwd.getText().toString().length()<6 || getUI().pwd.getText().toString().length()>18){
            ToastUtils.showLong("密码为6-18位数字和字母");
            return false;
        }
        if(!getUI().tvRead.getCheckIV().isSelected()){
            ToastUtils.showLong("请同意协议");
            return false;
        }
        return true;
    }

    public boolean is可以点击验证码(){
        if(TextUtils.isEmpty(getUI().phone.getText())){
            ToastUtils.showLong("请输入手机号");
            return false;
        }
        if(getUI().phone.getText().length()!=11){
            ToastUtils.showLong("手机号格式不正确");
            return false;
        }
        return true;
    }

    public RegistReqBean getRegistReqBean() {
        registReqBean.setUserName(getUI().phone.getText().toString());
        registReqBean.setTel(getUI().phone.getText().toString());
        registReqBean.setPassWord(MD5Util.md5(getUI().pwd.getText().toString()));
        registReqBean.setSecurityCode(getUI().code.getText().toString());
        return registReqBean;
    }

    public CodeReqBean getCodeReqBean() {
        codeReqBean.setTel(getUI().phone.getText().toString());
        codeReqBean.setType("1");
        return codeReqBean;
    }

    public LoginReqBean getLoginReqBean() {
        loginReqBean.setIdentityType(1);
        loginReqBean.setTel(getUI().phone.getText().toString());
        loginReqBean.setPassWord(MD5Util.md5(getUI().pwd.getText().toString()));
        loginReqBean.setInputPwd(getUI().pwd.getText().toString());
        loginReqBean.setDeviceId(JPushInterface.getRegistrationID(getContext()));
        loginReqBean.setDeviceType(1);
        return loginReqBean;
    }

}