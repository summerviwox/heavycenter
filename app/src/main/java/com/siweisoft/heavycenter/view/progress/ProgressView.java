package com.siweisoft.heavycenter.view.progress;

//by summer on 2018-01-03.

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;

import com.blankj.utilcode.util.ScreenUtils;
import com.siweisoft.heavycenter.R;

public class ProgressView extends RelativeLayout {

    ProValue proValue = new ProValue();

    View nowV;

    View minV;

    View child;

    float w= ScreenUtils.getScreenWidth();


    public ProgressView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, @Nullable AttributeSet attrs){
        LayoutInflater.from(context).inflate(R.layout.item_store_progress,this,true);
        child = getChildAt(0);
        nowV = findViewById(R.id.now);
        minV = findViewById(R.id.min);

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    public void setValues(float max, float min, float now){
        proValue.max = max;
        proValue.min = min;
        proValue.now = now;

        LayoutParams p = (LayoutParams) nowV.getLayoutParams();
        p.width = (int) (w*proValue.now/proValue.max);
        nowV.setLayoutParams(p);


        LayoutParams q = (LayoutParams) minV.getLayoutParams();
        q.leftMargin = (int) (w*proValue.min/proValue.max);
        minV.setLayoutParams(q);

        if(now<=min){
            nowV.setBackgroundResource(R.drawable.bg_hv_sharp10_gradient_yell_red);
        }

    }




    public ProValue getProValue() {
        return proValue;
    }
}
