package main.java.ntoufas.eu.PrototypePattern;

public class Bus extends Vehicle{

    private int doors;

    public Bus (String color, String brand, String model, int doors){
        super(color, brand, model);
        this.doors=doors;
    }


    @Override
    public Vehicle clone(){
        return new Bus(this.getColor(), this.getBrand(), this.getModel(), doors);
    }
}
