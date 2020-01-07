package com.siweisoft.heavycenter.module.account.account;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.siweisoft.heavycenter.module.account.login.LoginCT;
import com.summer.x.base.ui.XActivity;

public class AccountCT extends XActivity<AccountUI,AccountDE,AccountVA> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(findFragment(LoginCT.class)==null){
            loadRootFragment(getUI().getUI().getRoot().getId(),new LoginCT());
        }
    }
}
