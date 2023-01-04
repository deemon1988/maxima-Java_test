package org.example;

public class GetTransport {
private final SimpleTransportFactory transportFactory;

    public GetTransport(SimpleTransportFactory transportFactory) {
        this.transportFactory = transportFactory;
    }
public Transport getTransport(TransportType type){
        Transport transport = transportFactory.createTransport(type);
    System.out.println(transport.getName());
        return transport;
}
}
