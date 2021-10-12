package com.JorgeSoft.Zoo;

import com.JorgeSoft.Animals.Animal;
import com.JorgeSoft.Animals.Pajaro;
import com.JorgeSoft.Animals.Perro;
import com.JorgeSoft.Animals.Serpiente;

import java.util.ArrayList;

public class Zoologico {

    //Variables
    public int numHuecos;
    public int numAnimales;
    public ArrayList<Animal> Animales = new ArrayList<>();

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




    //Constructors
    public Zoologico(){

    }

    public Zoologico(int numHuecos, int numAnimales){
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


    //Method
    public void createZooAndWhatch(){
        int numAnimales = getNumAnimales();
        int numHuecos = getNumHuecos();
        if(numAnimales/2 == numHuecos){
            for (int i = 0; i < numHuecos; i++) {
                int typeOfAnimal = (int) Math.random() * (3 - 1) + 1;
                switch (typeOfAnimal) {
                    case 1:
                        Animal perro1 = new Perro(getName(),getAge(),"Male",getWeight(),getHabit(),getSpeed(),getDiet());
                        Animal perro2 = new Perro(getName(),getAge(),"Female",getWeight(),getHabit(),getSpeed(),getDiet());
                        Animales.add(perro1);
                        Animales.add(perro2);
                        break;
                    case 2:
                        Animal Ave1 = new Pajaro(getName(),getAge(),"Male",getMaxAltura(),getColor(), getTypeOfLeg());
                        Animal Ave2 = new Pajaro(getName(),getAge(),"Female",getMaxAltura(),getColor(), getTypeOfLeg());
                        Animales.add(Ave1);
                        Animales.add(Ave2);
                        break;
                    case 3:
                        Animal Serpiente1 = new Serpiente(getName(),getAge(),"Male",getTemperature(),getColor(),getSpeedReptile());
                        Animal Serpiente2 = new Serpiente(getName(),getAge(),"Female",getTemperature(),getColor(),getSpeedReptile());
                        Animales.add(Serpiente1);
                        Animales.add(Serpiente2);
                        break;
                }
            }
        }else{
            System.out.println("La configuración del ZOO que ha añadido no es posible");
        }

        for (int i = 0; i <Animales.size() ; i++) {
            System.out.println(Animales.get(i).nombre + " " + Animales.get(i).genero);
        }
    }



    public String getGen(){
        double randomNum = Math.random();
        if (randomNum > 0.5){
            return "Male";
        }else{
            return "Female";
        }
    }

    public String getName(){
        String [] Names = {"Teo","Luna","Kyra","Simba","Kody","Balu","Flec","Bladi","Perry","gokú","Velleta","Alex","Leo"};
        int randomNum = (int) (Math.random() * (Names.length-1)+1);
        return Names[randomNum];
    }

    public int getAge(){
        return (int) (Math.random()*100);
    }

    public double getWeight(){
        return (Math.random()*1000);
    }

    public String getHabit(){
        String Habit = Math.random() > 0.5 ? "Diurno" : "Nocturno";
        return Habit;
    }

    public double getSpeed(){
        return Math.random()*110;
    }

    public String getDiet() {
        double randomNum = Math.random();
        if (randomNum < 0.33){
            return "Carnivoro";
        }else if(randomNum < 0.66){
            return "Herbivora";
        }else{
            return "Omnivora";
        }
    }

    public double getMaxAltura(){
        return Math.random()*4000;
    }

    public String getColor(){
        String [] colors = {"Red","Black","Broken White"};
        int numRandom = (int) (Math.random()*colors.length);
        return colors[numRandom];
    }

    public String getTypeOfLeg(){
        String Habit = Math.random() > 0.5 ? "Palmioeda" : "Garra";
        return Habit;
    }

    public double getTemperature(){
        return Math.random()*40;
    }

    public double getSpeedReptile(){
        return Math.random()*40;
    }
}