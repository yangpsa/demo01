package com.bawei.myapplicationrk01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {


    private EditText edi_name;
    private EditText edi_pwd;
    private Button log;
    private Button reg;

    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        edi_name = bindView(R.id.edi_name);
        edi_pwd = bindView(R.id.edi_pwd);
        log = bindView(R.id.log);
        reg = bindView(R.id.reg);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void bindEvent() {

    }
}
