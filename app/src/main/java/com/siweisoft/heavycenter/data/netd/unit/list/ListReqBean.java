package com.siweisoft.heavycenter.data.netd.unit.list;

//by summer on 2018-01-10.

import com.summer.x.base.ui.VA;

public class ListReqBean extends VA {

    private int isAPP;

    private int pageIndex;

    private int pageSize;

    public int getIsAPP() {
        return isAPP;
    }

    public void setIsAPP(int isAPP) {
        this.isAPP = isAPP;
    }


    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
