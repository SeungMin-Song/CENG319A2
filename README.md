
# ViewSwitcher - by. Seung Min Song

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

 Before you use this conponent, you have to import android.widget.ViewSwitcher at top.

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

## An Example Project(Demo)
It is Demo of ViewSwitcher. It is diffrent project with step. In this example project, you can test four of demo that using diffrent child views. Before you run ViewSwitcher Demo project, please watch this gif.

![gif demo](https://github.com/SeungMin-Song/CENG319A2/blob/master/ForREADME.md/ViewSwitcher_Demo.gif)
  
## The Code of project Demo
This is sample code of how to use the ViewSwitcher


## Reference
https://developer.android.com/reference/android/widget/ViewSwitcher
https://developer.android.com/guide/topics/manifest/uses-sdk-element.html#ApiLevels
https://abhiandroid.com/ui/viewswitcher 
