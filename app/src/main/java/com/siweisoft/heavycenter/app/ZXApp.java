package com.siweisoft.heavycenter.app;

import com.summer.x.BuildConfig;
import com.summer.x.app.XApp;

import me.yokeyword.fragmentation.Fragmentation;

public class ZXApp extends XApp {
    @Override
    public void onCreate() {
        super.onCreate();
        Fragmentation.builder()
                .stackViewMode(Fragmentation.BUBBLE)
                .debug(BuildConfig.DEBUG)
                .install();
    }
}
