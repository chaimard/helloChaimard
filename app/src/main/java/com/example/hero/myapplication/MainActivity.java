package com.example.hero.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hero.myapplication.fragment.mainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment to Activity
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new mainFragment())
                    .commit();


        }


    }   //Main Method


}   //Main class
