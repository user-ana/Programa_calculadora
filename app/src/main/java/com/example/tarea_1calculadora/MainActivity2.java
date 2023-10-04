package com.example.tarea_1calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView valor1 = findViewById(R.id.valor1);
        TextView valor2 = findViewById(R.id.valor2);
        TextView etvresultado = findViewById(R.id.resultado_calculado);
        Button salir = findViewById(R.id.btn_salir);
        Button volver = findViewById(R.id.btn_regresar);
        TextView operacion1 = findViewById(R.id.operacion);














        Intent intent = getIntent();

        if (intent != null){
            double numero1 = intent.getDoubleExtra("number1", 0);
            double numero2 = intent.getDoubleExtra("number2", 0);
            double resultado = intent.getDoubleExtra("result", 0);
            String operacion = intent.getStringExtra("operacion");

            valor1.setText(String.valueOf(numero1));
            valor2.setText(String.valueOf(numero2));
            etvresultado.setText(String.valueOf(resultado));

          String msj = "La operacion es: " + operacion;
            operacion1.setText(msj);

        }


        salir.setOnClickListener(
                (v)-> {
                    finishAffinity(); // cierra la app
                }
        );





        volver.setOnClickListener(
                (v)-> {
                   finish(); // cierra la actividad actual
                }
        );

    }
}