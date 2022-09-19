package com.example.activitynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pruebasuperada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebasuperada);
    }

    public void regresar (View view) {
        Intent numr = new Intent (this, numrandom.class);
        startActivity(numr);
    }
}