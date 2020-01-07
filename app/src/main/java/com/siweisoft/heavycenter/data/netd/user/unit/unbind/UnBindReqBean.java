package com.siweisoft.heavycenter.data.netd.user.unit.unbind;

//by summer on 2018-01-12.

import com.summer.x.base.ui.VA;

public class UnBindReqBean extends VA {

    private int id;

    private int companyId;

    public UnBindReqBean() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}
