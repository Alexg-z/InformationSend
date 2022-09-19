package com.example.activitynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    private Button btn3;
    private TextView txres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txres = (TextView) findViewById(R.id.txvres);

        String resultado =getIntent().getStringExtra("resultado");
        txres.setText("- " + resultado + " -");
    }

    public void regresar (View view) {
        Intent ant = new Intent (this, calculadora.class);
        startActivity(ant);
    }
}