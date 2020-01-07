package com.siweisoft.heavycenter.data.locd;

import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.SPUtils;
import com.siweisoft.heavycenter.data.netd.acct.login.LoginResBean;
import com.siweisoft.heavycenter.data.netd.mana.store.list.StoreDetail;
import com.siweisoft.heavycenter.data.netd.order.list.OrdersRes;
import com.siweisoft.heavycenter.data.netd.order.news.NewsOrderReqBean;
import com.summer.x.base.ui.VA;

public class LocalValue extends VA {

    public static final String  LOGIN_REQ = "LOGIN_REQ";

    public static final String  LOGIN_RES = "LOGIN_RES";

    public static final String AUTO_LOGIN = "AUTO_LOGIN";

    public static float get仓库最小最大当前(StoreDetail data, int i){
        switch (i){
            case 0:
                return Math.max(data.getMinStock(),data.getProductMinStock());
            case 1:
                return Math.min(data.getMaxStock(),data.getProductMaxStock());
            case 2:
                return data.getCurrentStock();
            default:
                return 0f;
        }
    }

    public static boolean isNewOrderNeedMyMakeSure(OrdersRes.ResultsBean data){
        if((data.getAuditState()== OrdersRes.ResultsBean.AUDITSTATE_未审核)&&
                NewsOrderReqBean.发货.equals(data.getOrderType())){
            return true;
        }
        return false;
    }

    public  static LoginResBean getLoginRes(){
        LoginResBean loginResBean = new LoginResBean();
        loginResBean.setWareHouseCount(1);
        loginResBean.setAbbreviationName("setAbbreviationName");
        loginResBean.setUserType(1);
        loginResBean.setUserRole("driver");
        return GsonUtils.fromJson(SPUtils.getInstance().getString(LOGIN_RES),LoginResBean.class);
    }

    public static  boolean is绑定了单位() {
        //绑定了单位== true
        if(LocalValue.getLoginRes().getBindCompanyState()== LoginResBean.BIND_UNIT_STATE_BINDED){
            return true;
        }
        return false;
    }
}
