package com.siweisoft.heavycenter.data.netd.order.rule;

//by summer on 2018-01-17.

import com.summer.x.base.ui.VA;

public class Rule extends VA{

    private String key;

    private String value;


    public Rule(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Rule() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
