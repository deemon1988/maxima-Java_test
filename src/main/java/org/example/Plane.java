package org.example;

public class Plane extends Transport{
    public Plane(String name, int capacity, int speed, double costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    @Override
    float getPrice(City city) {
        float stoimost;
        if (city.isHasAirport())return (float) (getCostOfKm()* city.getDistance());else return 0;
    }


}