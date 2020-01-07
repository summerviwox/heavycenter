package com.siweisoft.heavycenter.module.main.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.siweisoft.heavycenter.util.ActivityUtil;
import com.siweisoft.heavycenter.util.PermissionUtil;
import com.summer.x.base.ui.DE;
import com.summer.x.base.ui.UI;
import com.summer.x.base.ui.VA;
import com.summer.x.base.ui.XActivity;

public class MainCT extends XActivity<UI, DE, VA> {

//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ActivityUtil.被后台清理了就重启(getActivity(),savedInstanceState,MainCT.class);
//        if(!new PermissionUtil().go检查权限(getActivity(),getVA().getPermissions())){
//            return;
//        }
//        init();
//    }
//
//    private void init(){
//        getUI().initBottomMenu(getVA().getBottomNavigationItem(),new OnBottomSelectI(){
//            @Override
//            public void onTabSelected(int position) {
//                super.onTabSelected(position);
//                showHideFragment(getVA().getPages()[position],getVA().getPages()[getVA().getLastShowPage()]);
//                getVA().setLastShowPage(position);
//            }
//        });
//        getUI().initDrawerMenu(this);
//        loadMultipleRootFragment(getUI().getUI().contentContent.getId(),0,getVA().getPages());
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if(!new PermissionUtil().onRequestPermissionsResult(getActivity(),requestCode,grantResults)){
//            return;
//        }
//        init();
//    }

}
