package com.diego.radious.controllers;

/**
 * Created by diego on 31/03/2018.
 */

public class Iteracion {

    private double a,b,m,f_a,f_b,f_m,e_A;

    public Iteracion(double a, double b, double m, double f_a, double f_b, double f_m, double e_A) {
        this.a = a;
        this.b = b;
        this.m = m;
        this.f_a = f_a;
        this.f_b = f_b;
        this.f_m = f_m;
        this.e_A = e_A;
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

    public double getM() {
        return m;
    }

    public double getF_a() {
        return f_a;
    }

    public double getF_b() {
        return f_b;
    }

    public double getF_m() {
        return f_m;
    }

    public double getE_A() {
        return e_A;
    }

}
