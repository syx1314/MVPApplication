package com.trsoft.app.mvpapplication.mvp;


import com.trsoft.app.mvpapplication.R;
import com.trsoft.app.mvpapplication.mvp.base.BaseActivity;
import com.trsoft.app.mvpapplication.mvp.base.IBasePresenter;

public class Mvp2Activity extends BaseActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_mvp2;
    }

    @Override
    protected void createPersenter() {

    }

    @Override
    public void error(String msg) {

    }
}
