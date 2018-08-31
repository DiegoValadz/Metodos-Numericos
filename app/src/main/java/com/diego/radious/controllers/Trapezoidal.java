package com.diego.radious.controllers;

import java.util.ArrayList;

public class Trapezoidal {
    private double a;
    private double b;
    private double deltaX;
    private double ec[];
    private double integral;
    private ArrayList<Evaluacion> evList;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getDeltaX() {
        return deltaX;
    }

    public double[] getEc() {
        return ec;
    }

    public double getIntegral() {
        return integral;
    }

    public Trapezoidal(double a, double b, double deltaX, double ec[]) {
        this.a = a;
        this.b = b;
        this.deltaX = deltaX;
        this.ec = ec;
        evList= new ArrayList<>();
        calcularIteraciones();

        calcularIntegral();
    }

    private void calcularIntegral() {
        double suma=0;

        for (int i=1;i<(evList.size()-1);i++){
            suma+= evList.get(i).getEv();
        }

       integral = (deltaX/2)*((evList.get(0).getEv()+evList.get(evList.size()-1).getEv())+(2*suma));

    }

    private void calcularIteraciones(){
        for (double i = a;i<(b+1);i+=deltaX){
            double aux = evaluarFuncion(i);
            evList.add(new Evaluacion(i,aux));
        }
    }
    private double evaluarFuncion(double x){
        double ev = ec[0];

        for (int i = 1 ; i< ec.length;i++){
            if(ec[i] == 0)
                continue;
            ev += Math.pow(x,i)*ec[i];}
        return ev;
    }

    public ArrayList<Evaluacion> getEvList() {
        return evList;
    }
}
