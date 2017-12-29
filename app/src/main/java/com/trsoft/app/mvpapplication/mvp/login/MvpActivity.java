package com.trsoft.app.mvpapplication.mvp.login;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.trsoft.app.lib.utils.DialogUtil;
import com.trsoft.app.lib.utils.Validator;
import com.trsoft.app.mvpapplication.R;
import com.trsoft.app.mvpapplication.http.ApiResultBean;
import com.trsoft.app.mvpapplication.mvp.base.BaseActivity;


public class MvpActivity extends BaseActivity<LoginPresenter> implements LoginContact.ILoginView {

    private TextView sendCode;
    private EditText etPhone;
    private LoginPresenter persenter;

    @Override
    protected int getLayout() {
        return R.layout.activity_mvp;
    }

    @Override
    protected void createPersenter() {
        persenter = new LoginPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        persenter.attachV(this);
        etPhone = (EditText) findViewById(R.id.et_phone);
        sendCode = (TextView) findViewById(R.id.sendCode);
        sendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Validator.isNotEmpty(etPhone.getText().toString())) {
                    persenter.sendCode(etPhone.getText().toString());
                }
            }
        });
    }


    @Override
    public void sendCodeResult(ApiResultBean<String> apiResult) {

            DialogUtil.showAlert(this, apiResult.getMessage(), null);

    }


    @Override
    public void loginResult() {

    }


    @Override
    public void error(String msg) {
        DialogUtil.showAlert(this, msg, null);
    }
}
