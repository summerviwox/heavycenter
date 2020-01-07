package com.siweisoft.heavycenter.data.netd.base;

import com.summer.x.data.net.NetDataHelper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;

public class Net {

    //public static final String URL = "http://hi.siweisoft.cn/zhongxin/";
    public static final String URL = "http://192.168.1.205:8082/zhongxin/";
    //public static final String URL = "http://sx.siweisoft.cn:8079/zhongxin/";

    private static ZXService ZXService;

    public static ZXService getInstance() {
        if (ZXService == null) {
            NetDataHelper.getInstance().init(URL);
            ZXService = NetDataHelper.getInstance().getRetrofit().create(ZXService.class);
        }
        return ZXService;
    }

    public static RequestBody getRequestBody(HashMap<String, String> hashMap) {

        StringBuffer data = new StringBuffer();
        if (hashMap != null && hashMap.size() > 0) {
            Iterator iter = hashMap.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry) iter.next();
                Object key = entry.getKey();
                Object val = entry.getValue();
                data.append(key).append("=").append(val).append("&");
            }
        }
        String jso = data.substring(0, data.length() - 1);
        RequestBody requestBody =RequestBody.create(MediaType.parse("application/x-www-form-urlencoded; charset=utf-8"),jso);
        return requestBody;
    }


}
