package com.trsoft.app.mvpapplication.mvp.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.trsoft.app.lib.ActivitySupport;

/**
 * Created by yyj on 2017/12/27.
 */

public abstract class BaseActivity<P extends IBasePresenter> extends ActivitySupport implements IBaseView {

    private P persenter;
    protected Activity activity;


    protected abstract int getLayout();
    protected  abstract void createPersenter();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        createPersenter();
//        persenter.attachV(this);
        activity = this;
    }

    @Override
    protected void onDestroy() {
        if (persenter != null) {
            persenter.detachV();
        }
        super.onDestroy();
    }


}
