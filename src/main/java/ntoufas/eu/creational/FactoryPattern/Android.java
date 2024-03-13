package ntoufas.eu.creational.FactoryPattern;

public class Android extends OperatingSystem implements OS {


@Override
    public void spec(){
        System.out.println("Most powerful OS");
    }
}
