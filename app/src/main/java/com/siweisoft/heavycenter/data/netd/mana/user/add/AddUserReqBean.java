package com.siweisoft.heavycenter.data.netd.mana.user.add;

//by summer on 2018-01-16.

import com.summer.x.base.ui.VA;

public class AddUserReqBean extends VA {

    private String tel;

    private String userRole;

    private int companyId;

    private int userId;

    public AddUserReqBean() {
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
