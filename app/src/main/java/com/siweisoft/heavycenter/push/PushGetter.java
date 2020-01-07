package com.siweisoft.heavycenter.data.netd.jpush;

//by summer on 2017-12-25.

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

import com.blankj.utilcode.util.LogUtils;
import com.siweisoft.heavycenter.data.netd.jpush.main.MainPush;

import org.greenrobot.eventbus.EventBus;

import cn.jpush.android.api.JPushInterface;

public class PushGetter extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        switch (intent.getAction()){
            case JPushInterface.ACTION_NOTIFICATION_OPENED:
                if(bundle!=null){
                    MainPush mainPush = new MainPush();
                    mainPush.setMsg(bundle.getString(JPushInterface.EXTRA_EXTRA));
                    EventBus.getDefault().post(mainPush);
                }
                break;
            case JPushInterface.ACTION_MESSAGE_RECEIVED:
                if(bundle!=null){
                    LogUtils.e(bundle.getString(JPushInterface.EXTRA_ALERT));
                    LogUtils.e(bundle.getString(JPushInterface.EXTRA_MESSAGE));
                    LogUtils.e(bundle.getString(JPushInterface.EXTRA_EXTRA));
                    if(TextUtils.isEmpty(bundle.getString(JPushInterface.EXTRA_EXTRA))){
                        return;
                    }
                    if(!TextUtils.isEmpty(bundle.getString(JPushInterface.EXTRA_ALERT))){
                        return;
                    }
                    EventBus.getDefault().post(bundle.getString(JPushInterface.EXTRA_EXTRA));


                }
                break;
        }






    }
}
