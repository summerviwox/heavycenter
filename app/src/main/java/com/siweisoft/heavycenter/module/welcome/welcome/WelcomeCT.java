package com.siweisoft.heavycenter.module.welcome.welcome;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.siweisoft.heavycenter.module.account.account.AccountCT;
import com.summer.x.base.ui.XActivity;

public class WelcomeCT extends XActivity<WelcomeUI,WelcomeDE,WelcomeVA> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this,AccountCT.class));
    }
}
