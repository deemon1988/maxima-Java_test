package org.example;

public class SimpleTransportFactory {
    public Transport createTransport (TransportType type) {
        Transport transport = null;
        switch (type) {
            case SHIP:
                transport = new Ship("корабль",10000,40,300.1) {
                    @Override
                    float getPrice(City city) {
                        return 0;
                    }
                };
                break;
            case PLANE:
                transport = new Plane("самолет",9000,540,400.1) {
                    @Override
                    float getPrice(City city) {
                        return 0;
                    }
                };
                break;
            case TRUCK:
                transport = new Truck("грузовик",1000,80,100.1) {
                    @Override
                    float getPrice(City city) {
                        return 0;
                    }
                };
                break;
        }
        return transport;
    }
}
