package DesignPatterns.Structural.AdapterPattern.Example1.Adapter;

import DesignPatterns.Structural.AdapterPattern.Example1.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPound();

        // Convert in kg
        double weightInKg = weightInPound * 0.45;
        return weightInKg;
    }
}
