package com.siweisoft.heavycenter.data.netd.mana.store.detail;

//by summer on 2018-01-19.

import com.summer.x.base.ui.VA;

public class StoreDetailReq extends VA {

    private int warehouseId;

    public StoreDetailReq() {
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
}
