package ntoufas.eu.creational.FactoryPattern;

public class OperatingSystem implements OS{

    public OperatingSystem(){
        spec();
    }
    public void spec(){
        System.out.println("Generic operating system ... ");
    }
}
