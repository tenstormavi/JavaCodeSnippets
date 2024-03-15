package DesignPatterns.Structural.AdapterPattern.Example1.Adaptee;

public class WeightMachineForBabies implements WeightMachine {
    @Override
    public double getWeightInPound() {
        return 28;
    }
}
