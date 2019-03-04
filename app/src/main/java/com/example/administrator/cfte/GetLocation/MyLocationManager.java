package com.example.administrator.cfte.GetLocation;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.widget.Toast;

import com.example.administrator.cfte.MainActivity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MyLocationManager {

    //位置提供器
    private String provider;
    //位置服务
    private LocationManager locationManager;
    //所有实现IMyLocation接口的活动，都可以获取地理位置信息
    private IMyLocation activity;

    public MyLocationManager(IMyLocation activity) {
        this.activity = activity;
    }

    /**
     * 开始定位，获取经纬度
     */
    public Location beginLocatioon() {
        //获得位置服务
        locationManager = activity.getLocationManager();
        provider = judgeProvider(locationManager);
        //有位置提供器的情况
        if (provider != null) {
            //为了压制getLastKnownLocation方法的警告
            if (ActivityCompat.checkSelfPermission(activity.getMyContext(), Manifest.permission.ACCESS_FINE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED
                    && ActivityCompat.checkSelfPermission(activity.getMyContext(), Manifest.permission.ACCESS_COARSE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED) {
                return null;
            }
            return locationManager.getLastKnownLocation(provider);
        }else{
            //不存在位置提供器的情况
            Toast.makeText(activity.getMyContext(),"不存在位置提供器的情况", Toast.LENGTH_SHORT).show();
        }
        return null;
    }

    /**
     * 根据经纬度进行反地理编码
     */
    public void getLocationByLonAndLat(Location location, String lat, String lon) {
        String latitude = lat;//纬度
        String longitude = lon;//经度
        if(location != null){
            latitude = location.getLatitude()+"";
            longitude = location.getLongitude()+"";
        }
        //通过Retrofit2.0进行web请求，进行反地理编码
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MainActivity.BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IApiServer w = retrofit.create(IApiServer.class);
        Call<MyLocationBean> weatherBeanCall = w.locationInfo(getParams(latitude, longitude));
        weatherBeanCall.enqueue(new Callback<MyLocationBean>() {
            @Override
            public void onResponse(Call<MyLocationBean> call, Response<MyLocationBean> response) {
                //反地理编码成功
                activity.onSuccessGeocoder(response);
            }

            @Override
            public void onFailure(Call<MyLocationBean> call, Throwable t) {
                activity.onFileGeocoder(t);
            }
        });
    }

    /**
     * 判断是否有可用的内容提供器
     * @return 不存在返回null
     */
    private String judgeProvider(LocationManager locationManager) {
        List<String> prodiverlist = locationManager.getProviders(true);
        if(prodiverlist.contains(LocationManager.NETWORK_PROVIDER)){
            return LocationManager.NETWORK_PROVIDER;//网络定位
        }else if(prodiverlist.contains(LocationManager.GPS_PROVIDER)) {
            return LocationManager.GPS_PROVIDER;//GPS定位
        }else{
            Toast.makeText(activity.getMyContext(),"没有可用的位置提供器", Toast.LENGTH_SHORT).show();
        }
        return null;
    }

    /**
     * 获取需要的参数
     */
    private Map<String, String> getParams(String lat, String lon) {
        Map<String, String> map = new HashMap<>();
        map.put("output","json");
        map.put("pois","1");
        map.put("ak", MainActivity.AK);
        map.put("location",lat+","+lon);
        return map;
    }

}
