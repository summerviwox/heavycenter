package com.siweisoft.heavycenter.data.netd.acct.forget;

//by summer on 2018-01-09.

import com.summer.x.base.ui.VA;
import com.summer.x.base.ui.VA;

public class ForGetReqBean extends VA {

    private String tel;

    private String securityCode;

    private String newPwd;

    public ForGetReqBean() {
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }
}
