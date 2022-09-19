package com.example.activitynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class calculadora extends AppCompatActivity {

    private EditText et1,et2;
    private Button btn1;
    private RadioButton rbtn1,rbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        et1 = (EditText) findViewById(R.id.txtnum1);
        et2 = (EditText) findViewById(R.id.txtnum2);
        btn1 = (Button) findViewById(R.id.btncalcular);
        rbtn1 = (RadioButton) findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton) findViewById(R.id.rbtn2);
    }
    public void calcular (View view) {
        String valor1_string = et1.getText().toString();
        String valor2_string = et2.getText().toString();

        int valor1 = Integer.parseInt(valor1_string);
        int valor2 = Integer.parseInt(valor2_string);

        try {
            // Implementación de RadioButton
            if (rbtn1.isChecked() == true) {
                int suma = valor1 + valor2;
                String res = String.valueOf(suma);

                Intent calcular = new Intent(this,resultado.class);
                calcular.putExtra("resultado",res);
                startActivity(calcular);
            } else if (rbtn2.isChecked() == true) {
                int resta = valor1 - valor2;
                String res = String.valueOf(resta);

                Intent calcular = new Intent(this,resultado.class);
                calcular.putExtra("resultado",res);
                startActivity(calcular);
            }
        } catch (Exception e) {
            Toast.makeText(this, "Escoger una operación/Ingresar número",Toast.LENGTH_LONG).show();
        }

    }

    public void regresar (View view) {
        Intent ant = new Intent (this, MainActivity.class);
        startActivity(ant);
    }
}