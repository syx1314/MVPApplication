package com.trsoft.app.mvpapplication.mvp.login;

import com.trsoft.app.lib.http.ApiResultBean;
import com.trsoft.app.lib.mvp.BaseModel;
import com.trsoft.app.lib.mvp.IBaseListener;
import com.trsoft.app.lib.mvp.IBaseView;
import com.trsoft.app.mvpapplication.constant.Constant;


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
    public abstract  class ILoginModel extends BaseModel {


        abstract void sendCode(String phone, ILoginListener loginListener);
        abstract void login(String phone, String code, ILoginListener loginListener);
    }

}
