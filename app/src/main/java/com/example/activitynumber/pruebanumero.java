package com.example.activitynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class pruebanumero extends AppCompatActivity {

    private TextView txtcomprobar;
    private EditText txnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebanumero);

        txtcomprobar = (TextView) findViewById(R.id.txtcomprobar);
        txnum2 = (EditText) findViewById(R.id.txtnum3);

    }

    public void comprobarNumero (View view) {
        String valor2_string = txnum2.getText().toString();
        String valor1 = getIntent().getStringExtra("valor");

        int valor = Integer.parseInt(valor1);
        int valor2 = Integer.parseInt(valor2_string);

        if (valor == valor2) {
            Intent pass = new Intent(this, pruebasuperada.class);
            startActivity(pass);
        } else {
            txtcomprobar.setText("Número Incorrecto");
        }
    }

    public void regresar (View view) {
        Intent numr = new Intent (this, numrandom.class);
        startActivity(numr);
    }
}