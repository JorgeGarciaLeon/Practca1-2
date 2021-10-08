package com.JorgeSoft.Animals;

public class Animal {
    //Variables
    public String nombre;
    public int edad;
    public String genero;
    public int numHabitaculo;
    //añadir varibale puntero para saber donde esta.

    //Gets and Sets
    public String getNombre(){

        return this.nombre;
    }
    public void setNombre(String name){

        this.nombre = name;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getGenero(){

        return this.nombre;
    }
    public void setGenero(String genero){

        this.genero = genero;
    }

    public int getNumHabitaculo(){
        return this.numHabitaculo;
    }
    public void setNumHabitaculo(int numHabitaculo){
        this.numHabitaculo = numHabitaculo;
    }

    //Constructor
    public Animal(){

    }

    public Animal(String nombre, int edad, String genero){
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
    }

    //Method

}
