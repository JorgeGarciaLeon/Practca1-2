package com.JorgeSoft.Zoo;

import com.JorgeSoft.Animals.*;

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
        }else if(numAnimales/2 < numHuecos){
            String [] animales = {"Gallinacea","Gato","Leon","Pajaro","Perro","Rapace","Saurio","Serpiente","Tortuga"};
            for (int i = 0; i < numAnimales; i++) {
                switch (animales[i]){
                    case "Gallinacea":
                        Animal gallinacea = new Gallinacea(getName(),getAge(),getGen(),getMaxAltura(),getColor(), getTypeOfLeg());
                        Animales.add(gallinacea);
                        break;
                    case "Gato":
                        Animal Gato = new Gato(getName(),getAge(),getGen(),getWeight(),getHabit(),getSpeed(),getDiet());
                        Animales.add(Gato);
                        break;
                    case "Leon":
                        Animal Leon = new Leon(getName(),getAge(),getGen(),getWeight(),getHabit(),getSpeed(),getDiet());
                        Animales.add(Leon);
                        break;
                    case "Pajaro":
                        Animal Pajaro = new Pajaro(getName(),getAge(),getGen(),getMaxAltura(),getColor(), getTypeOfLeg());
                        Animales.add(Pajaro);
                        break;
                    case "Perro":
                        Animal Perro = new Perro(getName(),getAge(),getGen(),getWeight(),getHabit(),getSpeed(),getDiet());
                        Animales.add(Perro);
                        break;
                    case "Rapace":
                        Animal Rapace = new Rapace(getName(),getAge(),getGen(),getMaxAltura(),getColor(), getTypeOfLeg());
                        Animales.add(Rapace);
                        break;
                    case "Saurio":
                        Animal Saurio = new Saurio(getName(),getAge(),getGen(),getTemperature(),getColor(),getSpeedReptile());
                        Animales.add(Saurio);
                        break;
                    case "Serpiente":
                        Animal Serpiente = new Serpiente(getName(),getAge(),getGen(),getTemperature(),getColor(),getSpeedReptile());
                        Animales.add(Serpiente);
                        break;
                    case "Tortuga":
                        Animal Tortuga = new Tortuga(getName(),getAge(),getGen(),getTemperature(),getColor(),getSpeedReptile());
                        Animales.add(Tortuga);
                        break;
                }

            }
        }else{
            System.out.println("La configuraci??n del ZOO no se puede generar");
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
        String [] Names = {"Teo","Luna","Kyra","Simba","Kody","Balu","Flec","Bladi","Perry","gok??","Velleta","Alex","Leo"};
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