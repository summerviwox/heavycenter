package com.siweisoft.heavycenter.data.netd.mana.car.status;

//by summer on 2018-01-16.

import com.summer.x.base.ui.VA;

public class StopCarReqBean extends VA {

    private int id;

    private int status;

    private int editer;

    public StopCarReqBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getEditer() {
        return editer;
    }

    public void setEditer(int editer) {
        this.editer = editer;
    }
}
