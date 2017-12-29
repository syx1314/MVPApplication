package com.trsoft.app.mvpapplication.mvp.login;

import com.trsoft.app.mvpapplication.http.ApiResultBean;
import com.trsoft.app.mvpapplication.mvp.base.BaseModel;
import com.trsoft.app.mvpapplication.mvp.base.IBaseListener;
import com.trsoft.app.mvpapplication.mvp.base.IBaseView;

/**
 * 登录契约类
 * Created by yyj on 2017/12/28.
 */

public interface LoginContact {

    public interface ILoginListener extends IBaseListener {
        void codeResponse(ApiResultBean<String> apiResult);

    }

    public interface ILoginView extends IBaseView {
        void sendCodeResult(ApiResultBean<String> apiResult) ;
        void loginResult();
    }
    public abstract  class ILoginModel extends BaseModel  {
        abstract void sendCode(String phone, ILoginListener loginListener);
        abstract void login(String phone, String code, ILoginListener loginListener);
    }

}
