package com.siweisoft.heavycenter.view.item;

//by summer on 2018-01-08.

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class CheckIV extends ImageView implements View.OnClickListener{

    private boolean check = false;


    public CheckIV(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }
    private void init(Context context, @Nullable AttributeSet attrs){
        setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        check = ! check;
        setSelected(check);
    }
}
