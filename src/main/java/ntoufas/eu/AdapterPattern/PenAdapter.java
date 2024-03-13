package main.java.ntoufas.eu.AdapterPattern;

public class PenAdapter implements Pen{

    PilotPen pp = new PilotPen();
    @Override
    public void write(String s) {
        pp.mark(s);
    }
}
