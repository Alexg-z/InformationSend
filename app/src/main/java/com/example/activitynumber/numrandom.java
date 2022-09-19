package com.example.activitynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class numrandom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numrandom);


    }

    public void getRandom (View view) {
        int valor;
        Random random = new Random();
        valor = random.nextInt(100000 - 1) + 1;
        Toast.makeText(this, "Número random: " + valor,Toast.LENGTH_SHORT).show();

        Intent check = new Intent(this,pruebanumero.class);
            check.putExtra("valor",String.valueOf(valor));
        startActivity(check);
    }

    public void regresar (View view) {
        Intent main = new Intent (this, MainActivity.class);
        startActivity(main);
    }
}