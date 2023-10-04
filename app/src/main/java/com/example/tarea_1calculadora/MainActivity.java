package com.example.tarea_1calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.tarea_1calculadora.Models.Calculo;

public class MainActivity extends AppCompatActivity {

 private EditText etNumber1, etNumber2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.num1);
        etNumber2 = findViewById(R.id.num2);
        Button btnSum = findViewById(R.id.btn_suma);
        Button btnSubtraction = findViewById(R.id.btn_resta);
        Button btnMultiplication = findViewById(R.id.btn_multiplicacion);
        Button btnDivision = findViewById(R.id.btn_division);

        btnSum.setOnClickListener(
                (v)-> getResult("sum")
        );

        btnSubtraction.setOnClickListener(
                (v)-> getResult("subtraction")
        );

        btnMultiplication.setOnClickListener(
                (v)-> getResult("multiplication")
        );

        btnDivision.setOnClickListener(
                (v)-> getResult("division")
        );





    }

    private void getResult( String op){
        double number1 = Double.parseDouble(etNumber1.getText().toString());
        double number2 = Double.parseDouble(etNumber2.getText().toString());
        Calculo calculo = new Calculo(number1, number2);
        double result = 0;

        switch (op){
            case "sum":
                result = calculo.sum();
                break;
            case "subtraction":
                result = calculo.subtraction();
                break;
            case "multiplication":
                result = calculo.multiplication();
                break;
            case "division":
                result = calculo.division();
                break;
        }



        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("number1", number1);
        intent.putExtra("number2", number2);
        intent.putExtra("result", result);
        startActivity(intent);



    }





}