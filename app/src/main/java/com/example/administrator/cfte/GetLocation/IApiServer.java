package com.example.administrator.cfte.GetLocation;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;


public interface IApiServer {

    @GET("geocoder/v2/")
    Call<MyLocationBean> locationInfo(@QueryMap Map<String, String> params);
}
