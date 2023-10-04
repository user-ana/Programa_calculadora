package com.example.tarea_1calculadora.Models;

public class Calculo {

    private double number1;
    private double number2;
    private double result;

    public Calculo(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;

    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double getResult() {
        return result;
    }

    public double sum(){
        result = number1 + number2;
        return result;
    }

    public double subtraction(){
        result = number1 - number2;
        return result;
    }

    public double multiplication(){
        result = number1 * number2;
        return result;
    }

    public double division() {
        if (number2 != 0) {
            result = number1 / number2;
        } else {
            result = Double.NaN; //si el divisor es 0, el resultado es indefinido

        }
        return result;
    }




}

