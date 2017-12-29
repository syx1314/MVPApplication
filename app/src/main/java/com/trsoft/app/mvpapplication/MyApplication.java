package com.trsoft.app.mvpapplication;

import com.trsoft.app.lib.BaseApplication;
import com.trsoft.app.lib.entity.ILoginConfig;

/**
 * Created by yyj on 2017/12/28.
 */

public class MyApplication extends BaseApplication {
    @Override
    public String getApiUrl() {
        return null;
    }

    @Override
    public void quit(boolean isClearData) {

    }

    @Override
    public Class getLoginActivityClass() {
        return null;
    }

    @Override
    public void saveLoginConfig(ILoginConfig mLoginConfig) {

    }

    @Override
    public ILoginConfig getLoginConfig() {
        return null;
    }
}
