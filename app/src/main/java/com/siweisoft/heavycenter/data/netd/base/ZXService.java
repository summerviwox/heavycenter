package com.siweisoft.heavycenter.data.netd.base;


import com.siweisoft.heavycenter.data.netd.acct.code.CodeReqBean;
import com.siweisoft.heavycenter.data.netd.acct.code.CodeResBean;
import com.siweisoft.heavycenter.data.netd.acct.forget.ForGetReqBean;
import com.siweisoft.heavycenter.data.netd.acct.forget.ForGetResBean;
import com.siweisoft.heavycenter.data.netd.acct.login.LoginReqBean;
import com.siweisoft.heavycenter.data.netd.acct.login.LoginResBean;
import com.siweisoft.heavycenter.data.netd.acct.logout.LogOutReqBean;
import com.siweisoft.heavycenter.data.netd.acct.logout.LogOutResBean;
import com.siweisoft.heavycenter.data.netd.acct.regist.RegistReqBean;
import com.siweisoft.heavycenter.data.netd.acct.regist.RegistResBean;
import com.siweisoft.heavycenter.data.netd.acct.rename.ReNameReqBean;
import com.siweisoft.heavycenter.data.netd.acct.rename.ReNameResBean;
import com.siweisoft.heavycenter.data.netd.mana.car.bind.BindCarReq;
import com.siweisoft.heavycenter.data.netd.mana.car.bind.BindCarRes;
import com.siweisoft.heavycenter.data.netd.mana.car.info.CarInfoReq;
import com.siweisoft.heavycenter.data.netd.mana.car.list.CarsReqBean;
import com.siweisoft.heavycenter.data.netd.mana.car.list.CarsResBean;
import com.siweisoft.heavycenter.data.netd.mana.car.news.CarNewReqBean;
import com.siweisoft.heavycenter.data.netd.mana.car.status.StopCarReqBean;
import com.siweisoft.heavycenter.data.netd.mana.car.status.StopCarResBean;
import com.siweisoft.heavycenter.data.netd.mana.car.update.UpdateCarReq;
import com.siweisoft.heavycenter.data.netd.mana.car.update.UpdateCarRes;
import com.siweisoft.heavycenter.data.netd.mana.good.detial.GoodDetailReq;
import com.siweisoft.heavycenter.data.netd.mana.good.list.GoodListReq;
import com.siweisoft.heavycenter.data.netd.mana.good.list.GoodListRes;
import com.siweisoft.heavycenter.data.netd.mana.good.names.NamesReq;
import com.siweisoft.heavycenter.data.netd.mana.good.names.NamesRes;
import com.siweisoft.heavycenter.data.netd.mana.good.news.NewsGoodReq;
import com.siweisoft.heavycenter.data.netd.mana.good.news.NewsGoodRes;
import com.siweisoft.heavycenter.data.netd.mana.good.specs.SpecsReq;
import com.siweisoft.heavycenter.data.netd.mana.good.specs.SpecsRes;
import com.siweisoft.heavycenter.data.netd.mana.good.status.GoodStatusReq;
import com.siweisoft.heavycenter.data.netd.mana.good.status.GoodStatusRes;
import com.siweisoft.heavycenter.data.netd.mana.good.upd.UpdGoodReq;
import com.siweisoft.heavycenter.data.netd.mana.good.upd.UpdGoodRes;
import com.siweisoft.heavycenter.data.netd.mana.store.add.NewStoreReqBean;
import com.siweisoft.heavycenter.data.netd.mana.store.add.NewStoreResBean;
import com.siweisoft.heavycenter.data.netd.mana.store.check.CheckStoreReqBean;
import com.siweisoft.heavycenter.data.netd.mana.store.check.CheckStoreResBean;
import com.siweisoft.heavycenter.data.netd.mana.store.detail.StoreDetailReq;
import com.siweisoft.heavycenter.data.netd.mana.store.list.StoreDetail;
import com.siweisoft.heavycenter.data.netd.mana.store.list.StoresReqBean;
import com.siweisoft.heavycenter.data.netd.mana.store.list.StoresResBean;
import com.siweisoft.heavycenter.data.netd.mana.store.status.StatusStoresReqBean;
import com.siweisoft.heavycenter.data.netd.mana.store.status.StatusStoresResBean;
import com.siweisoft.heavycenter.data.netd.mana.store.update.UpdateStoreReq;
import com.siweisoft.heavycenter.data.netd.mana.store.update.UpdateStoreRes;
import com.siweisoft.heavycenter.data.netd.mana.user.add.AddUserReqBean;
import com.siweisoft.heavycenter.data.netd.mana.user.add.AddUserResBean;
import com.siweisoft.heavycenter.data.netd.msg.deal.MsgDealReqBean;
import com.siweisoft.heavycenter.data.netd.msg.deal.MsgDealResBean;
import com.siweisoft.heavycenter.data.netd.msg.list.MsgsReqBean;
import com.siweisoft.heavycenter.data.netd.msg.list.MsgsResBean;
import com.siweisoft.heavycenter.data.netd.order.addcar.AddCarReq;
import com.siweisoft.heavycenter.data.netd.order.addcar.AddCarRes;
import com.siweisoft.heavycenter.data.netd.order.detail.OrderDetailReq;
import com.siweisoft.heavycenter.data.netd.order.list.OrdersReq;
import com.siweisoft.heavycenter.data.netd.order.list.OrdersRes;
import com.siweisoft.heavycenter.data.netd.order.news.NewOrderRes;
import com.siweisoft.heavycenter.data.netd.order.news.NewsOrderReqBean;
import com.siweisoft.heavycenter.data.netd.order.ordernum.OrderNumReq;
import com.siweisoft.heavycenter.data.netd.order.ordernum.OrderNumRes;
import com.siweisoft.heavycenter.data.netd.order.receipt.ReceiptOrderReq;
import com.siweisoft.heavycenter.data.netd.order.receipt.ReceiptOrderRes;
import com.siweisoft.heavycenter.data.netd.other.city.CityReqBean;
import com.siweisoft.heavycenter.data.netd.other.city.CityResBean;
import com.siweisoft.heavycenter.data.netd.scan.weight.WeightReq;
import com.siweisoft.heavycenter.data.netd.scan.weight.WeightRes;
import com.siweisoft.heavycenter.data.netd.trans.detail.TransDetailReq;
import com.siweisoft.heavycenter.data.netd.trans.detail.TransDetailRes;
import com.siweisoft.heavycenter.data.netd.trans.sign.TransSignReq;
import com.siweisoft.heavycenter.data.netd.trans.sign.TransSignRes;
import com.siweisoft.heavycenter.data.netd.trans.strans.StransReq;
import com.siweisoft.heavycenter.data.netd.trans.trans.TransRes;
import com.siweisoft.heavycenter.data.netd.unit.dirvers.DriverRes;
import com.siweisoft.heavycenter.data.netd.unit.dirvers.DriversReq;
import com.siweisoft.heavycenter.data.netd.unit.historyfh.HistoryFhUnitReq;
import com.siweisoft.heavycenter.data.netd.unit.historysh.HistoryShUnitReq;
import com.siweisoft.heavycenter.data.netd.unit.info.UnitInfoReqBean;
import com.siweisoft.heavycenter.data.netd.unit.list.ListResBean;
import com.siweisoft.heavycenter.data.netd.unit.list.UnitInfo;
import com.siweisoft.heavycenter.data.netd.unit.news.NewReqBean;
import com.siweisoft.heavycenter.data.netd.unit.news.NewResBean;
import com.siweisoft.heavycenter.data.netd.unit.search.SearchReqBean;
import com.siweisoft.heavycenter.data.netd.unit.search.SearchResBean;
import com.siweisoft.heavycenter.data.netd.unit.update.UpdateUnitReq;
import com.siweisoft.heavycenter.data.netd.unit.update.UpdateUnitRes;
import com.siweisoft.heavycenter.data.netd.unit.user.UnitUserResBean;
import com.siweisoft.heavycenter.data.netd.unit.user.UnitUsersReqBean;
import com.siweisoft.heavycenter.data.netd.user.head.UpdateHeadReqBean;
import com.siweisoft.heavycenter.data.netd.user.head.UpdateHeadResBean;
import com.siweisoft.heavycenter.data.netd.user.info.UserInfoReqBean;
import com.siweisoft.heavycenter.data.netd.user.unit.bind.BindReqBean;
import com.siweisoft.heavycenter.data.netd.user.unit.bind.BindResBean;
import com.siweisoft.heavycenter.data.netd.user.unit.unbind.UnBindReqBean;
import com.siweisoft.heavycenter.data.netd.user.unit.unbind.UnBindResBean;
import com.siweisoft.heavycenter.data.netd.user.userrole.UserRoleRes;
import com.siweisoft.heavycenter.data.netd.user.usertype.UserTypeReqBean;
import com.siweisoft.heavycenter.data.netd.user.usertype.UserTypeResBean;
import com.siweisoft.heavycenter.data.netd.weight.list.WeightListReq;
import com.siweisoft.heavycenter.data.netd.weight.list.WeightListRes;
import com.siweisoft.heavycenter.data.netd.weight.save.SaveWeightReq;
import com.siweisoft.heavycenter.data.netd.weight.save.SaveWeightRes;
import com.summer.x.data.net.ListData;
import com.summer.x.data.net.ObjectData;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface ZXService {

//    @GET("record/getRecordsWithTypeSize")
//    Call<ListData<PictureB>> getRecordsWithTypeSize(@Query("type") String type, @Query("index") String index);

    @FormUrlEncoded
    @POST("user/appLogin")
    Call<ResultData<LoginResBean>> onLogin(@Field("identityType") String identityType,@Field("identifier") String identifier,@Field("tel") String tel,@Field("passWord") String passWord,@Field("deviceId") String deviceId,@Field("deviceType") String deviceType);


    @GET("record/getRecordsWithTypeSize")
    Call<ListData<String>> getRecordsWithTypeSize(@Query("type") String type, @Query("index") String index);

    //#
    @POST("picture/uploadPicture")
    Call<ListData<String>> uploadRecords(@Query("data") String data, @Part MultipartBody.Part file);

    //#
    @POST("user/getSecurityCode")
    Call<ObjectData<CodeResBean>> getCode(@Body CodeReqBean reqBean);


    //#
    @POST("user/insertAPP")
    Call<ObjectData<RegistResBean>> onRegist(@Body RegistReqBean reqBean);


    //#
    @POST("user/forgetPwd")
    Call<ObjectData<ForGetResBean>> updatePwd(@Body ForGetReqBean reqBean);

    //#
    @POST("user/setUserType")
    Call<ObjectData<UserTypeResBean>> setUserType(@Body UserTypeReqBean reqBean);

    //#
    @POST("user/appExit")
    Call<ObjectData<LogOutResBean>> logOut(@Body LogOutReqBean reqBean);

    //#
    @POST("user/update")
    Call<ObjectData<ReNameResBean>> reName(@Body ReNameReqBean reqBean);

    @GET("company/insert")
    Call<ObjectData<NewResBean>> unitCreate(@Body NewReqBean reqBean);

    @GET("metadata/getCity")
    Call<ListData<CityResBean>> get省市列表接口数据(@Body CityReqBean reqBean);

    //#
    @POST("orders/insert")
    Call<ObjectData<NewOrderRes>> newOrder(@Body NewsOrderReqBean reqBean);

    @GET("orders/list")
    Call<ListData<OrdersRes>> orders(@Body OrdersReq reqBean);


    //#
    @POST("orders/addVehicle")
    Call<ObjectData<AddCarRes>> addCar(@Body AddCarReq reqBean);

    @GET("orders/getDetai")
    Call<ObjectData<OrdersRes.ResultsBean>> detail(@Body OrderDetailReq reqBean);


    //#
    @POST("orders/auditOrder")
    Call<ObjectData<ReceiptOrderRes>> receipt(@Body ReceiptOrderReq reqBean);

    @GET("orders/getOrderCount")
    Call<ObjectData<OrderNumRes>> getOrderCount(@Body OrderNumReq reqBean);

    @GET("ysRecord/list")
    Call<ObjectData<TransRes>> getStrans(@Body StransReq reqBean);




    //#
    @POST("ysRecord/signTranSportRecord")
    Call<ObjectData<TransSignRes>> signTrans(@Body TransSignReq reqBean);

    @GET("ysRecord/getDetail")
    Call<ObjectData<TransDetailRes>> detailTrans(@Body TransDetailReq reqBean);



    @GET("company/search")
    Call<ObjectData<SearchResBean>> search(@Body SearchReqBean reqBean);

    @GET("company/getDetail")
    Call<ObjectData<UnitInfo>> getInfo(@Body UnitInfoReqBean reqBean);


    @GET("user/list")
    Call<ObjectData<UnitUserResBean>> unitUsers(@Body UnitUsersReqBean reqBean);


    //#
    @POST("company/insert")
    Call<ObjectData<NewResBean>> createUnit(@Body  NewReqBean reqBean);


    @GET("user/getDriver")
    Call<ListData<DriverRes>> drvers(@Body DriversReq reqBean);

    //#
    @POST("company/update")
    Call<ObjectData<UpdateUnitRes>> updateUnit(@Body UpdateUnitReq reqBean);

    @GET("orders/historyFhdw")
    Call<ObjectData<ListResBean>> drvers(@Body HistoryFhUnitReq reqBean);

    @GET("orders/historyShdw")
    Call<ObjectData<ListResBean>> historyShUnit(@Body HistoryShUnitReq reqBean);

    @GET("message/list")
    Call<ObjectData<MsgsResBean>> list(@Body MsgsReqBean reqBean);

    //#
    @POST("message/deal")
    Call<ObjectData<MsgDealResBean>> deal(@Body MsgDealReqBean reqBean);


    //#
    @POST("user/bindCompany")
    Call<ObjectData<BindResBean>> binUnit(@Body BindReqBean reqBean);

    //#
    @POST("user/unBindCompany")
    Call<ObjectData<UnBindResBean>> unBinUnit(@Body UnBindReqBean reqBean);

    @GET("user/getDetail")
    Call<ObjectData<LoginResBean>> get用户信息(@Body UserInfoReqBean reqBean);


    //#
    @POST("uploadPic/picture")
    Call<ListData<String>> uploaddPhoto(@Query("data") String data, @Part MultipartBody.Part file);


    //#
    @POST("user/updatePhoto")
    Call<ObjectData<UpdateHeadResBean>> updatePhoto(@Body UpdateHeadReqBean reqBean);


    //#
    @POST("user/updateDriverInfo")
    Call<ObjectData<UpdateHeadResBean>> updateDriver(@Body  UpdateHeadReqBean reqBean);


    //#
    @POST("user/setUserRole")
    Call<ObjectData<UserRoleRes>> setUserRole(@Body  UpdateHeadReqBean reqBean);


    @GET("wareHouse/list")
    Call<ObjectData<StoresResBean>> sotresInfo(@Body StoresReqBean reqBean);

    //#
    @POST("wareHouse/insert")
    Call<ObjectData<NewStoreResBean>> newStore(@Body NewStoreReqBean reqBean);

    //#
    @POST("wareHouse/updateWareHouseStatus")
    Call<ObjectData<StatusStoresResBean>> statusStore(@Body StatusStoresReqBean reqBean);

    //#
    @POST("wareHouse/inventory")
    Call<ObjectData<CheckStoreResBean>> checkStore(@Body CheckStoreReqBean reqBean);

    @GET("wareHouse/getDetail")
    Call<ObjectData<StoreDetail>> detail(@Body StoreDetailReq reqBean);

    //#
    @POST("wareHouse/update")
    Call<ObjectData<UpdateStoreRes>> update(@Body UpdateStoreReq reqBean);


    @GET("vehicle/list")
    Call<ObjectData<CarsResBean>> Cars(@Body CarsReqBean reqBean);

    //#
    @POST("vehicle/insert")
    Call<ObjectData<CarsResBean.CarInfoRes>> newCar(@Body CarNewReqBean reqBean);


    //#
    @POST("vehicle/startOrStop")
    Call<ObjectData<StopCarResBean>> statusCar(@Body StopCarReqBean reqBean);

    //#
    @POST("vehicle/update")
    Call<ObjectData<UpdateCarRes>> statusCar(@Body UpdateCarReq reqBean);

    //#
    @POST("vehicle/bindVehicle")
    Call<ObjectData<BindCarRes>> statusCar(@Body BindCarReq reqBean);


    @GET("vehicle/getDetail")
    Call<ObjectData<CarsResBean.CarInfoRes>> infoCar(@Body CarInfoReq reqBean);

    //#
    @POST("user/insertUserApp")
    Call<ObjectData<AddUserResBean>> addUser(@Body AddUserReqBean reqBean);



    @GET("product/list")
    Call<ObjectData<GoodListRes>> listGood(@Body GoodListReq reqBean);



    @GET("product/productList")
    Call<ObjectData<NamesRes>> NamesGood(@Body NamesReq reqBean);

    @GET("materiel/list")
    Call<ObjectData<NamesRes>> ProductList(@Body NamesReq reqBean);


    //#
    @POST("product/insertProduct")
    Call<ObjectData<NewsGoodRes>> NewsGood(@Body NewsGoodReq reqBean);

    @GET("materielSpec/list")
    Call<ObjectData<SpecsRes>> SpecsGood(@Body SpecsReq reqBean);

    @GET("product/productDetail")
    Call<ObjectData<GoodListRes.ResultsBean>> detailGood(@Body GoodDetailReq reqBean);


    //#
    @POST("product/updateProduct")
    Call<ObjectData<UpdGoodRes>> updGood(@Body UpdGoodReq reqBean);

    //#
    @POST("product/updateProductStatus")
    Call<ObjectData<GoodStatusRes>> updateStatus(@Body GoodStatusReq reqBean);

    //#
    @POST("weigh/triggerWeigh")
    Call<ObjectData<WeightRes>> triggerWeigh(@Body WeightReq reqBean);


    @GET("weighbridge/list")
    Call<ObjectData<WeightListRes>> listWeight(@Body WeightListReq reqBean);


    //#
    @POST("weigh/saveWeigh")
    Call<ObjectData<SaveWeightRes>> saveWeight(@Body SaveWeightReq reqBean);
}