package com.diego.radious.controllers;

public class DiferenciacionNumerica {

    private double xi, xiMenosH, xiMasH, h,evXmenosH,evXmasH,evX;
    private double difAdelante,difAtras,difCentral;
    private double[] ec;

    public DiferenciacionNumerica(double xi, double[] ec, double h) {
        this.xi = xi;
        this.h = h;
        this.ec=ec;
        xiMenosH = xi-h;
        xiMasH = xi+h;
        calcularDerivada();
    }

    public void calcularDerivada() {
        evXmenosH = evaluarFuncion(xiMenosH);
        evX= evaluarFuncion(xi);
        evXmasH= evaluarFuncion(xiMasH);

        //Dif adelante
        difAdelante = (evXmasH - evX)/h;
        //Dif atras
        difAtras = (evX-evXmenosH)/h;
        //Dif central
        difCentral = (evXmasH - evXmenosH)/(2*h);
    }

    private double evaluarFuncion(double x){
        double ev = ec[0];

        for (int i = 1 ; i< ec.length;i++){
            if(ec[i] == 0)
                continue;
            ev += Math.pow(x,i)*ec[i];}
        return ev;
    }


    public double getXi() {
        return xi;
    }

    public double getXiMenosH() {
        return xiMenosH;
    }

    public double getXiMasH() {
        return xiMasH;
    }

    public double getH() {
        return h;
    }

    public double getEvXmenosH() {
        return evXmenosH;
    }

    public double getEvXmasH() {
        return evXmasH;
    }

    public double getEvX() {
        return evX;
    }

    public double getDifAdelante() {
        return difAdelante;
    }

    public double getDifAtras() {
        return difAtras;
    }

    public double getDifCentral() {
        return difCentral;
    }

}

