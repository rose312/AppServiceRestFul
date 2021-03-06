package com.ywl5320.rxjavaretrofit.httpservice.serviceapi;


import com.ywl5320.rxjavaretrofit.beans.UpdateBean;
import com.ywl5320.rxjavaretrofit.beans.UserBean;
import com.ywl5320.rxjavaretrofit.httpservice.httpentity.HttpResult;


import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/**
 * Created by ywl on 2016/5/19.
 */
public interface UserService {

    /**
     * 注册模拟
     * @param userBean
     * @return
     */
    @PUT("user/register.do")
    Observable<HttpResult<UserBean>> register(@Body UserBean userBean);

    @POST("user/loginbypwd.do")
    Observable<HttpResult<UserBean>> login(@Query("phone") String phone, @Query("password") String password);

    @GET("user/userinfo.do")
    Observable<HttpResult<UserBean>> userinfo(@Query("phone") String phone);

    @GET("update/checkupdate.do")
    Observable<HttpResult<UpdateBean>> chedkUpdate(@Query("md5value") String md5value, @Query("versioncode") int versioncode, @Query("channelid") String channelid);

}
