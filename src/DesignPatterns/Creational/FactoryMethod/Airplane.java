package DesignPatterns.Creational.FactoryMethod;

public class Airplane implements Transport {
    @Override
    public String deliver() {
        return "Delivering by land in a box";
    }
}
