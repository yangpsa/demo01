package com.bawei.myapplicationrk01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * @Author：DELL
 * @E-mail： 463211790@qq.com
 * @Date：2019/3/13 8:58
 * @Description：描述信息
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        initView();
        initData();
        bindEvent();

    }

    public abstract int bindLayout();

    protected abstract void initView();
    protected abstract void initData();
    protected abstract void bindEvent();

    protected <T extends View> T bindView(int resId){
        return (T) findViewById(resId);
    }
}
