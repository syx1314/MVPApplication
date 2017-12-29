package com.trsoft.app.mvpapplication.mvp.login;


import com.orhanobut.logger.Logger;
import com.trsoft.app.mvpapplication.http.ApiResultBean;
import com.trsoft.app.mvpapplication.mvp.base.BasePresenter;

/**
 *
 * @author yyj
 * @date 2017/12/25
 */

public class LoginPresenter extends BasePresenter<LoginContact.ILoginView> implements LoginContact.ILoginListener {
    LoginModel model;
    LoginContact.ILoginView loginView;

    public LoginPresenter() {
        model = new LoginModel();

    }

    @Override
    public void attachV(LoginContact.ILoginView view) {
        super.attachV(view);
        this.loginView=view;
    }

    public void sendCode(String phone) {
        model.sendCode(phone, this);
    }

    public void login(String phone, String code) {
        model.login(phone, code, this);
    }

    @Override
    public void codeResponse(ApiResultBean<String> apiResult) {
        loginView.sendCodeResult(apiResult);
    }


    @Override
    public void error(String msg) {

            loginView.error(msg);

    }
}
