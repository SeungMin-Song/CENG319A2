package com.CENG319.ceng319assignment2;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button demo01,demo02,demo03,demo04,endApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find all of view by id
        findAllView();

        //Move MainActivity screen to Demo_01 screen
        demo01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_demo01 = new Intent(MainActivity.this, demo_01.class);
                startActivity(intent_demo01);
            }
        });

        //Move MainActivity screen to Demo_02 screen
        demo02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_demo02 = new Intent(MainActivity.this, demo_02.class);
                startActivity(intent_demo02);
            }
        });

        //Move MainActivity screen to Demo_03 screen
        demo03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_demo03 = new Intent(MainActivity.this, demo_03.class);
                startActivity(intent_demo03);
            }
        });

        //Move MainActivity screen to Demo_04 screen
        demo04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_demo04 = new Intent(MainActivity.this, demo_04.class);
                startActivity(intent_demo04);
            }
        });

        //Finish application
        endApp.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                finishAndRemoveTask();
            }
        });
    }

    protected void findAllView(){
        demo01 = findViewById(R.id.btn_demo01);
        demo02 = findViewById(R.id.btm_demo02);
        demo03 = findViewById(R.id.btm_demo03);
        demo04 = findViewById(R.id.btm_demo04);
        endApp = findViewById(R.id.btn_endDemo);
    }
}
