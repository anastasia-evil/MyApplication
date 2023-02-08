package com.example.myapplication;

import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //donde se ejecuta el codigo, te lo enseña
        Log.d("MainActivity", "Primer mensaje para depurar");
    }
}