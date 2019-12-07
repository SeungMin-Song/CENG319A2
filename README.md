
# ViewSwitcher - by. Seung Min Song
## The Intoduction
On Android, ViewSwitcher is a subclass of ViewAnimator used for switching between views. Element of the transition widget that helps to add a transition to the view. It is primarily useful for animate views on the screen. ViewSwitcher smoothly transitions between two views (e.g. TextView, ImageView or any layout), so it provides a way to switch from one view to another with proper animation. You can use the factory or add your own to create a view for the ViewSwitcher widget.

## The History

```
java.lang.Object
   ↳	android.view.View
 	   ↳	android.view.ViewGroup
 	 	   ↳	android.widget.FrameLayout
 	 	 	   ↳	android.widget.ViewAnimator
 	 	 	 	   ↳	android.widget.ViewSwitcher
```

## The Major methods/attributes

<h4>import android.widget.ViewSwitcher;</h4>

```
import android.widget.ViewSwitcher;
```

<h4>private ViewSwitcher viewSwitcher;</h4>

```
private ViewSwitcher viewSwitcher;
```

<h4>showNext();</h4>

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

```
//change view to previous view(In demo_01, change image to previous image)
btnPre.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        viewSwitcher.showPrevious();
    }
});
```




## An Example Project(Demo)
It is Demo of ViewSwitcher. Before you run ViewSwitcher Demo project, please watch this gif.

![gif demo](https://github.com/SeungMin-Song/CENG319A2/blob/master/ForREADME.md/ViewSwitcher_Demo.gif)
  
## The Code
This is sample code of how to use the ViewSwitcher
### Demo_01 Code
<h3>layout(xml file)</h3>

```
  <ViewSwitcher
        android:id="@+id/viewSwitcher_01"
        android:layout_width="341dp"
        android:layout_height="309dp"
        android:layout_alignParentLeft="true"
        android:layout_alignParentTop="true"
        android:inAnimation="@android:anim/slide_in_left"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.272">

        <ImageView
            android:id="@+id/imageView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:srcCompat="@drawable/ryan_02" />

        <ImageView
            android:id="@+id/imageView2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            app:srcCompat="@drawable/ryan_01"
            tools:layout_editor_absoluteX="6dp"
            tools:layout_editor_absoluteY="424dp" />
  </ViewSwitcher>
  <Button
        android:id="@+id/btn_pre"
        android:layout_width="92dp"
        android:layout_height="44dp"
        android:layout_marginStart="71dp"
        android:layout_marginLeft="71dp"
        android:text="Previous"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.707" />

  <Button
        android:id="@+id/btn_next"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="NEXT"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.798"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.711" />
```

## Reference
https://developer.android.com/reference/android/widget/ViewSwitcher
