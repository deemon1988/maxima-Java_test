package org.example;

public class TransportCreate {
    private final TransportFactory transportFactory;
    public TransportCreate(TransportFactory transportFactory) {
        this.transportFactory = transportFactory;
    }
    public Transport getTransport(City city, int weight, int hours){
        Transport transport = transportFactory.getTransport(city, weight, hours);
        System.out.println(transport.getName());
        return transport;
    }
}
