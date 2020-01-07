package com.siweisoft.heavycenter.data.netd.mana.store.check;

//by summer on 2018-01-16.

import com.summer.x.base.ui.VA;
import com.summer.x.base.ui.VA;

import java.util.ArrayList;

public class CheckStoreReqBean extends VA {

    private int userId;

    private String wareHouseListString ;


    public CheckStoreReqBean() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getWareHouseListString() {
        return wareHouseListString;
    }

    public void setWareHouseListString(String wareHouseListString) {
        this.wareHouseListString = wareHouseListString;
    }
}
