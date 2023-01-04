package org.example;



import java.util.Arrays;

abstract class Transport implements Repairable{

    private  String name;
    private int capacity;
    private int speed;
    private double costOfKm;



    public Transport(String name, int capacity, int speed, double costOfKm) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
        this.costOfKm = costOfKm;
    }


    abstract float getPrice(City city);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getCostOfKm() {
        return costOfKm;
    }

    public void setCostOfKm(double costOfKm) {
        this.costOfKm = costOfKm;
    }



}
