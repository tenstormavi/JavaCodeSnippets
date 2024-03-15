package DesignPatterns.Structural.AdapterPattern.Example1;

import DesignPatterns.Structural.AdapterPattern.Example1.Adaptee.WeightMachineForBabies;
import DesignPatterns.Structural.AdapterPattern.Example1.Adapter.WeightMachineAdapter;
import DesignPatterns.Structural.AdapterPattern.Example1.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]) {

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
