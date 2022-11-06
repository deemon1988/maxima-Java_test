package org.example;


public class TransportFactory implements TransportCreater{



    Transport getTransport(City city, int weight, int hours) {
        final String SHIP_NAME = "Новый Корабль";
        final String TRUCK_NAME = "Новый Грузовик";
        final String PLANE_NAME = "Новый Самолёт";
        final float SHIP_PRICE = 30.05f;
        final float TRUCK_PRICE = 10.03f;
        final float PLANE_PRICE = 50.01f;
        Transport transport = null;
        int speed;

        speed = city.getDistance() / hours;     // скорость с которой должен двигаться транспорт для доставки в срок
        if (speed < 40 && city.isOnWater()) transport = new Ship(SHIP_NAME, multipleWeight(weight), speed, SHIP_PRICE);
        if (speed > 120 && city.isHasAirport()) transport = new Plane(PLANE_NAME, multipleWeight(weight), speed, PLANE_PRICE);
        if (speed > 40 && speed <120) transport = new Truck(TRUCK_NAME, multipleWeight(weight),speed, PLANE_PRICE);


        System.out.println(transport.getName()+" - грузоподъёмность "+transport.getCapacity()+" скорость "+transport.getSpeed());
        return transport;
        }



    public static int multipleWeight ( int a){  // необходимая грузоподъемность
        if (Math.round(a) % 500 == 0) {         // округлять вверх  Math.floor
        } else {
            while (a % 500 != 0) {
                a -= 1;                         // найти более быстрый метод
                if (a % 500 == 0) {
                    //w = a;
                }
            }
        }
        return a;
    }



    @Override
    public TransportFactory createTransport() {
        return new TransportFactory();
    }
}
