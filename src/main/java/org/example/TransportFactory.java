package org.example;


public class TransportFactory {


    public enum TransportType {
        SHIP,
        TRUCK,
        PLANE
    }


    Transport getTransport(City city, int weight, int hours) {
        final String SHIP_NAME = "Новый Корабль";
        final String TRUCK_NAME = "Новый Грузовик";
        final String PLANE_NAME = "Новый Самолёт";
        final float SHIP_PRICE = 30.05f;
        final float TRUCK_PRICE = 10.03f;
        final float PLANE_PRICE = 50.01f;
        Transport transport1 = null;
        String[] a = {"SHIP","TRUCK","SHIP"};

        System.out.println(city.getDistance() / hours );
        if (city.getDistance() / hours < 40 && city.isOnWater()) transport1 = new Ship(SHIP_NAME, multipleWeight(weight), 70, SHIP_PRICE);
        if (city.getDistance() / hours > 120 && city.isHasAirport()) transport1 = new Plane(PLANE_NAME, multipleWeight(weight), 70, PLANE_PRICE);


            /*switch (a[0]) {
                case "SHIP":
                    transport1 = new Ship(SHIP_NAME, multipleWeight(weight), 70, SHIP_PRICE);
                    break;
                case "TRUCK":
                    transport1 = new Truck(TRUCK_NAME, multipleWeight(weight), 70, TRUCK_PRICE);
                    break;
                case "PLANE":
                    transport1 = new Plane(PLANE_NAME, multipleWeight(weight), 70, PLANE_PRICE);
                    break;
            }*/
        return transport1;
        }



    public static int multipleWeight ( int a){
        //int w =0;
        if (Math.round(a) % 500 == 0) {
            // w = Math.round(a);
        } else {
            while (a % 500 != 0) {
                a -= 1;
                if (a % 500 == 0) {
                    //w = a;
                }
            }
        }
        return a;
    }
}
