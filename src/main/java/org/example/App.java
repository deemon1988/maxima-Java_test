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


      //  Logistics logistics = new Logistics(aircraft,tanker, kater, trailer_truck,aircraft);
       // logistics.getShipping(Tver,1500,3);

        TransportCreater transportCreater = new TransportFactory();
        Transport transport = transportCreater.createTransport().getTransport(Mosсow,1700,3);
        System.out.println(transport instanceof Plane);




    }


}