package com.siweisoft.heavycenter.module.main.order.rule;

import com.siweisoft.heavycenter.data.netd.order.rule.Rule;
import com.siweisoft.heavycenter.data.netd.order.rule.RuleRes;
import com.summer.x.base.ui.VA;

import java.util.ArrayList;

public class RuleVA extends VA {

    public static RuleRes ruleRes = new RuleRes();

    public static String 收货单位直接签收 ="zjSign";

    public static String 需驾驶员确认 ="jsyQr";

    public static String 需发货单位确认 ="fhdwQr";


    static{
        if(ruleRes.getData()==null){
            ruleRes .setData(new ArrayList<Rule>());
        }
        ruleRes.getData().clear();
        ruleRes.getData().add(new Rule("zjSign","收货单位直接签收"));
        ruleRes.getData().add(new Rule("jsyQr","需驾驶员确认"));
        ruleRes.getData().add(new Rule("fhdwQr","需发货单位确认"));
    }



    public static RuleRes getRuleRes() {
        return ruleRes;
    }
}
