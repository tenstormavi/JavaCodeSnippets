package DesignPatterns.Creational.FactoryMethod;

public class Truck implements Transport {

    @Override
    public String deliver() {
        return "Delivering by air in a cargo hold";
    }
}
