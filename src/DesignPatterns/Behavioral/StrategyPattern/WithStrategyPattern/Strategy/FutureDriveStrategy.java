package DesignPatterns.Behavioral.StrategyPattern.WithStrategyPattern.Strategy;

public class FutureDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Future Drive Capability!");
    }
}
