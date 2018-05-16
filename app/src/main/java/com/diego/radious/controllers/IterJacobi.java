package com.diego.radious.controllers;

import java.util.ArrayList;

public class IterJacobi {

    private double x1,x1_2,x2,x2_2,x3,x3_2;
    private double eaX1,eaX2,eaX3;

    public IterJacobi(double x1, double x1_2, double x2, double x2_2, double x3, double x3_2, double eaX1, double eaX2, double eaX3) {
        this.x1 = x1;
        this.x1_2 = x1_2;
        this.x2 = x2;
        this.x2_2 = x2_2;
        this.x3 = x3;
        this.x3_2 = x3_2;
        this.eaX1 = eaX1;
        this.eaX2 = eaX2;
        this.eaX3 = eaX3;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX1_2() {
        return x1_2;
    }

    public void setX1_2(double x1_2) {
        this.x1_2 = x1_2;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX2_2() {
        return x2_2;
    }

    public void setX2_2(double x2_2) {
        this.x2_2 = x2_2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getX3_2() {
        return x3_2;
    }

    public void setX3_2(double x3_2) {
        this.x3_2 = x3_2;
    }

    public double getEaX1() {
        return eaX1;
    }

    public void setEaX1(double eaX1) {
        this.eaX1 = eaX1;
    }

    public double getEaX2() {
        return eaX2;
    }

    public void setEaX2(double eaX2) {
        this.eaX2 = eaX2;
    }

    public double getEaX3() {
        return eaX3;
    }

    public void setEaX3(double eaX3) {
        this.eaX3 = eaX3;
    }
}
