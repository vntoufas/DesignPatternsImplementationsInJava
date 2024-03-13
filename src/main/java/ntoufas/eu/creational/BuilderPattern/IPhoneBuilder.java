package ntoufas.eu.creational.BuilderPattern;

public class IPhoneBuilder implements PhoneBuilder{

    String os;
    String processor;
    double screenSize;
    int battery;
    int camera;

    //@Override
    /*public Phone build(String os, String processor, double screenSize, int battery, int camera) {
        return new Phone(os, processor, screenSize, battery, camera);
    }*/

    @Override
    public Phone build() {
        return new Phone(os, processor, screenSize, battery, camera);
    }

    @Override
    public PhoneBuilder setProcessor(String processor) {
        this.processor=processor;
        return this;
    }

    @Override
    public PhoneBuilder setOs(String os) {
        this.os=os;
        return this;
    }

    @Override
    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize=screenSize;
        return this;
    }

    @Override
    public PhoneBuilder setBattery(int battery) {
        this.battery=battery;
        return this;
    }

    @Override
    public PhoneBuilder setCamera(int camera) {
        this.camera=camera;
        return this;
    }
}
