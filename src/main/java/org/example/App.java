package org.example;

public class App
{
    public static void main( String[] args )
    {
        City Spb = new City("Санкт-Петербург", 98, true, true);
        City Murmansk = new City("Мурманск",1400,true, false);
        City Tver = new City("Тверь", 540);
        City Mosсow = new City("Москва", 800, true, true);

        Truck trailer_truck = new Truck("Грузовик с полуприцепом", 44000, 90, 50.41 );
        Ship tanker = new Ship("Танкер",18159000, 27, 300.82);
        Plane aircraft = new Plane("Самолёт",120000, 800, 600.68);
        Ship kater = new Ship("Катер",1815, 60, 150.82);
        // System.out.println(aircraft.getPrice(Tver));
        // System.out.println(tanker.getPrice(Murmansk));
        // System.out.println(trailer_truck.getPrice(Mosсow));

       // System.out.println(tanker.equals(kater));

SimpleTransportFactory transportFactory = new SimpleTransportFactory();
TransportShop transportShop = new TransportShop(transportFactory);
transportShop.orderTransport(SimpleTransportFactory.TransportType.SHIP);
        System.out.println(SimpleTransportFactory.TransportType.SHIP);

       TransportFactory zxc = new TransportFactory();
        System.out.println(zxc.getTransport(Mosсow,1501,1));
        System.out.println();
        Logistics asd = new Logistics(tanker, kater, trailer_truck,aircraft);
        asd.getShipping(Murmansk,1500,3);


    }


}