package DesignPatterns.Behavioral.StrategyPattern.WithStrategyPattern;

import DesignPatterns.Behavioral.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
