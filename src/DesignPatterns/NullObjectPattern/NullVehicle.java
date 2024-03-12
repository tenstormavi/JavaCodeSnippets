package DesignPatterns.NullObjectPattern;

public class NullVehicle implements Vehicle {
    @Override
    public int getFuelCapacity() {
        // default behaviour instead of sending null
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        // default behaviour instead of sending null
        return 0;
    }
}
