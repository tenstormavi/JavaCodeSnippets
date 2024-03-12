package DesignPatterns.Behavioral.StrategyPattern.WithStrategyPattern;

import DesignPatterns.Behavioral.StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
