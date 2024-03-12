package DesignPatterns.NullObjectPattern;

public class Car implements Vehicle {
    @Override
    public int getFuelCapacity() {
        return 20;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
