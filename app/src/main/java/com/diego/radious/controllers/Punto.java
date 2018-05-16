package com.diego.radious.controllers;

/**
 * Created by diego on 15/02/2018.
 */

public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto{ " +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}
