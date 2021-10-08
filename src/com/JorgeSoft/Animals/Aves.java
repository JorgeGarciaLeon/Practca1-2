package com.JorgeSoft.Animals;

public class Aves extends Animal{

    //Variables
    public double altitudMaxima;
    public String colorPlumaje;
    public String tipoDePata;

    //Gets and Sets
    public double getAltitudMaxima(){
        return this.altitudMaxima;
    }
    public void setAltitudMaxima(double altitudMaxima){
        this.altitudMaxima = altitudMaxima;
    }

    public String getColorPlumaje(){
        return this.colorPlumaje;
    }
    public void setColorPlumaje(String colorPlumaje){
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoDePata(){
        return this.tipoDePata;
    }
    public void setTipoDePata(String tipoDePata){
        this.tipoDePata = tipoDePata;
    }

    //Constructor
    public Aves(String nombre, int edad, String genero, double altitudMaxima, String colorPlumaje, String tipoDePata){
        super(nombre, edad, genero);
        setAltitudMaxima(altitudMaxima);
        setColorPlumaje(colorPlumaje);
        setTipoDePata(tipoDePata);
    }

}
