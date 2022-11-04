package org.example;

public class TransportShop {

    private final SimpleTransportFactory transportFactory;

    public TransportShop(SimpleTransportFactory transportFactory) {
        this.transportFactory = transportFactory;
    }

    public Transport orderTransport(SimpleTransportFactory.TransportType type) {
        Transport transport = transportFactory.createTransport(type);

       return transport;
    }
}
