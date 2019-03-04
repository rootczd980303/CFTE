package com.example.administrator.cfte.GetLocation;

import android.content.Context;
import android.location.LocationManager;

import retrofit2.Response;


public interface IMyLocation {

    //获取位置服务
    LocationManager getLocationManager();

    //获取当前上下文
    Context getMyContext();

    //当反编码成功的时候
    void onSuccessGeocoder(Response<MyLocationBean> response);

    //当反编码失败的时候
    void onFileGeocoder(Throwable t);
}
