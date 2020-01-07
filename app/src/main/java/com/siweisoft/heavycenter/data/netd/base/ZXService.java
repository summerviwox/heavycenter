package com.siweisoft.heavycenter.data.netd.base;


import com.siweisoft.heavycenter.data.netd.acct.login.LoginReqBean;
import com.siweisoft.heavycenter.data.netd.acct.login.LoginResBean;
import com.summer.x.data.net.ObjectData;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ZXService {

//    @GET("record/getRecordsWithTypeSize")
//    Call<ListData<PictureB>> getRecordsWithTypeSize(@Query("type") String type, @Query("index") String index);

    @POST("picture/isPictureUploaded")
    Call<ObjectData<LoginResBean>> onLogin(@Body LoginReqBean req);
}