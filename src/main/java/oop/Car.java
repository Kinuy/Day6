package oop;

public class Car {

    String brand;
    String model;
    String color;
    int speed;
    int yearOfManufacture;

    public void starts(){
        System.out.println("Car started");
    }
    public void accelerates(int speed){
        this.speed = speed;
        System.out.println("Car accelerated with speed: " + speed +" km/h");
    }

    public Car(){
    }

}
