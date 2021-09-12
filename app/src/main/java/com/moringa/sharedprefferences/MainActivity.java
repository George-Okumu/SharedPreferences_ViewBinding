package com.moringa.sharedprefferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.moringa.sharedprefferences.databinding.ActivityMainBinding;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    //For view binding
    ActivityMainBinding activityMainBinding;

    //sharedPreference thingy
    private SharedPreferences sharedPreference;

    //shared Preference Editor
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        sharedPreference = getSharedPreferences(Constants.MyPREFERENCES, Context.MODE_PRIVATE);
        editor = sharedPreference.edit();

        activityMainBinding.button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = activityMainBinding.editName.getText().toString();
        String email = activityMainBinding.editEmail.getText().toString();
        String password = activityMainBinding.editPassword.getText().toString();


        //Assigining the variables to their respective values inaitwa key value pair
        editor.putString(Constants.NAME, name);
        editor.putString(Constants.EMAIL, email);
        editor.putString(Constants.PASSWORD, password);

        editor.apply();

        Toast.makeText(MainActivity.this, "Thanks, this was awesome", Toast.LENGTH_LONG).show();


    }
}