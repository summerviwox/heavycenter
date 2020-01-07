package com.siweisoft.heavycenter.data.netd.mana.good.list;

//by summer on 2018-01-17.

import com.summer.x.base.ui.VA;

public class GoodListReq extends VA {

    private int companyId;

    private int isApp;

    public GoodListReq() {
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getIsApp() {
        return isApp;
    }

    public void setIsApp(int isApp) {
        this.isApp = isApp;
    }
}
