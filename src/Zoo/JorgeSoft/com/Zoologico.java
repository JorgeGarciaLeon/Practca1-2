package Zoo.JorgeSoft.com;

import animals.JorgeSoft.com.Animal;

import java.util.ArrayList;

public class Zoologico {

    //Variables
    public int numHuecos;
    public ArrayList<Animal> Animales;

    //gets and sets
    public int getNumHuecos(){
        return this.numHuecos;
    }
    public void setNumHuecos(int numHuecos){
        this.numHuecos = numHuecos;
    }

    public ArrayList<Animal> getAnimales(){
        return this.Animales;
    }
    public void setAnimales(ArrayList<Animal> Animales){
        this.Animales = Animales;
    }


    //Constructors
    public Zoologico(){

    }

    public Zoologico(int NumHuecos){
        setNumHuecos(numHuecos);
    }

    //Method
    public void mostrarAnimales(){
        for (int i = 0; i < Animales.size(); i++) {
            System.out.println(getAnimales().get(i));
        }
    }
}
