package main.java.ntoufas.eu.AdapterPattern;

public class AssignmentWork {

    private Pen p;

    public Pen getP(){
        return p;
    }

    public void setP(Pen p){
        this.p = p;
    }

    public void writeAssignment(String str){
        System.out.println(str);
    }



}
