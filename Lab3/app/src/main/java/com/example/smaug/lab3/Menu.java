package com.example.smaug.lab3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    TextView tv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tv_1 = (TextView) findViewById(R.id.tv_type);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menus, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.one://设置字体大小
                tv_1.setTextSize(10);
                break;
            case R.id.two:
                tv_1.setTextSize(16);
                break;
            case R.id.three:
                tv_1.setTextSize(20);
                break;
            case R.id.dark:
                tv_1.setTextColor(0xff000000);
                break;
            case R.id.red:
                tv_1.setTextColor(0xffff0000);
                break;
            case R.id.men_normalMenu:
                Toast.makeText(this, "你点击了菜单", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }


}