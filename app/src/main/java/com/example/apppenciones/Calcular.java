package com.example.apppenciones;

import java.text.DecimalFormat;

public class Calcular {
    double montoR,montoP;
    int edad,sumaEdad;

    public double getMontoR() {
        return montoR;
    }

    public void setMontoR(double montoR) {
        this.montoR = montoR;
    }

    public double getMontoP() {
        return montoP;
    }

    public void setMontoP(double montoP) {
        this.montoP = montoP;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSumaEdad() {
        return sumaEdad;
    }

    public void setSumaEdad(int sumaEdad) {
        this.sumaEdad = sumaEdad;
    }


    public void sumarEdades (){
        sumaEdad= sumaEdad+edad;
    }

    public void montoPersona ( int edadPersona ){
        DecimalFormat df = new DecimalFormat("0.00");
        montoP= Double.parseDouble(df.format(edadPersona*montoR/sumaEdad));

    }


} //FINAL DE LA CLASE
