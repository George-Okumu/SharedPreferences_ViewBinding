package com.moringa.sharedprefferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.moringa.sharedprefferences.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    //For view binding
    ActivityMainBinding activityMainBinding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        activityMainBinding.button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == activityMainBinding.button1){
            Toast.makeText(MainActivity.this, "You really did great", Toast.LENGTH_LONG).show();
        }
    }
}