package com.poc.chat_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "noohu1", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "noohu2", Toast.LENGTH_LONG).show();
    }
}