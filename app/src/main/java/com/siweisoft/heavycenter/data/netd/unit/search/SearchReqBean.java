package com.siweisoft.heavycenter.data.netd.unit.search;

//by summer on 2018-01-11.

import com.summer.x.base.ui.VA;

public class SearchReqBean extends VA {

    private String keyword;

    private int pageIndex;

    private int pageSize;

    public SearchReqBean() {
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
