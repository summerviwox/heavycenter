package com.siweisoft.heavycenter.data.netd.user.info;

//by summer on 2018-01-11.

import com.summer.x.base.ui.VA;

public class UserInfoReqBean extends VA {

    private int id;

    private int isApp = 1;

    public UserInfoReqBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsApp() {
        return isApp;
    }

    public void setIsApp(int isApp) {
        this.isApp = isApp;
    }
}
