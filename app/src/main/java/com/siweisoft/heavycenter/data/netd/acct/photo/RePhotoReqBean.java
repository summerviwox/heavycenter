package com.siweisoft.heavycenter.data.netd.acct.photo;

//by summer on 2018-01-15.

import com.summer.x.base.ui.VA;

public class RePhotoReqBean extends VA {

    private int id;

    private String myFile;

    public RePhotoReqBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMyFile() {
        return myFile;
    }

    public void setMyFile(String myFile) {
        this.myFile = myFile;
    }
}
