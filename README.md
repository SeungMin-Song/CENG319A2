
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

## How to Create (Step with major methods) 

###Step_01 Create project

###Step_02 

###Step_03 

###Step_04 

###Step_05 


<h4>showNext();</h4>
This method(function) shows up next child view. 

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

<h4>showPrevious();</h4>
This method(function) shows up previous child view.

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


### An Example Project(Demo)
It is Demo of ViewSwitcher. Before you run ViewSwitcher Demo project, please watch this gif.

![gif demo](https://github.com/SeungMin-Song/CENG319A2/blob/master/ForREADME.md/ViewSwitcher_Demo.gif)
  

#### The Code of project Demo
This is sample code of how to use the ViewSwitcher


## Reference
https://developer.android.com/reference/android/widget/ViewSwitcher
https://developer.android.com/guide/topics/manifest/uses-sdk-element.html#ApiLevels
https://abhiandroid.com/ui/viewswitcher 

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

## How to Create (Step with major methods) 

###Step_01 Create project

###Step_02 

###Step_03 

###Step_04 

###Step_05 


<h4>showNext();</h4>
This method(function) shows up next child view. 

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

<h4>showPrevious();</h4>
This method(function) shows up previous child view.

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


### An Example Project(Demo)
It is Demo of ViewSwitcher. Before you run ViewSwitcher Demo project, please watch this gif.

![gif demo](https://github.com/SeungMin-Song/CENG319A2/blob/master/ForREADME.md/ViewSwitcher_Demo.gif)
  

#### The Code of project Demo
This is sample code of how to use the ViewSwitcher


## Reference
https://developer.android.com/reference/android/widget/ViewSwitcher
https://developer.android.com/guide/topics/manifest/uses-sdk-element.html#ApiLevels
https://abhiandroid.com/ui/viewswitcher 
