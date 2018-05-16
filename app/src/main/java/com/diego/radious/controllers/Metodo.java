package com.diego.radious.controllers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego on 31/03/2018.
 */

public abstract class Metodo {
    final double ES = 0.05;
    double a,b,m,eA=2000;
    double coef[];
    List<Iteracion> iteracionList = new ArrayList<>();

    public double getES() {
        return ES;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double geteA() {
        return eA;
    }

    public void seteA(double eA) {
        this.eA = eA;
    }



    public double[] getCoef() {
        return coef;
    }

    public void setCoef(double[] coef) {
        this.coef = coef;
    }

    public List<Iteracion> getIteracionList() {
        return iteracionList;
    }

    public void setIteracionList(List<Iteracion> iteracionList) {
        this.iteracionList = iteracionList;
    }

    public Metodo(double a, double b, double[] coef) {
        this.a = a;
        this.b = b;
        this.coef = coef;
    }

    public abstract void calcularIteraciones();

}
