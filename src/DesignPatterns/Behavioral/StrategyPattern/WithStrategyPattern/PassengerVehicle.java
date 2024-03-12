package DesignPatterns.Behavioral.StrategyPattern.WithStrategyPattern;

import DesignPatterns.Behavioral.StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
