package com.diego.radious.controllers;

import java.util.List;

/**
 * Created by diego on 31/03/2018.
 */

public class Biseccion extends Metodo {
    public Biseccion(double a, double b, double[] coef) {
        super(a, b, coef);
        calcularIteraciones();
    }

    @Override
    public void calcularIteraciones() {
        double f_a,f_b,f_m;
        int i = 0;
        do{

            m =calcularM(a,b);
            f_a = evaluarFuncion(a);
            f_b = evaluarFuncion(b);
            f_m = evaluarFuncion(m);
            if (i!=0)
            eA = calcularEA(m, iteracionList.get(i-1).getM());

            this.iteracionList.add(new Iteracion(a,b,m,f_a,f_b,f_m,eA));
            i++;
            actualizarValores(f_a,f_b,f_m);
        }while ((eA>ES)); }

    private void actualizarValores(double f_a,double f_b, double f_m) {
        if ((f_a*f_m)<0){
            b = m;
        }else if ((f_b*f_m)<=0){
            a = m;
        }
    }

    private double calcularEA(double mActual, double mAnterior){
        return Math.abs((mActual - mAnterior)/mActual)*100;


    }

    private double evaluarFuncion(double x){
        double ev = coef[0];

        for (int i = 1 ; i< coef.length;i++){
            if(coef[i] == 0)
                continue;
            ev += Math.pow(x,i)*coef[i];}
        return ev;
    }
    private double calcularM(double a, double b){
        return  (a + b)/2;
    }

    @Override
    public List<Iteracion> getIteracionList() {
        return super.getIteracionList();
    }
}
