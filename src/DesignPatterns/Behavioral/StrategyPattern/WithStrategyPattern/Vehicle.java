package DesignPatterns.Behavioral.StrategyPattern.WithStrategyPattern;

import DesignPatterns.Behavioral.StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    // Not initialising with new as it will be not reusable then
    DriveStrategy driveStrategy;

    // Constructor injection
    Vehicle(DriveStrategy driveStrategyObj) {
        this.driveStrategy = driveStrategyObj;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
