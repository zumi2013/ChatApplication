package com.poc.chat_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "yehyazzzzzzzzzzzzz", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "noohu8", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "7", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"Rifayee",Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"Zumi",Toast.LENGTH_SHORT).show();

    }
}