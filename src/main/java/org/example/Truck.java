package org.example;

public class Truck extends Transport{
    public Truck(String name, int capacity, int speed, double costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    @Override
    float getPrice(City city) {
        float stoimost= (float) (getCostOfKm()* city.getDistance());
        return stoimost;
    }


}