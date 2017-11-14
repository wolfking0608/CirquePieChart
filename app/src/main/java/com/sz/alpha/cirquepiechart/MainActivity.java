package com.sz.alpha.cirquepiechart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvv)
    TextView mTvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    protected void init() {
        initView();
        initData();
        initEvent();
    }

    //初始化视图
    protected void initView() {

    }

    //初始化数据
    private void initData() {

    }

    //初始化事件
    protected void initEvent() {

    }

}
