package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import androidx.preference.PreferenceManager;
import android.os.Bundle;

import org.osmdroid.config.Configuration;

public class MainActivity extends AppCompatActivity {
@Override

protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Configuration.getInstance().load( getApplicationContext(),
        PreferenceManager.getDefaultSharedPreferences ( getApplicationContext()));
        setContextView(R.layout.activity_main);

        }

}