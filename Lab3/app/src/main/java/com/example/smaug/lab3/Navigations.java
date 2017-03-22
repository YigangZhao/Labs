package com.example.smaug.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Navigations extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigations);
        btn1= (Button) findViewById(R.id.nv_1);
        btn2= (Button) findViewById(R.id.nv_2);
        btn3= (Button) findViewById(R.id.nv_3);
        btn4= (Button) findViewById(R.id.nv_4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nv_1:
                Intent intentOne = new Intent(Navigations.this, MainActivity.class);
                startActivity(intentOne);
                break;
            case R.id.nv_2:
                Intent intentTwo = new Intent(Navigations.this, AlterDialog.class);
                startActivity(intentTwo);
                break;
            case R.id.nv_3:
                Intent intentThree = new Intent(Navigations.this, Menu.class);
                startActivity(intentThree);
                break;
            case R.id.nv_4:
                Intent intentFour = new Intent(Navigations.this, ActionModeTest.class);
                startActivity(intentFour);
                break;
            default:
                break;
        }
    }
}


