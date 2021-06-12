package com.nsg.pagingdemo;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface apiInterface {
//    http://tempapi.appx.co.in/get/test_titlebycourseidv2?start=-1&courseid=1&userid=1

    @Headers({"Client-Service:Appx", "Auth-Key:appxapi", "User-ID:1"})
    @GET("test_titlebycourseidv2?start=-1&courseid=1&userid=1")
    Call<LoginResponse> getAll();
}
