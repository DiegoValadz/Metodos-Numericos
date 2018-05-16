package com.diego.radious.controllers;

import java.util.ArrayList;

public class Jacobi {

    private double[][] sistemaEc;
    private double[] sol;
    private double ea[] = new double[3];
    private double x1, x2, x3;
    private final double es = 0.05;
    private ArrayList<IterJacobi> listJacobi = new ArrayList<>();

    public Jacobi(double[][] sistemaEc, double[] sol, double x1, double x2, double x3) {
        this.sistemaEc = sistemaEc;
        this.sol = sol;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        for (int i = 0; i < 3; i++)
            ea[i] = 2000;
        calcularIteraciones();
    }

    private void calcularIteraciones() {
        double[] xAux = new double[3];
        int c = 0;
        do {
            for (int i = 0; i < 3; i++)
                xAux[i] = evaluarFuncion(x1, x2, x3, (i + 1));
            if (c != 0) {
                ea[0] = calcularEA(xAux[0], listJacobi.get(c - 1).getX1_2());
                ea[1] = calcularEA(xAux[1], listJacobi.get(c - 1).getX2_2());
                ea[2] = calcularEA(xAux[2], listJacobi.get(c - 1).getX3_2());
            }
            listJacobi.add(new IterJacobi(x1, xAux[0], x2, xAux[1], x3, xAux[2], ea[0], ea[1], ea[2]));
            actualizarValores(xAux);
            c++;
        } while (ea[0] > es && ea[1] > es && ea[2] > es);
    }

    private void actualizarValores(double[] newValues) {
        this.x1 = newValues[0];
        this.x2 = newValues[1];
        this.x3 = newValues[2];
    }

    private double calcularEA(double mActual, double mAnterior) {
        return Math.abs((mActual - mAnterior) / mActual) * 100;
    }

    private double evaluarFuncion(double x1, double x2, double x3, int select) {
        double result = 0;
        switch (select) {
            case 1:
                result = (sol[0] + (sistemaEc[0][1] * x2) + (sistemaEc[0][2] * x3)) / sistemaEc[0][0];
                break;

            case 2:
                result = (sol[1] + (sistemaEc[1][0] * x1) + (sistemaEc[1][2] * x3)) / sistemaEc[1][1];
                break;

            case 3:
                result = (sol[2] + (sistemaEc[2][0] * x1) + (sistemaEc[2][1] * x2)) / sistemaEc[2][2];
                break;
        }
        return result;
    }

    public ArrayList<IterJacobi> getListJacobi() {
        return listJacobi;
    }
}
