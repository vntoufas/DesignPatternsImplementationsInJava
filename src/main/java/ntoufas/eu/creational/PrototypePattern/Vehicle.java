package ntoufas.eu.creational.PrototypePattern;

public class Vehicle {

    private String brand;
    private String model;
    private String color;

    public Vehicle(String color, String brand, String model)  {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Vehicle(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle(Vehicle vehicle) {
        this.brand= vehicle.brand;
        this.model= vehicle.model;
        this.color= vehicle.color;
    }

    public Vehicle clone(){
        return new Vehicle(this.getColor(), this.getBrand(), this.getModel());

    }

}
