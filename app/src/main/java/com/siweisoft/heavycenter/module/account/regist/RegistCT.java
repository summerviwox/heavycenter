package com.siweisoft.heavycenter.module.account.regist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.SPUtils;
import com.siweisoft.heavycenter.R;
import com.siweisoft.heavycenter.data.locd.LocalValue;
import com.siweisoft.heavycenter.data.netd.acct.regist.RegistResBean;
import com.siweisoft.heavycenter.data.netd.base.Net;
import com.siweisoft.heavycenter.module.account.agree.AgreeCT;
import com.summer.x.base.ui.XFragment;
import com.summer.x.data.net.BaseCallBack;
import com.summer.x.data.net.ObjectData;

import butterknife.OnClick;
import butterknife.Optional;

public class RegistCT extends XFragment<RegistUI,RegistDE,RegistVA> {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getUI().initUI(this);
    }

    @Optional
    @OnClick({R.id.regist,R.id.tv_agree1,R.id.ftv_back})
    public void onClick(final View v){
        super.onClick(v);
        switch (v.getId()){
            case R.id.regist:
                if(getUI().is都输入好了()){
                    Net.getInstance().onRegist(getUI().getRegistReqBean()).enqueue(new BaseCallBack<ObjectData<RegistResBean>>() {
                        @Override
                        public void onSuccess(ObjectData<RegistResBean> registResBeanObjectData) {
                            SPUtils.getInstance().put(LocalValue.LOGIN_REQ, GsonUtils.toJson(getUI().getLoginReqBean()));
                            pop();
                        }

                        @Override
                        public void onError(int code, String error) {

                        }
                    });
                }
                break;
            case R.id.tv_code:
                if(getUI().is可以点击验证码()) {
                    Net.getInstance().getCode(getUI().getCodeReqBean());
                    getUI().getUI().code.setEnabled(false);
                }
                break;
            case R.id.tv_agree1:
                start(new AgreeCT());
                break;
            case R.id.ftv_back:
                pop();
                break;
        }
    }
}
