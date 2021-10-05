import Zoo.JorgeSoft.com.Zoologico;
import animals.JorgeSoft.com.*;

import java.util.ArrayList;

public class Ejer2 {
    public static void main(String[] args) {
        String nameAnimal [] = {"chispita","blady","kyra","tyrel","tongo","pongo","nala","cody","cala",};
        String typeOfAnimal [] = {"Mamifero","Aves","Reptiles"};
        Zoologico zoo = new Zoologico();

        ArrayList<Animal> LisaAnimales = new ArrayList<>();

        switch (typeOfAnimal[randomNumAnimal()]){
            case "Mamifero":

                break;
            case "Aves":

                break;
            case "Reptiles":

                break;
            default:
                System.out.println("Algo ha salido mal");
                break;
        }


    }

    public static int edadAnimal(){
        double edad =  Math.random()*100;
        return (int)edad;
    }
    public static int randomNumAnimal(){
        double randomNum =  Math.random()*3;
        return (int)randomNum;
    }
}
