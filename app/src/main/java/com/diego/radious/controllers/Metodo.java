package com.diego.radious.controllers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego on 31/03/2018.
 */

public abstract class Metodo {
    final double ES = 0.05;
    double a, b, m, eA = 2000;
    double coef[];
    List<Iteracion> iteracionList = new ArrayList<>();

    public Metodo(double a, double b, double[] coef) {
        this.a = a;
        this.b = b;
        this.coef = coef;
    }

    public Metodo() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public List<Iteracion> getIteracionList() {
        return iteracionList;
    }

    public abstract void calcularIteraciones();
}
