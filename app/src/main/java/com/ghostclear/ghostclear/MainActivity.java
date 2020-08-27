package com.ghostclear.ghostclear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ghostclear.ghostclear.SQL_Database_Classes.DataBaseHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataBaseHelper dataBaseHelper = new DataBaseHelper(MainActivity.this, "data.db", null, 1);
        // TODO: change the Thread.sleep to a different sleep function
        if(dataBaseHelper.isFirstLogin()){
            try {
                Thread.sleep(3000);
                startActivity(new Intent(this, initialHelloPage.class));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        else{
            try {
                Thread.sleep(3000);
                startActivity(new Intent(this, HomePage.class));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}