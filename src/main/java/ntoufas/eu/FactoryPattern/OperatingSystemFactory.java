package main.java.ntoufas.eu.FactoryPattern;

public class OperatingSystemFactory {

    public static OS getInstance(String name) {

        switch (name) {
            case "Android":
                return new Android();
            case "Windows":
                return new Windows();
            case "IOS":
                return new IOS();
        }
        return new OperatingSystem();
    }

}
