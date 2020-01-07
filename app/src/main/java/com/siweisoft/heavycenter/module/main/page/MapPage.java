package com.siweisoft.heavycenter.module.main.page;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.summer.x.base.ui.DE;
import com.summer.x.base.ui.XFragment;

public class MapPage extends XFragment<PageUI, DE, PageVA> {

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        getUI().getUI().getRoot().setId(getVA().ids[2]);
        getUI().getUI().text.setText("2");
    }
}
