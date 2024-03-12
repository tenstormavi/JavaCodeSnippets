package DesignPatterns.Creational.FactoryMethod;

public class TransportFactory {

    // Factory Method
    public Transport getTransport(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Truck")) {
            return new Truck();
        } else if (type.equalsIgnoreCase("Ship")) {
            return new Ship();
        } else if (type.equalsIgnoreCase("Airplane")) {
            return new Airplane();
        }
        return null;
    }
}
