package animals.JorgeSoft.com;

public class Reptiles extends Animal{

    //variables
    public double temperaturaCorporal;
    public String colorEscama;
    public double velocidadDesplazamiento;

    //Gets and Sets
    public double getTemperaturaCorporal(){
        return this.temperaturaCorporal;
    }
    public void setTemperaturaCorporal(double temperaturaCorporal){
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public String getColorEscama(){
        return this.colorEscama;
    }
    public void setColorEscama(String colorEscama){
        this.colorEscama = colorEscama;
    }

    public double getVelocidadDesplazamiento(){
        return this.velocidadDesplazamiento;
    }
    public void setVelocidadDesplazamiento(double velocidadDesplazamiento){
        this.velocidadDesplazamiento = velocidadDesplazamiento;
    }

}
