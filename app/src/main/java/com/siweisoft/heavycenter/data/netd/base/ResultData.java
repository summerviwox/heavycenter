package com.siweisoft.heavycenter.data.netd.base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultData<T> {

    private String code;

    private String message;

    private T result;


}
