package com.siweisoft.heavycenter.app;

import com.siweisoft.heavycenter.data.netd.base.Net;
import com.summer.x.BuildConfig;
import com.summer.x.app.XApp;
import com.summer.x.data.net.NetDataHelper;

import me.yokeyword.fragmentation.Fragmentation;

public class ZXApp extends XApp {
    @Override
    public void onCreate() {
        super.onCreate();
        Fragmentation.builder()
                .stackViewMode(Fragmentation.BUBBLE)
                .debug(BuildConfig.DEBUG)
                .install();
        NetDataHelper.DEBUG = true;
    }
}
