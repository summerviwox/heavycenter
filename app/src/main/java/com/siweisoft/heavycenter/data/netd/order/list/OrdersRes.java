package com.siweisoft.heavycenter.data.netd.order.list;

//by summer on 2018-01-17.


import androidx.databinding.Bindable;

import com.blankj.utilcode.util.TimeUtils;
import com.siweisoft.heavycenter.data.locd.LocalValue;
import com.summer.x.base.ui.VA;
import com.siweisoft.heavycenter.data.netd.mana.car.list.CarsResBean;
import com.siweisoft.heavycenter.data.netd.trans.detail.TransDetailRes;
import com.summer.x.util.StringUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersRes extends VA {


    /**
     * totalCount : 1
     * pageIndex : -1000
     * pageCount : 1
     * pageSize : 1000
     * results : [{"orderId":45,"orderNo":"2018011715","orderType":"S","productName":"混凝土","specification":"C50","planNumber":2000,"shdwName":"雨后","fhdwName":"干干干"}]
     */

    private int totalCount;
    private int total;
    private String orderType;
    private int newCount;
    private int ingCount;
    private int doneCount;
    private int pageIndex;
    private int pageCount;
    private int pageSize;
    private List<ResultsBean> results = new ArrayList<>();

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public int getNewCount() {
        return newCount;
    }

    public void setNewCount(int newCount) {
        this.newCount = newCount;
    }

    public int getIngCount() {
        return ingCount;
    }

    public void setIngCount(int ingCount) {
        this.ingCount = ingCount;
    }

    public int getDoneCount() {
        return doneCount;
    }

    public void setDoneCount(int doneCount) {
        this.doneCount = doneCount;
    }

    public static class ResultsBean extends VA{


        /**
         * orderId : 46
         * orderNo : 2018011716
         * orderType : S
         * productName : 混凝土
         * specification : C30
         * planNumber : 200
         * shdwName : 搞搞搞
         * fhdwName : 干干干
         * planTime : 1516118400000
         * address : 
         * shdwQName : 搞搞搞有限公司
         * fhdwQName : 干干干有限公司
         * signRule : 收货单位直接签收
         * orderStatus : new
         * vehicleList : [{"trueName":"驾驶员A","maxCapacity":25,"tel":"18721607200","vehicleId":45,"carLicenseNo":"沪A12332"},{"trueName":null,"maxCapacity":25,"tel":null,"vehicleId":44,"carLicenseNo":"沪A8485"}]
         */

        private int orderId;
        private String orderNo;
        private String orderType;
        private String productName;
        private String specification;
        private double planNumber;
        private String shdwName;
        private String fhdwName;
        private Long planTime;
        private String address;
        private String shdwQName;
        private String fhdwQName;
        private String signRule;
        private String orderStatus;
        private String carLicenseNo;
        private String trueName;
        private String tel;
        private Long startTime;
        private Long finishTime;
        private int totalRecord;
        private double actualFh;
        private double actualSh;
        private  int auditState;
        private String accessComName;
        private String type;

        private boolean showBtn;

        public final static int AUDITSTATE_未审核 = 0;

        public final static int AUDITSTATE_接收 = 1;

        public final static int AUDITSTATE_拒绝 = 2;





        public boolean isIDiliverCom(){
            if("S".equals(getOrderType())){
                return true;
            }
            return false;
        }



        public String getShortAccessComName() {
            if(isIDiliverCom()){
                accessComName = getShdwName();
            }else{
                accessComName = getFhdwName();
            }
            return accessComName;
        }


        public String getAccessComName() {
            if(isIDiliverCom()){
                accessComName = getShdwQName();
            }else{
                accessComName = getFhdwQName();
            }
            return accessComName;
        }

        public String getType() {
            if(isIDiliverCom()){
                type = "发往";
            }else{
                type = "来自";
            }
            return type;
        }


        public int getAuditState() {
            return auditState;
        }

        public void setAuditState(int auditState) {
            this.auditState = auditState;
        }

        private List<CarsResBean.CarInfoRes> vehicleList = new ArrayList<>();
        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderType() {
            return orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getProductName() {
            return productName;
        }



        public String getProductNameAndSpecification() {
            return StringUtil.getStr(productName)+"\t\t"+StringUtil.getStr(specification);
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getSpecification() {
            return specification;
        }

        public void setSpecification(String specification) {
            this.specification = specification;
        }

        public double getPlanNumber() {
            return planNumber;
        }



        public String getPlanNumberCN() {
            return "计划: "+StringUtil.getStr(planNumber)+"t";
        }


        public String getPlanNumberCN2() {
            return StringUtil.getStr(planNumber)+"t";
        }

        public void setPlanNumber(double planNumber) {
            this.planNumber = planNumber;
        }




        public String getShdwName() {
            return shdwName;
        }

        public void setShdwName(String shdwName) {
            this.shdwName = shdwName;
        }

        public String getFhdwName() {
            return fhdwName;
        }

        public void setFhdwName(String fhdwName) {
            this.fhdwName = fhdwName;
        }

        public Long getPlanTime() {
            return planTime;
        }



        public String getPlanTimeCN() {
            if(getPlanTime()==null){
                    return "";
            }
            return "计划开始时间: "+ TimeUtils.getChineseWeek(new Date(getPlanTime()));
        }

        public String getPlanTimeCNNOApp() {
            if(getPlanTime()==null){
                return "";
            }
            return  TimeUtils.getChineseWeek(new Date(getPlanTime()));
        }

        public void setPlanTime(Long planTime) {
            this.planTime = planTime;
        }

        public Long getStartTime() {
            return startTime;
        }

        public String getStartTimeCN() {
            if(getStartTime()==null){
                return "";
            }
            return  TimeUtils.getChineseWeek(new Date(getStartTime()));
        }

        public String getStartTimeCN2() {
            if(getStartTime()==null){
                return "开始时间: ";
            }
            return "开始时间: "+ TimeUtils.getChineseWeek(new Date(getStartTime()));
        }


        public String getStartTimeCN3() {
            if(getStartTime()==null){
                return "";
            }
            return TimeUtils.getChineseWeek(new Date(getStartTime()));
        }

        public void setStartTime(Long startTime) {
            this.startTime = startTime;
        }

        public Long getFinishTime() {
            return finishTime;
        }


        public String getFinishTimeCN() {
            if(getFinishTime()==null){
                return "";
            }
            return TimeUtils.getChineseWeek(new Date(getFinishTime()));
        }

        public String getFinishTimeCN2() {
            if(getFinishTime()==null){
                return "结束时间: ";
            }
            return "结束时间: "+TimeUtils.getChineseWeek(new Date(getFinishTime()));
        }


        public String getFinishTimeCN3() {
            if(getFinishTime()==null){
                return "";
            }
            return TimeUtils.getChineseWeek(new Date(getFinishTime()));
        }

        public void setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
        }


        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getShdwQName() {
            return shdwQName;
        }

        public void setShdwQName(String shdwQName) {
            this.shdwQName = shdwQName;
        }

        public String getFhdwQName() {
            return fhdwQName;
        }

        public void setFhdwQName(String fhdwQName) {
            this.fhdwQName = fhdwQName;
        }

        public String getSignRule() {
            return signRule;
        }

        public void setSignRule(String signRule) {
            this.signRule = signRule;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public List<CarsResBean.CarInfoRes> getVehicleList() {
            return vehicleList;
        }

        public void setVehicleList(List<CarsResBean.CarInfoRes> vehicleList) {
            this.vehicleList = vehicleList;
        }

        public String getCarLicenseNo() {
            return carLicenseNo;
        }

        public void setCarLicenseNo(String carLicenseNo) {
            this.carLicenseNo = carLicenseNo;
        }

        public String getTrueName() {
            return trueName;
        }

        public void setTrueName(String trueName) {
            this.trueName = trueName;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }



        public String getTotalRecordCN() {
            return "总计: "+StringUtil.getStr(totalRecord)+"车";
        }


        public String getTotalRecordCN2() {
            return "其他: "+StringUtil.getStr(totalRecord)+"车";
        }


        public int getTotalRecord() {
            return totalRecord;
        }

        public void setTotalRecord(int totalRecord) {
            this.totalRecord = totalRecord;
        }

        public double getActualFh() {
            return actualFh;
        }



        public String getActualFhCN() {
            return "实发:"+StringUtil.getStr(actualFh)+"t";
        }

        public void setActualFh(double actualFh) {
            this.actualFh = actualFh;
        }

        public double getActualSh() {
            return actualSh;
        }


        public String getActualShCN2() {
            return StringUtil.getStr(actualSh)+"t";
        }

        public String getActualShCN() {
            return "实收:"+StringUtil.getStr(actualSh)+"t";
        }

        public void setActualSh(double actualSh) {
            this.actualSh = actualSh;
        }


        public int getPercent(){
            if(getPlanNumber()==0){
                return 0;
            }
            return (int) (100*getActualSh()/getPlanNumber());
        }





        public String getYKCN(){
            BigDecimal bd = new BigDecimal((actualSh-actualFh));
            bd = bd.setScale(1, RoundingMode.HALF_UP);
            return "盈亏:"+bd.toString()+"t";
        }

        public boolean isShowBtn(ResultsBean data) {
            return LocalValue.isNewOrderNeedMyMakeSure(data);
        }





    }
}
