package com.siweisoft.heavycenter.view.text;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * Created by summer on 2018/3/11 13:01.
 */

@SuppressLint("AppCompatCustomView")
public class MarqTextView extends TextView {

    public MarqTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setSelected(true);
    }

    @Override
    protected void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        setSelected(true);
    }
}
