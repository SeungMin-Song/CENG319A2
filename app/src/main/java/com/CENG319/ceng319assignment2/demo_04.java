package com.CENG319.ceng319assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewSwitcher;

//Demo_04 displays 3 items(image, button, text) in one view using layer
public class demo_04 extends AppCompatActivity {
    private Button btnPre,btnNext,btnBack,btn_04,btn_05;
    private ViewSwitcher viewSwitcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_04);

        //Find all of view by id
        findAllView();

        //change view to next view(In demo_04, change image to next image)
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSwitcher.showNext();
            }
        });

        //change view to previous view(In demo_04, change image to previous image)
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSwitcher.showPrevious();
            }
        });

        //When press button(previous button) is pressed, message is toasted.
        btn_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg("First(Previous) Button is pressed!");
            }
        });

        //When click button(next button) is clicked, message is toasted.
        btn_05.setOnClickListener(new View.OnClickListener() {
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
        viewSwitcher = findViewById(R.id.viewSwitcher_04);
        btnPre = findViewById(R.id.btn_pre);
        btnNext = findViewById(R.id.btn_next);
        btnBack = findViewById(R.id.btn_back);
        btn_04 = findViewById(R.id.btn_04);
        btn_05 = findViewById(R.id.btn_05);
    }

    //Function for toast message
    private void toastMsg(String msgToast){
        Toast toast = Toast.makeText(this,msgToast,Toast.LENGTH_LONG);
        toast.show();
    }
}
