package main.java.ntoufas.eu.BuilderPattern;

public class Phone {

    private String os;
    private String processor;
    private double screenSize;
    private int battery;
    private int camera;

    //constructor is package private
    Phone() {
    }

    public Phone(String os, String processor, double screenSize, int battery, int camera) {
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
        this.camera = camera;
    }
    //no SETTERS implemented.
    public String getOs() {
        return os;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public int getCamera() {
        return camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                ", camera=" + camera +
                '}';
    }
}
