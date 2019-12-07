package com.CENG319.ceng319assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class demo_03 extends AppCompatActivity {
    private Button btnPre,btnNext,btnBack,btn_01,btn_02;
    private ViewSwitcher viewSwitcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_03);

        //Find all of view by id
        findAllView();

        //Change view to next view(in demo_03,change button to next button)
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSwitcher.showNext();
            }
        });

        //change view to previous view(in demo_03, change button to previous button)
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSwitcher.showPrevious();
            }
        });

        //When press button(previous button) is pressed, message is toasted.
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg("First(Previous) Button is pressed!");
            }
        });

        //When click button(next button) is clicked, message is toasted.
        btn_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg("Second(Next) Button is clicked!");
            }
        });

        //Back to main screen
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    protected void findAllView(){
        viewSwitcher = findViewById(R.id.viewSwitcher_03);
        btnPre = findViewById(R.id.btn_pre);
        btnNext = findViewById(R.id.btn_next);
        btnBack = findViewById(R.id.btn_back);
        btn_01 = findViewById(R.id.btn_01);
        btn_02 = findViewById(R.id.btn_02);
    }

    //Function for toast message
    private void toastMsg(String msgToast){
        Toast toast = Toast.makeText(this,msgToast,Toast.LENGTH_LONG);
        toast.show();
    }

}
