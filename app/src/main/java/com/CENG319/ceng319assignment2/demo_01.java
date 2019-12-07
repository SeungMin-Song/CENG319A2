package com.CENG319.ceng319assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewSwitcher;

public class demo_01 extends AppCompatActivity {
    private Button btnPre,btnNext,btnBack;
    private ViewSwitcher viewSwitcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_01);

        findAllView();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSwitcher.showNext();
            }
        });

        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSwitcher.showPrevious();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    protected void findAllView(){
        viewSwitcher = findViewById(R.id.viewSwitcher_01);
        btnPre = findViewById(R.id.btn_pre);
        btnNext = findViewById(R.id.btn_next);
        btnBack = findViewById(R.id.btn_back);

    }
}
