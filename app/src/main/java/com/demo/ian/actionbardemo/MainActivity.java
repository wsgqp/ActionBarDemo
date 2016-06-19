package com.demo.ian.actionbardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick({ R.id.button1, R.id.button2})
    public void pickDoor(View door) {
        if (door.getId() == R.id.button1) {
            //跳转到ToolBarActivity
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, ToolBarActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, ZhiHuActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 隐去电池等图标和一切修饰部分（状态栏部分）
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // 隐去标题栏（程序的名字）
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
