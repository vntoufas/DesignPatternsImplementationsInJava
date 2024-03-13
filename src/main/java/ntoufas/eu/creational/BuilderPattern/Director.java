package ntoufas.eu.creational.BuilderPattern;

public class Director {

    public Phone buildIphone(IPhoneBuilder builder){
        return builder.setOs("IOS")
                .setScreenSize(800.55)
                .setScreenSize(5.55)
                .build();

    }


}
