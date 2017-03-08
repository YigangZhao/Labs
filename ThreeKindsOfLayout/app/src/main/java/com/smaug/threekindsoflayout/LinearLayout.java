package com.smaug.threekindsoflayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearLayout extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        Button btn1= (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn1:
                Intent intent=new Intent(LinearLayout.this,RelativeLayout.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
