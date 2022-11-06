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
        if (speed < 40 && city.isOnWater()) transport = new Ship(SHIP_NAME, rWeight(weight), rSpeed(speed), SHIP_PRICE);
        if (speed > 120 && city.isHasAirport()) transport = new Plane(PLANE_NAME, rWeight(weight), rSpeed(speed), PLANE_PRICE);
        if (speed > 40 && speed <120) transport = new Truck(TRUCK_NAME, rWeight(weight),rSpeed(speed), PLANE_PRICE);


        System.out.println(transport.getName()+" - грузоподъёмность "+transport.getCapacity()+" скорость "+transport.getSpeed());
        return transport;
        }


    public static int rWeight(int a){  // необходимая грузоподъемность
        if (Math.round(a) % 500 == 0) {
        } else {
            while (a % 500 != 0) {
                a ++;
            }
        }
        return a;
    }

    public int rSpeed(int b){  // метод для округления скорости
        if (b%10 ==0) return b;
        else {
            while (b%10 !=0) {b++;}
            Math.round(b);
        }

        return b;
    }




    @Override
    public TransportFactory createTransport() {
        return new TransportFactory();
    }
}
