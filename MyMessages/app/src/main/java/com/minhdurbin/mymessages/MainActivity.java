package com.minhdurbin.mymessages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        //this logs to the console; useful for debugging
        Log.i("info", "Inside of onClick1 method");
        //this prints to the actual app; user will see this
        Toast.makeText(this, "you just click button 1", Toast.LENGTH_LONG).show();
    }

    public void onClick2(View view) {
        //this logs to the console; useful for debugging
        Log.i("info", "Inside of onClick2 method");
        //this prints to the actual app; user will see this
        Toast.makeText(this, "you just click button 2", Toast.LENGTH_LONG).show();
    }
}