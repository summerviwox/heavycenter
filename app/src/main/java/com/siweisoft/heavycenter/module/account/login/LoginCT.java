package com.siweisoft.heavycenter.module.account.login;

import android.os.Build;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.SPUtils;
import com.siweisoft.heavycenter.R;
import com.siweisoft.heavycenter.data.locd.LocalValue;
import com.siweisoft.heavycenter.data.netd.acct.login.LoginResBean;
import com.siweisoft.heavycenter.data.netd.base.Net;
import com.siweisoft.heavycenter.module.account.regist.RegistCT;
import com.siweisoft.heavycenter.module.account.repwd.RepwdCT;
import com.siweisoft.heavycenter.module.account.role.RoleCT;
import com.summer.x.base.ui.XFragment;
import com.summer.x.data.net.BaseCallBack;
import com.summer.x.data.net.ObjectData;

import butterknife.OnClick;

public class LoginCT extends XFragment<LoginUI,LoginDE,LoginVA> {

    @OnClick({R.id.login,R.id.regist,R.id.repwd})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.login:
                if(getUI().isInputReady()){
                    Net.getInstance().onLogin(getUI().getLoginReqBean()).enqueue(new BaseCallBack<ObjectData<LoginResBean>>() {
                        @Override
                        public void onSuccess(ObjectData<LoginResBean> loginRes) {
                            SPUtils.getInstance().put(LocalValue.LOGIN_REQ, GsonUtils.toJson(getUI().getLoginReqBean()));
                            SPUtils.getInstance().put(LocalValue.LOGIN_RES,GsonUtils.toJson(loginRes.getData()));
                            if(loginRes.getData().is选择了角色()){
                                SPUtils.getInstance().put(LocalValue.AUTO_LOGIN,true);
                               // IntentUtil.startActivityWithFinish(getBaseUIAct(), MainAct.class,null);
                            }else{
                               start(new RoleCT());
                            }
                        }
                        @Override
                        public void onError(int code, String error) {

                        }
                    });
                }
                break;
            case R.id.regist:
                start(new RegistCT());
                break;
            case R.id.repwd:
               start(new RepwdCT());
                break;
        }
    }
}
