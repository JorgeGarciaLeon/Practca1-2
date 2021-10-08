package com.JorgeSoft.Zoo;

import com.JorgeSoft.Animals.Animal;

import java.util.ArrayList;

public class Zoologico {

    //Variables
    public int numHuecos;
    public int numAnimales;
    public ArrayList<Animal> Animales;

    //gets and sets
    public int getNumHuecos(){

        return this.numHuecos;
    }
    public void setNumHuecos(int numHuecos){

        this.numHuecos = numHuecos;
    }

    public int getNumAnimales(){

        return this.numAnimales;
    }
    public void setNumAnimales(int numAnimales){

        this.numAnimales = numAnimales;
    }

    public ArrayList<Animal> getAnimales(){

        return this.Animales;
    }
    public void setAnimales(Animal Animales){

        this.Animales.add(Animales);
    }

    //Method
    public void createZooAndWhatch(){

    }


    //Constructors
    public Zoologico(){

    }

    public Zoologico(int NumHuecos, int numAnimales){
        setNumAnimales(numAnimales);
        setNumHuecos(numHuecos);
    }

    //Method
    public void mostrarAnimales(){
        for (int i = 0; i < Animales.size(); i++) {
            System.out.println(getAnimales().get(i));
        }
    }

    public void addAnimalArray(Animal listaAnimales){

        setAnimales(listaAnimales);
    }
}
