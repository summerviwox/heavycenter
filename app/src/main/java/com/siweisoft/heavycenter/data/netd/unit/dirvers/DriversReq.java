package com.siweisoft.heavycenter.data.netd.unit.dirvers;

//by summer on 2018-02-01.

import com.summer.x.base.ui.VA;

public class DriversReq extends VA {

    private Integer companyId;

    private Integer vehicleId;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }
}
