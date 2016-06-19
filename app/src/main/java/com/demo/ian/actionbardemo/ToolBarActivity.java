package com.demo.ian.actionbardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ToolBarActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 隐去电池等图标和一切修饰部分（状态栏部分）
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // 隐去标题栏（程序的名字）
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_tool_bar);
        ButterKnife.bind(this);

        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);//设置导航栏图标
        toolbar.setLogo(R.mipmap.ic_launcher);//设置app logo
        toolbar.setTitle("Title");//设置主标题
        toolbar.setSubtitle("Subtitle");//设置子标题
        toolbar.inflateMenu(R.menu.base_toolbar_menu);//设置右上角的填充菜单
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int menuItemId = item.getItemId();
                if (menuItemId == R.id.action_search) {
                    Toast.makeText(ToolBarActivity.this, R.string.menu_search, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_notification) {
                    Toast.makeText(ToolBarActivity.this, R.string.menu_notifications, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_item1) {
                    Toast.makeText(ToolBarActivity.this, R.string.item_01, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_item2) {
                    Toast.makeText(ToolBarActivity.this, R.string.item_02, Toast.LENGTH_SHORT).show();
                } else if (menuItemId == R.id.action_item3) {
                    Toast.makeText(ToolBarActivity.this, R.string.item_03, Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

    }
}
