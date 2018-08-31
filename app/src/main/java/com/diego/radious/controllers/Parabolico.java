package com.diego.radious.controllers;

import java.util.ArrayList;

public class Parabolico {
    private double a;


    private double n;
    private double b;
    private double deltaX;


    public double getIntegral() {
        return integral;
    }

    private double integral;
    private double[] ec;

    private ArrayList<Evaluacion> evList = new ArrayList<>();

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


    public Parabolico(double a, double b, double deltaX, double[] ec, double n) {
        this.a = a;
        this.n = n;
        this.b = b;
        this.deltaX = deltaX;
        this.ec = ec;
        if (n == 0)
            calcularIteraciones(0);
        else
            calcularIteraciones(1);
    }

    public void calcularIntegral(int s) {

        double suma = 0;


        switch (s) {
            case 1:
                for (int i = 1; i < (evList.size() - 1); i++) {
                    suma += evList.get(i).getEv();
                }
                integral = (deltaX / 3) * (evList.get(0).getEv() + evList.get(evList.size() - 1).getEv() + (4 * suma));

                break;
            case 2:
                for (int i = 2; i < (evList.size() - 1); i++) {
                    suma += evList.get(i).getEv();
                }
                integral = (deltaX / 3) * (evList.get(0).getEv() + evList.get(evList.size() - 1).getEv() + (2 * suma));
                break;
        }

    }

    private void calcularIteraciones(int s) {
        switch (s) {
            case 0:
                for (double i = a; i < (b + 1); i += deltaX) {
                    double aux = evaluarFuncion(i);
                    evList.add(new Evaluacion(i, aux));
                }
                break;
            case 1:
                int c = 0;
                for (double i = a; c < n+1 && i < (b + 1); i += deltaX) {
                    double aux = evaluarFuncion(i);
                    evList.add(new Evaluacion(i, aux));
                    c++;
                }
                break;
        }

    }


    private double evaluarFuncion(double x) {
        double ev = ec[0];

        for (int i = 1; i < ec.length; i++) {
            if (ec[i] == 0)
                continue;
            ev += Math.pow(x, i) * ec[i];
        }
        return ev;
    }

    public ArrayList<Evaluacion> getEvList() {
        return evList;
    }
}
