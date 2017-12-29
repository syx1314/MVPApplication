package com.trsoft.app.mvpapplication.mvp.login;

import com.orhanobut.logger.Logger;
import com.trsoft.app.mvpapplication.http.ApiResultBean;
import com.trsoft.app.mvpapplication.http.IApiReturn;
import com.trsoft.app.mvpapplication.http.UserApiService;




/**
 * Created by yyj on 2017/12/25.
 */

public class LoginModel extends LoginContact.ILoginModel {


    @Override
    public void sendCode(String phone, final LoginContact.ILoginListener loginListener) {
        //网络访问
        Subscribe(getApiService(UserApiService.class).registerCheckInfo(phone), new IApiReturn<String>() {
            @Override
            public void run(ApiResultBean<String> apiResult) {
                if (loginListener != null) {
                    loginListener.codeResponse(apiResult);
                }
            }

            @Override
            public void error(String message) {
                if (loginListener != null&&message!=null) {
                    loginListener.error(message);
                }
            }
        });

    }

    @Override
    public void login(String phone, String code, LoginContact.ILoginListener loginListener) {

    }

}
