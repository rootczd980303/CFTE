package com.example.administrator.cfte;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class F2 extends Fragment {

    private ImageBt ib1;
    private ImageBt ib2;
    private ImageBt ib3;
    private ImageBt ib4;
    private ImageBt ib5;
    private ImageBt ib6;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.f2, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ib1 = (ImageBt) getView().findViewById(R.id.bt_call);
        ib1.setTextViewText("打电话");
        ib1.setImageResource(R.mipmap.phone);
        //ib1.setTextViewPadding(70);

        ib1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //在这里可以实现点击事件
                Intent dialIntent =  new Intent(Intent.ACTION_CALL_BUTTON);//跳转到拨号界面
                startActivity(dialIntent);
            }
        });

        ib2 = (ImageBt) getView().findViewById(R.id.bt_note);
        ib2.setTextViewText("看短信");
        ib2.setImageResource(R.mipmap.note);
        //ib2.setTextViewPadding(70);

        ib2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //在这里可以实现点击事件
                Intent dialIntent =  new Intent(Intent.ACTION_SENDTO);//跳转到发短信界面
                try {
                    startActivity(dialIntent);
                } catch(ActivityNotFoundException exception) {
                    Toast.makeText(getActivity(), "no activity", Toast.LENGTH_SHORT).show();
                }

            }
        });

        ib3 = (ImageBt) getView().findViewById(R.id.bt_photograph);
        ib3.setTextViewText("打开相机");
        ib3.setImageResource(R.mipmap.photograph);
        ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CAMERA,Manifest.permission.WRITE_EXTERNAL_STORAGE},1);

        ib3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //在这里可以实现点击事件
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(cameraIntent);
            }
        });

        ib4 = (ImageBt) getView().findViewById(R.id.bt_photo);
        ib4.setTextViewText("查看相册");
        ib4.setImageResource(R.mipmap.photo);

        ib4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //在这里可以实现点击事件
                Intent intent = new Intent("android.intent.action.GET_CONTENT");//跳转到相册界面
                intent.setType("image/*");
                startActivityForResult(intent, 1004);
            }
        });

        ib5 = (ImageBt) getView().findViewById(R.id.bt_set);
        ib5.setTextViewText("打开设置");
        ib5.setImageResource(R.mipmap.set);

        ib5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //在这里可以实现点击事件
                Intent dialIntent =  new Intent(Settings.ACTION_SETTINGS);//跳转到设置界面
                startActivity(dialIntent);
            }
        });

        ib6 = (ImageBt) getView().findViewById(R.id.bt_ice);
        ib6.setTextViewText("紧急电话");
        ib6.setImageResource(R.mipmap.ice);

        ib6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //在这里可以实现点击事件
                Intent dialIntent =  new Intent(Intent.ACTION_CALL_BUTTON);//跳转到拨号界面
                startActivity(dialIntent);
            }
        });
    }

}