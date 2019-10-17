# Lesson_03_2019-20

 ** Create a new app named Button Click Counter (min api 17) **

1. add a Button, PlainText and TextView widgets
2. set constraints among them
3. add scrollbar to textview
4. Time to review our MainActivity (check details about what is an [Activity](https://developer.android.com/reference/android/app/Activity))
5. Add 3 fields in MainActivity class:
  - `EditText userInput`
  - `Button button`
  - `TextView textView`
6. Get widget objects by using `userInput = (EditText)findViewById(R.id.editText);`
7. Button Click and onClickListener
  - create a new OnClickListener (`View.OnClickListener onClickListener = new View.OnClickListener()`)
  - set the listener to the button
  - try to create a button counter message and append it on textView
  
8. To make textView scrollable, we must define a movementMethod on it (`setMovementMethod(new ScrollingMovementMethod());`) 
9. Change orientation and see what happens!
10. Monitor activity Lifecycle
11. Override the following Activity Lifecycle methods to review the lifecycle process
 - `onDestroy()`
 - `onStart()`
 - `onStop()`
 - `onRestart()`
 - `onPause()`
 - `onResume()`
 - `onSaveInstanceState()` 
 - `onRestoreInstanceState()` 
 
 12. add log messages with the logd shortcut command


![activity](https://developer.android.com/images/activity_lifecycle.png)

 13. Use Saved Instance state to keep text in textView `outState.putString(TEXT_CONTENTS, textView.getText().toString());`
 14. Use restoreInstanceState to handle the saved text
 
**Notes**
Although we're using the latest version of the Android SDK we can still create apps that run on older versions well it's actually the app compat library that makes that possible the good news is the app compat library has been updated for android nougat and we're now able to deploy applications using android nougat software functionality and also the version of the API and of course the cool thing we want to include in that case is the constraint layout and Google is sending updates to the app compat libraries on regular intervals to make sure things are updated so you can be assured that other support devices will come out over time using this new constraint layout as well go now all supported devices this time means everything going back to gingerbread which is API 9 so ultimately this means that as developers we can take advantage of the latest features while still allowing our apps to run on older devices. 
