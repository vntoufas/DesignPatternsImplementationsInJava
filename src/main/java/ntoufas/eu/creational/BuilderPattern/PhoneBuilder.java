package ntoufas.eu.creational.BuilderPattern;

public interface PhoneBuilder {
    public Phone build();
    //public Phone build(String os, String processor, double screenSize, int battery, int camera);
    public PhoneBuilder setProcessor(String processor);
    public PhoneBuilder setOs(String os);
    public PhoneBuilder setScreenSize(double screenSize);
    public PhoneBuilder setBattery(int battery);
    public PhoneBuilder setCamera(int camera);


}
