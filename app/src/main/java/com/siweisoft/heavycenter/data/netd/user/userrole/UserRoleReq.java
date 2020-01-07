package com.siweisoft.heavycenter.data.netd.user.userrole;

//by summer on 2018-02-07.

import com.summer.x.base.ui.VA;

public class UserRoleReq extends VA {

    private int id;

    private String userRole;

    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
