package com.siweisoft.heavycenter.view.input;

//by summer on 2017-12-27.

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.siweisoft.heavycenter.R;

public class SearchBindUnitMyceItem extends LinearLayout {

    EditText editText;

    View search;

    public SearchBindUnitMyceItem(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs){
        LayoutInflater.from(context).inflate(R.layout.item_myce_unit_bind_search,this,true);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.style_common);
        search = findViewById(R.id.iv_search);
        editText = (EditText) findViewById(R.id.et_name);
        editText.setHint(a.getString(R.styleable.style_common_txt_mid));
        editText.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                search.setTag(R.id.data,s.toString());
            }
        });


        if(a.getInt(R.styleable.style_common_txt_maxlenth,-1)!=-1){
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(a.getInt(R.styleable.style_common_txt_maxlenth,-1))});
        }
    }

    public EditText getEditText() {
        return editText;
    }
}
