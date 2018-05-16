package com.diego.radious.controllers;

/**
 * Created by diego on 15/02/2018.
 */

public class Recta {
    private double radio;
    private double angulo;
    private Punto punto;


    public Recta(double radio, double angulo, Punto punto) {
        this.radio = radio;
        this.angulo = angulo;
        this.punto = punto;
    }

    public Recta(Punto punto) {
        this.punto = punto;
    }

    public void calcularRadio() {
        this.radio = Math.sqrt(Math.pow(punto.getX(),2)+Math.pow(punto.getY(),2));
    }

    public void calcularAngulo(){
        //if (punto.getX()!=0.0&&punto.getY()!=0)
        this.angulo = Math.atan(punto.getY()/punto.getX());
        //else
         //   this.angulo = 90;
    }

    public Punto getPunto() {
        return punto;
    }


    public String toStringRadio() {
         return "r = " + radio;
    }


    public String toStringAngulo() {
        if(Double.isNaN(angulo))
            return  "No hay ángulo";
        else
        return "Ángulo en Radianes = " + angulo +"\nÁngulo en Degrees = "+((angulo)*180)/Math.PI;
    }
}
