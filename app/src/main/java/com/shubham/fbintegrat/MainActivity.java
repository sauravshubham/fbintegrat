package com.shubham.fbintegrat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment m=new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.main,m).commit();
    }
}