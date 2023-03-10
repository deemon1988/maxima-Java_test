package org.example.fromthecource;

public class Truck extends Transport {

    public Truck(String name, int capacity, int speed, double costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    public Truck(String name, int capacity, int speed, double costOfKm, boolean isRepairing) {
        super(name, capacity, speed, costOfKm, isRepairing);
    }

    @Override
    float getPrice(City city) {
        float stoimost = (float) (getCostOfKm() * city.getDistance());
        return stoimost;
    }


    @Override
    public void startRepair() {
        if (isRepairing()) System.out.println("Грузовик на ремонте");
    }

    @Override
    public void finishRepair() {
        if (!isRepairing()) System.out.println("Грузовик доступен");
    }

    @Override
    public boolean isRepairing() {
        return false;
    }
}