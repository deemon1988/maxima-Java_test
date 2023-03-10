package org.example.fromthecource;

public class Ship extends Transport {

    public Ship(String name, int capacity, int speed, double costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    public Ship(String name, int capacity, int speed, double costOfKm, boolean isRepairing) {
        super(name, capacity, speed, costOfKm, isRepairing);
    }


    @Override
    float getPrice(City city) {
        if (city.isOnWater()) return (float) (getCostOfKm() * city.getDistance());
        return 0;
    }


    @Override
    public void startRepair() {
        System.out.println("Корабль не доступен");
    }

    @Override
    public void finishRepair() {
        System.out.println("Корабль доступен");
    }

    @Override
    public boolean isRepairing() {

        return false;
    }
}


