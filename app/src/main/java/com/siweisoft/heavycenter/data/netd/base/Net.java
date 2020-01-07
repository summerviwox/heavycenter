package com.siweisoft.heavycenter.data.netd.base;

import com.summer.x.data.net.NetDataHelper;

public class Net {

    public static final String URL = "http://hi.siweisoft.cn/zhongxin/";

    private static ZXService ZXService;

    public static ZXService getInstance() {
        if (ZXService == null) {
            NetDataHelper.getInstance().init(URL);
            ZXService = NetDataHelper.getInstance().getRetrofit().create(ZXService.class);
        }
        return ZXService;
    }

}
