package com.trsoft.app.mvpapplication.http;



import com.trsoft.app.lib.http.ApiResultBean;

import java.util.List;

import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import rx.Observable;


/**
 * 用户信息API
 * Created by huangzhe on 2017/10/31.
 */

public interface UserApiService {
    //region 用户相关


    /**
     * 发送验证码
     *
     * @param phone
     * @return
     */
    @PATCH("check_info/{phone}")
    Observable<ApiResultBean<String>> checkInfo(@Path("phone") String phone);

    /**
     * 检查版本
     *
     * @return
     */
    @GET("version/{type}")
    Observable<ApiResultBean<String>> version(@Path("type") String type);

    /**
     * 注册时发送短信验证码
     *
     * @param phone
     * @return
     */
    @PATCH("register_check_info/{phone}")
    Observable<ApiResultBean<String>> registerCheckInfo(@Path("phone") String phone);


    /**
     * 退出
     *
     * @return
     */
    @DELETE("logout")
    Observable<ApiResultBean<String>> logout();





    //读取广告页路径
    @GET("advertisement")
    Observable<ApiResultBean<List<String>>> advert();

}
