package ntoufas.eu.structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    public Composite(String name){
        this.name= name;
    }

    List<Component> components = new ArrayList();
    String name;

    @Override
    public void showPrice() {
        System.out.println("name: "+name);
    }

    public void addComponent(Component com){
        components.add(com);
    }

}
