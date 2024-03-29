
# ViewSwitcher

	by. Seung Min Song N01234892

## The Intoduction

On Android, ViewSwitcher is a subclass of ViewAnimator used for switching between views. Element of the transition widget that helps to add a transition to the view. This is mainly useful for animated views of the screen. The ViewSwitcher switches smoothly between two views so you can switch from one view to another with the appropriate animation. You can use the factory or add your own to create a view for the ViewSwitcher widget.

ViewSwitcher can get 2 views in one viewSwitcher. If you include more than one view in a ViewSwitcher, the eorror message is displayed even though the build is successful.

  ![error msg](https://github.com/SeungMin-Song/CENG319A2/blob/master/ForREADME.md/error_msg.PNG)


## The History

The ViewSwitcher is added in *API level 1. It means ViewSwitcher is base conponent and it was release with Android 1.0.
So, ViewSwitcher's indroduced date is Dec/8/2014.

*API level is an integer value that uniquely identifies the framework API revision provided by the Android platform version.

The ViewSwicher is subclass of ViewAnimater. It's origin is java.lang.Object.

```
java.lang.Object
   ↳	android.view.View
 	   ↳	android.view.ViewGroup
 	 	   ↳	android.widget.FrameLayout
 	 	 	   ↳	android.widget.ViewAnimator
 	 	 	 	   ↳	android.widget.ViewSwitcher
```

 Before you use this component, you have to import android.widget.ViewSwitcher at top.

```
	improt android.widget.ViewSwitcher;
```

## Major Methods 
### showNext(); - This method(function) shows up next child view. 

example code)

```
   //change view to next view(In demo_01, change image to next image)
   btnNext.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             viewSwitcher.showNext();
         }
   });
```

### showPrevious(); - This method(function) shows up previous child view.

example code)

```
   //change view to previous view(In demo_01, change image to previous image)
   btnPre.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           viewSwitcher.showPrevious();
       }
   });
```

## How to Create (Basic steps with major methods) - https://github.com/SeungMin-Song/StepOfViewSwitcher 
	These are basic steps with major methods.
	
### Step_01: Create project with Empty project.

### Step_02: Add ViewSwitcher conponent to activity_main.xml
	
```
	<ViewSwitcher
        android:id="@+id/vSwitcher"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

            <!-- We will put 2 child views in here-->
    
    </ViewSwitcher>
```
	
### Step_03: Set the size of the view switcher to the size you want.
	
