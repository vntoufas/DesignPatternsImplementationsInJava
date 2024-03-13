package ntoufas.eu.creational.PrototypePattern;

public class Car extends Vehicle{

    private int topSpeed;
    private GpsSystem gpsSystem;

    public Car(String color, String brand, String model, int topSpeed, GpsSystem gpsSystem){
        super(color, brand, model);
        this.topSpeed=topSpeed;
        this.gpsSystem = gpsSystem;
    }

    @Override
    public Car clone(){
       return new Car(this.getColor(), this.getBrand(), this.getModel(), topSpeed, gpsSystem);
    }
}
