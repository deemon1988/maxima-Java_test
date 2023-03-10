package org.example.fromthecource;

public class Plane extends Transport {
    public Plane(String name, int capacity, int speed, double costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    public Plane(String name, int capacity, int speed, double costOfKm, boolean isRepairing) {
        super(name, capacity, speed, costOfKm, isRepairing);
    }

    @Override
    float getPrice(City city) {
        float stoimost;
        if (city.isHasAirport()) return (float) (getCostOfKm() * city.getDistance());
        else return 0;
    }


    @Override
    public void startRepair() {
        System.out.println("Самолёт не ремонте");
    }

    @Override
    public void finishRepair() {
        System.out.println("Самолёт доступен");
    }

    @Override
    public boolean isRepairing() {
        return false;
    }
}
