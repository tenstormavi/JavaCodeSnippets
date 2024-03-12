package DesignPatterns.Behavioral.StrategyPattern.WithStrategyPattern;

import DesignPatterns.Behavioral.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