![set size ViewSwitcher](https://github.com/SeungMin-Song/CENG319A2/blob/master/ForREADME.md/setSizeOfViewSwitcher.PNG)

### Step_04: Add 2 child views(ex. Button, ImageView, TextView, layout, and etc) to inside of ViewSwitcher(under of command - "We will put 2 child views in here"). I put imageView and Button to ViewSwitcher. 
	
```
		<ImageView
            android:id="@+id/imageView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:srcCompat="@mipmap/ic_launcher" />

        <Button
            android:id="@+id/button"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Button" />
```

### Step_05: Add 2 button for for showPrevious() method and one for showNext() method. These two button will switch two views.
	
```
	<Button
        android:id="@+id/btn_pre"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="52dp"
        android:layout_marginLeft="52dp"
        android:layout_marginBottom="212dp"
        android:text="Previous"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent" />
		
	<Button
        android:id="@+id/btn_next"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="68dp"
        android:layout_marginRight="68dp"
        android:layout_marginBottom="212dp"
        android:text="next"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />
```

### Step_06: Import classes and declare variables in MainActivity.java. After that find views by id what you used in activity_main.xml.
	
```
	// import button, view, and viewSwitcher classes
	import android.widget.Button;
	import android.widget.ViewSwitcher;
	import android.view.View;
```

```
	public class MainActivity extends AppCompatActivity {
    
		
	//Declare ViewSwitcher variable called vSwitcher
	ViewSwitcher vSwitcher;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		//Declare 2 buttons: btnPre and btnNext
		Button btnPre, btnNext;
			
		//Find view by id (ViewSwitcher, btnPre, btnNext)
		vSwitcher = findViewById(R.id.vSwitcher);
		btnPre = findViewById(R.id.btn_pre);
		btnNext = findViewById(R.id.btn_next);
```

### Step_07: Create code that when Next button is pressed, viewSwitcher switches view to next view

```
	//When next button is pressed, viewSwitcher switches view to next view
	btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vSwitcher.showNext();
            }
        });
```

### Step_08: Create code that when previous button is pressed, viewSwitcher switches view to previous view.
		
```
 	//When previous button is pressed, viewSwitcher switches view to Previous view   
	btnPre.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            vSwitcher.showPrevious();
        }
    });
```

### Step_09: Build project and run project app.When you preess Next or Previous button the view will be shage such as pictures
		
![Result of step_pre](https://github.com/SeungMin-Song/CENG319A2/blob/master/ForREADME.md/Step_previous_view.PNG)
![Result of step_next](https://github.com/SeungMin-Song/CENG319A2/blob/master/ForREADME.md/Step_next_view.PNG)

## An Example Project(Demo) - https://github.com/SeungMin-Song/CENG319A2

It is Demo of ViewSwitcher. It is diffrent project with step. In this example project, you can test four of demo that using diffrent child views (ImageView, TextView, Button, Layout). Before you run ViewSwitcher Demo project, please watch this gif. If you want to watch slowly, download video in here(https://github.com/SeungMin-Song/CENG319A2/blob/master/ForREADME.md/ViewSwitcher_4ofDemo.gif)

![gif file 4 of demo](https://github.com/SeungMin-Song/CENG319A2/blob/master/ForREADME.md/ViewSwitcher_4ofDemo.gif)
  
## The Code of project Demo

Unlike the step project, my demo project consists of one main activity and four demo activities, so I have a lot of code, so I will put just java code with xml link.

### MainActivity.java - MainActivity.java has five buttons. The top four buttons are associated with each demo, and the last one is the button to exit the application.

activity_main.xml: https://github.com/SeungMin-Song/CENG319A2/blob/master/app/src/main/res/layout/activity_main.xml

```
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

```

### Demo_01.java: demo_01.java is an activity that tests the ViewSwitcher with two ImageViews.

activity_demo_01.xml: https://github.com/SeungMin-Song/CENG319A2/blob/master/app/src/main/res/layout/activity_demo_01.xml

```
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

        //Find all of view by id
        findAllView();

        //change view to next view(In demo_01, change image to next image)
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSwitcher.showNext();
            }
        });

        //change view to previous view(In demo_01, change image to previous image)
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSwitcher.showPrevious();
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
        viewSwitcher = findViewById(R.id.viewSwitcher_01);
        btnPre = findViewById(R.id.btn_pre);
        btnNext = findViewById(R.id.btn_next);
        btnBack = findViewById(R.id.btn_back);

    }
}
```

### Demo_02.java: demo_02.java is an activity that tests the ViewSwitcher with two TextViews.

activity_demo_02.xml: https://github.com/SeungMin-Song/CENG319A2/blob/master/app/src/main/res/layout/activity_demo_02.xml

```
package com.CENG319.ceng319assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewSwitcher;

public class demo_02 extends AppCompatActivity {
    private Button btnPre,btnNext,btnBack;
    private ViewSwitcher viewSwitcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_02);

        //Find all of view by id
        findAllView();

        //change view to next view(In demo_02, change image to next image)
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSwitcher.showNext();
            }
        });

        //change view to previous view(In demo_02, change image to previous image)
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewSwitcher.showPrevious();
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
        viewSwitcher = findViewById(R.id.viewSwitcher_02);
        btnPre = findViewById(R.id.btn_pre);
        btnNext = findViewById(R.id.btn_next);
        btnBack = findViewById(R.id.btn_back);

    }
}
```

### Demo_03.java: demo_03.java is an activity that tests the ViewSwitcher with two Buttons.

I added a function to toast the message to show that the button works in the ViewSwitcher. If you press a button, the messages for that button will be displayed.

In the activity_demo_03.xml file, there is a button commented out (id is btn_error). This is a button to check if an error occurs when three views are created in one view pointer. If you want to test three views, remove the comment brackets to test it out.(line 37 - 42 in activity_demo_03.xml)

activity_demo_03.xml: https://github.com/SeungMin-Song/CENG319A2/blob/master/app/src/main/res/layout/activity_demo_03.xml

```
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
```

### Demo_04.java: demo_04.java is an activity that tests the ViewSwitcher with two layout(LinearLayout).

demo_04 is a demo using layout. I put three views (ImageView, Button, TextView) in one layout, and included two layouts in the view switcher. And again, I added a toast function to make sure the button was working.

activity_demo_04.xml: https://github.com/SeungMin-Song/CENG319A2/blob/master/app/src/main/res/layout/activity_demo_04.xml

```
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

```

## Reference
https://developer.android.com/reference/android/widget/ViewSwitcher
https://developer.android.com/guide/topics/manifest/uses-sdk-element.html#ApiLevels
https://abhiandroid.com/ui/viewswitcher 
