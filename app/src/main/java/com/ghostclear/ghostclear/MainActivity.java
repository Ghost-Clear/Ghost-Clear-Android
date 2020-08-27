package com.ghostclear.ghostclear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataBaseHelper dataBaseHelper = new DataBaseHelper(MainActivity.this, "data.db", null, 1);
        Login test = new Login(true, "varun");
        dataBaseHelper.addLoginItem(test);
    }
}