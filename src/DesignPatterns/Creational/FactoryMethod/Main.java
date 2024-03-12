package DesignPatterns.Creational.FactoryMethod;

public class Main {
    public static void main(String args[]) {
        TransportFactory transportFactory = new TransportFactory();

        Transport t1 = transportFactory.getTransport("Truck");
        System.out.println(t1.deliver());

        Transport t2 = transportFactory.getTransport("Ship");
        System.out.println(t2.deliver());

        Transport t3 = transportFactory.getTransport("Airplane");
        System.out.println(t3.deliver());
    }
}
