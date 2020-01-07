package com.siweisoft.heavycenter.data.netd.base;

import com.summer.x.data.net.BaseCallBack;

import retrofit2.Call;
import retrofit2.Response;

public abstract class ZXCallBack<T extends ResultData> extends BaseCallBack<T> {

    public abstract void onSuccess(T t);

    public abstract void onError(int code,String error);

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if(response.isSuccessful()&&"200".equals(response.body().getCode())){
            onSuccess(response.body());
        }else{
            onError(response.code(),response.message());
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        onError(0,t.getMessage());
    }
}
