package com.siweisoft.heavycenter.module.myce.myce;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.siweisoft.heavycenter.data.locd.LocalValue;
import com.siweisoft.heavycenter.module.main.main.MainDE;
import com.summer.x.base.ui.XFragment;

public class MyceCT extends XFragment<MyceUI,MyceDE,MyceVA> {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getUI().hideOrShowManageFunction(LocalValue.is绑定了单位());
    }
}
