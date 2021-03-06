package com.JorgeSoft.Animals;

public class Mamifero extends Animal{

    //variables
    public double peso;
    public String habito;
    public double velocidadMovimiento;
    public String dieta;

    //Gets and Sets
    public double getPEso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getHabito(){
        return this.habito;
    }
    public void setHabito(String habito){
        this.habito = habito;
    }

    public double getVelocidadMovimiento(){

        return this.velocidadMovimiento;
    }
    public void setVelocidadMovimiento(double velocidadMovimiento){

        this.velocidadMovimiento = velocidadMovimiento;
    }

    public String getDieta(){

        return this.dieta;
    }
    public void setDieta(String dieta){

        this.dieta = dieta;
    }


    //Constructor
    public Mamifero(String nombre, int edad, String genero, double peso,String habito, double velocidadMovimiento, String dieta){
        super(nombre, edad, genero);
        setPeso(peso);
        setHabito(habito);
        setVelocidadMovimiento(velocidadMovimiento);
        setDieta(dieta);
    }
}
