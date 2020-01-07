package com.siweisoft.heavycenter.data.netd.acct.rename;

//by summer on 2018-01-10.

import com.summer.x.base.ui.VA;

public class ReNameReqBean extends VA {

    private int id;

    private String trueName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }
}
