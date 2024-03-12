package DesignPatterns.NullObjectPattern;

public class VehicleFactory {
    public Vehicle getVehicleObject(String type) {
        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        }
        return new NullVehicle();
    }
}
