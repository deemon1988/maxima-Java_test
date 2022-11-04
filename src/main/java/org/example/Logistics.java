package org.example;

public class Logistics implements Repairable{
    Transport[] vehicles = new Transport[3];
    public Logistics(Transport... vehicles) {
        this.vehicles = vehicles;
    }

    public Transport[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Transport[] vehicles) {
        this.vehicles = vehicles;
    }
    Transport getVehicle = null;
    String isRepairing = "";

    public Transport getShipping(City city, int weight, int time) {
        double spentTime;
        float stoimost;
        float minPrice = 0;
       // boolean capacity = false;
       // boolean sTime = false;


        for (int i = 0; i < vehicles.length; i++) {
            minPrice = vehicles[i].getPrice(city); //мин. стоимость для водного если нет реки
            spentTime = (double)city.getDistance()/vehicles[i].getSpeed();
            stoimost = (float) vehicles[i].getCostOfKm() * city.getDistance();

            //System.out.println(city.getName() + " " + city.getDistance() + " = " + stoimost);
            boolean capacity = false;
            boolean sTime = false;
            if (spentTime<time) sTime = true;
            if (vehicles[i].getCapacity()>weight) capacity = true;

            float counter = stoimost;
            if (sTime == true && capacity == true && minPrice > counter) {    // вынести в отдельный метод
                minPrice = counter;
                getVehicle = vehicles[i];
            }
            else {
                if (isShippingAvaible()){getVehicle = null; }       // в методе isShippingAvaible() проверять если
                else { getVehicle = vehicles[i];}                   // водный транспорт и нет реки
                }
        }


        return getVehicle;
    }


    private boolean isShippingAvaible () {
        boolean isAvaible = false;
        if(isRepairing())
        {
            System.out.println("Не Доступен");
            // выбирать транспорт заново исключая недоступный транспорт
            isAvaible = false;

        }
        else
        {
            System.out.println("Доступен");
            isAvaible = true;

        }

        return isAvaible;
    }

    @Override
    public void startRepair() {
        String[] repair = {"Танкер","Грузовик с полуприцепом",""};
        String[] isRepair = new String[repair.length];
        String isTransport = "";
       for (int i=0; i< repair.length; i++)
       {
           if (repair[i] != null) isRepair[i] = repair[i];
           if(isRepair[i] == getVehicle.getName()) isTransport = getVehicle.getName();
       }
        isRepairing = isTransport;
    }

    @Override
    public void finishRepair() {

    }

    @Override
    public boolean isRepairing() {
        boolean repairValue = false;
        startRepair();
        if(isRepairing == getVehicle.getName()) { repairValue = true;}

        return repairValue;
    }

}




