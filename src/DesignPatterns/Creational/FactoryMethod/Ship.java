package DesignPatterns.Creational.FactoryMethod;

public class Ship implements Transport {

    @Override
    public String deliver() {
        return "Delivering by sea in a container";
    }
}
