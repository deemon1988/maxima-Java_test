package org.example;


public class TransportFactory {

    public Transport getTransport(City city, int weight, int hours) {
        final String SHIP_NAME = "Корабль";
        final String TRUCK_NAME = "Грузовик";
        final String PLANE_NAME = "Самолёт";
        final float SHIP_PRICE = 30.05f;
        final float TRUCK_PRICE = 10.03f;
        final float PLANE_PRICE = 50.01f;

        int reqSpeed = city.getDistance() / hours;// скорость с которой должен двигаться транспорт для доставки в срок
        if (reqSpeed < 40 && city.isOnWater()) {
            System.out.println("Ship");
            return  new Ship(SHIP_NAME, roundWeight(weight), roundSpeed(reqSpeed), SHIP_PRICE);
        }
        if (reqSpeed > 120 && city.isHasAirport()) {
            System.out.println("Plane");
            return new Plane(PLANE_NAME, roundWeight(weight), roundSpeed(reqSpeed), PLANE_PRICE);
        }
        System.out.println("Truck");
       return new Truck(TRUCK_NAME, roundWeight(weight), roundSpeed(reqSpeed), TRUCK_PRICE);

    }

    private int roundSpeed(int speed){  // метод для округления скорости
        if (speed%10 ==0) return speed;
        return  (int) (Math.ceil(speed/10.0)*10);
    }

    private static int roundWeight(int weight){  // метод для округления грузоподъемности
        if (weight % 500 == 0) {return weight;}
        return (int) (Math.ceil(weight/500.0)*500);
    }

}
