package org.example.fromthecource;

public class Logistics {
    Transport[] vehicles;

    public Logistics(Transport... vehicles) {
        this.vehicles = vehicles;
    }

    public Transport[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Transport[] vehicles) {
        this.vehicles = vehicles;
    }


    private Transport getVehicle;


    public Transport getShipping(City city, int weight, int time) throws Exception {

        for (Transport transport : vehicles) {
            isShippingAvailable(transport, city, weight, time);
        }
        System.out.println(getVehicle.getName());

        return getVehicle;
    }


    private void isShippingAvailable(Transport transport, City city, int weight, int time) {

        float minDeliveryPrice = vehicles[0].getPrice(city);
        float deliveryPrice;
        int deliveryTime;

        for (Transport transport1 : vehicles) {
            deliveryPrice = transport1.getPrice(city);
            deliveryTime = city.getDistance() / transport1.getSpeed();
            if (minDeliveryPrice >= deliveryPrice && deliveryPrice != 0) {                        // проверка по мин. стоиомости
                if (deliveryTime <= time && transport1.getCapacity() > weight && !transport1.isRepairing()) {                // проверка по параметрам
                    getVehicle = transport1;
                    minDeliveryPrice = deliveryPrice;
                }
            } else if (deliveryTime <= time && transport1.getCapacity() > weight && !transport1.isRepairing()) {
                if (getVehicle == null && transport1.getPrice(city) != 0) {
                    getVehicle = transport1;
                } else if (getVehicle != null) {
                    if (getVehicle.getPrice(city) > deliveryPrice && deliveryPrice != 0) {
                        getVehicle = transport1;
                    }
                }

            }
        }

    }

}




