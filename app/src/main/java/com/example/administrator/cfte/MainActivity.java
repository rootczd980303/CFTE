package com.example.administrator.cfte;
/**
 * 作者：欧阳文君
 */

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.cfte.GetLocation.IMyLocation;
import com.example.administrator.cfte.GetLocation.MyLocationBean;
import com.example.administrator.cfte.GetLocation.MyLocationManager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements IMyLocation,ViewPager.OnPageChangeListener {

    private ViewPager vp;
    private MyAdapter mAdapter;
    private ArrayList<Fragment> data;
    private TextView time,date,dianliang,location;

    private F1 f1;
    private F2 f2;
    private F3 f3;
    private F4 f4;

    //当Android6.0系统以上时，动态获取权限
    private static final String[] PERMISSIONS = new String[]{
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.INTERNET};

    //权限的标志
    private static final  int PERMISSION_CODES = 1001;
    private boolean permissionGranted = true;

    //反地理编码的Ak
    public static String AK = "LzkwGACITXdeWKZDYNaQhdhpG7oSfiWy";
    //反地理编码请求网址
    public static String BaseUrl = "http://api.map.baidu.com/";

    private LinearLayout ll;
    private boolean run = false;
    private final Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            requestPermission();
        }
        init();

        if(!permissionGranted){
            Toast.makeText(this, "请打开权限", Toast.LENGTH_SHORT).show();
            return;
        }
        MyLocationManager manager = new MyLocationManager(this);
        manager.getLocationByLonAndLat(manager.beginLocatioon(),"","");

        //一秒刷新一次
        run = true;
        handler.postDelayed(task, 1000);
    }

    private final Runnable task = new Runnable() {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            if (run) {
                SetupData();
                handler.postDelayed(this, 1000);
            }
        }
    };
    //@Override
    //public void onClick(View v) {
    //    switch (v.getId()) {
    //        case R.id.btn1:
    //            f4 = new F4();
    //            data.add(f4);
    //            mAdapter.setData(data);
    //            break;
    //    }
    //}

    //下面三个是ViewPager 滑动监听
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    /**
     * 滑动监听回调
     *
     * @param position 第一页0 第二页1 第三页2   显示的是到哪个页面的时候  比如第一页到第二页就是1
     *                 第二页到第一页就是0
     */
    @Override
    public void onPageSelected(int position) {
        ll.removeAllViews();
        //总共的页数
        int page = data.size();
        for (int i = 0; i < page; i++) {
            Point point = new Point(this);
            if (i == position) {
                point.setSelected(true);
            } else {
                point.setSelected(false);
            }
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(50, 50);
            params.leftMargin = 0;
            params.topMargin = 0;
            ll.addView(point, params);
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public void SetupData(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        if(minute<10){
            time.setText(hour+":0"+minute);
        }else{
            time.setText(hour+":"+minute);
        }
        date.setText(year+"年"+month+"月"+day+"日");

        BatteryManager batteryManager = (BatteryManager)getSystemService(BATTERY_SERVICE);
        int battery = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
        dianliang.setText(battery+"");

    }

    public void init(){
        vp = (ViewPager) findViewById(R.id.vp);
        time = (TextView) findViewById(R.id.tv_time);
        date = (TextView) findViewById(R.id.tv_date);
        dianliang = (TextView) findViewById(R.id.tv_dianliang);
        location = (TextView) findViewById(R.id.tv_location);

        data = new ArrayList<>();
        f1 = new F1();
        f2 = new F2();
        f3 = new F3();
        data.add(f1);
        data.add(f2);
        data.add(f3);
        mAdapter = new MyAdapter(getSupportFragmentManager(), data);
        vp.setAdapter(mAdapter);
        vp.addOnPageChangeListener(this);
        ll = (LinearLayout) findViewById(R.id.ll);
        vp.setCurrentItem(1);
    }

    @Override
    public LocationManager getLocationManager() {
        return (LocationManager) (getSystemService(LOCATION_SERVICE));
    }

    @Override
    public Context getMyContext() {
        return this;
    }

    @Override
    public void onSuccessGeocoder(Response<MyLocationBean> response) {
        if(response != null){
            String locations = response.body().getResult().getFormatted_address();
            location.setText(locations);
        }
    }

    @Override
    public void onFileGeocoder(Throwable t) {

    }

    /**
     * 动态的进行权限请求
     */
    @TargetApi(Build.VERSION_CODES.M)
    private void requestPermission(){
        List<String> p = new ArrayList<>();
        for(String permission :PERMISSIONS){
            if(ContextCompat.checkSelfPermission(this,permission) != PackageManager.PERMISSION_GRANTED){
                p.add(permission);
            }
        }
        if(p.size() > 0){
            requestPermissions(p.toArray(new String[p.size()]),PERMISSION_CODES);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case PERMISSION_CODES:
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_DENIED){
                    permissionGranted = false;
                }else {
                    permissionGranted = true;
                }
                break;
        }
    }
}

