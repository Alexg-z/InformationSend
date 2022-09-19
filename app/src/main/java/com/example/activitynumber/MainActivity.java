package com.example.activitynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculadora (View view) {
        Intent calc = new Intent (this, calculadora.class);
        startActivity(calc);
    }

    public void random (View view) {
        Intent rand = new Intent (this, numrandom.class);
        startActivity(rand);
    }
}