package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {


    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);

        btn = (Button) findViewById(R.id.button2);
        btn.setText("hi 123");
        btn.setBackgroundColor(Color.BLACK);

    }
}