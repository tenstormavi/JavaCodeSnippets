package DesignPatterns.StrategyPattern.WithoutStrategyPattern;

public class Vehicle {
    // Problem: Sports and off-road classes are base class of vehicle class and sharing a similar capability
    // Not reusing the code, and duplicating it

    public void drive() {
        // Some code
        System.out.println("Normal Drive Capability!");
    }
}
