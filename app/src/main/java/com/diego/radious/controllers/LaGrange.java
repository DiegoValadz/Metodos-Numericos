package com.diego.radious.controllers;

public class LaGrange {
    private double [] xi,fx;
    private double x,lo,l1,l2,l3,fev;

    public LaGrange(double[] xi, double[] fx, double x) {
        this.xi = xi;
        this.fx = fx;
        this.x=x;
        calcularLn();
    }

    private void calcularLn() {
        lo = ((x-xi[1])*(x-xi[2])*(x-xi[3]))/((xi[0]-xi[1])*(xi[0]-xi[2])*(xi[0]-xi[3]));
        l1 = ((x-xi[0])*(x-xi[2])*(x-xi[3]))/((xi[1]-xi[0])*(xi[1]-xi[2])*(xi[1]-xi[3]));
        l2 = ((x-xi[0])*(x-xi[1])*(x-xi[3]))/((xi[2]-xi[0])*(xi[2]-xi[1])*(xi[2]-xi[3]));
        l3 = ((x-xi[0])*(x-xi[1])*(x-xi[2]))/((xi[3]-xi[0])*(xi[3]-xi[1])*(xi[3]-xi[2]));
        fev = (lo*fx[0])+(l1*fx[1])+(l2*fx[2])+(l3*fx[3]);
    }

    public double getLo() {
        return lo;
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public double getL3() {
        return l3;
    }

    public double getFev() {
        return fev;
    }
}
