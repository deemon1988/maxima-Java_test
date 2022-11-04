package org.example;

public class SimpleTransportFactory {

    public enum TransportType {
        SHIP,
        TRUCK,
        PLANE
    }
    public Transport createTransport(SimpleTransportFactory.TransportType type) {
        Transport transport = null;
        final String SHIP_NAME = "Новый Корабль" ;
        final String TRUCK_NAME = "Новый Грузовик" ;
        final String PLANE_NAME = "Новый Самолёт" ;
        final float SHIP_PRICE = 30.05f;
        final float TRUCK_PRICE = 10.03f;
        final float PLANE_PRICE = 50.01f;
        int weight = 1701;



        switch (type) {
            case SHIP:
                transport = new Ship(SHIP_NAME, multipleWeight(weight), 70, SHIP_PRICE);
                break;
            case TRUCK:
                transport = new Truck(TRUCK_NAME, multipleWeight(weight), 70, TRUCK_PRICE);
                break;
            case PLANE:
                transport = new Plane(PLANE_NAME, multipleWeight(weight), 70, PLANE_PRICE);
                break;
        }
        return transport;
    }

    public static int multipleWeight (int a) {
        //int w =0;
        if( Math.round(a)%500 == 0) {
            // w = Math.round(a);
        }
        else {
            while (a%500!=0) {
                a -=1;
                if (a%500==0) {
                    //w = a;
                }
            }
        }
        return a;
    }
}
