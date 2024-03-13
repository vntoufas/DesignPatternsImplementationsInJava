package main.java.ntoufas.eu;

import main.java.ntoufas.eu.BuilderPattern.Director;
import main.java.ntoufas.eu.BuilderPattern.IPhoneBuilder;
import main.java.ntoufas.eu.BuilderPattern.Phone;
import main.java.ntoufas.eu.CompositePattern.Component;
import main.java.ntoufas.eu.CompositePattern.Composite;
import main.java.ntoufas.eu.CompositePattern.Leaf;
import main.java.ntoufas.eu.PrototypePattern.Car;
import main.java.ntoufas.eu.PrototypePattern.GpsSystem;
import main.java.ntoufas.eu.PrototypePattern2.EmployeeRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //Structural Design patterns START

        //Factory Pattern
        /*OS obj1 = OperatingSystemFactory.getInstance("IOS");
        OS obj2 = OperatingSystemFactory.getInstance("Windows");
        OS obj3 = OperatingSystemFactory.getInstance("Android");
        OS obj4 = OperatingSystemFactory.getInstance("");*/

        //Builder Pattern
        /*Director director = new Director();
        IPhoneBuilder ipb = new IPhoneBuilder();
        ipb.setProcessor("someAppleProccessor");
        Phone iphone = director.buildIphone(ipb);
        System.out.println("is iphone null: "+iphone == null);
        System.out.println(" ___ "+iphone.getProcessor());
        System.out.println(iphone.toString());*/

        //Adapter Pattern
        //You basically wrap an interface in another interface
        /*Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        //PilotPen pp = new PilotPen();
        //aw.setP(pp); that does not work
        aw.setP(p);
        aw.writeAssignment("something here ... ");*/

        //Composite Pattern
        //This is used when you have a scenario when you create an object that represents a tree structure
        //A Composite Object has another composite object as field
        /*Component hq = new Leaf(4000, "HDD");
        Component mouse = new Leaf(4000, "mouse");
        Component monitor = new Leaf (4000, "Ram");

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Peri");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("Computer");

        mb.addComponent(mouse);
        mb.addComponent(monitor);
        mb.addComponent(computer);
        mb.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);*/


        //Prototype Pattern
        /*Car car1 = new Car("BMW", "F44","Skyscapper grey", 100, new GpsSystem());
        System.out.println(car1.getBrand());
        Car car2 = car1.clone();
        System.out.println(car2.getBrand());
        System.out.println("Are cars equal? ==> "+(car1==car2));*/


        //Prototype Pattern 2nd example ==  START
        /*BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int eid=Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String ename=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String edesignation=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String eaddress=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double esalary= Double.parseDouble(br.readLine());
        System.out.print("\n");

        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);

        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        e2.showRecord();*/
        //Prototype Pattern 2nd example ==  FINISH

        //Structural Design patterns FINISH




    }
}