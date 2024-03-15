package DesignPatterns.Structural.AdapterPattern.Example2;

import DesignPatterns.Structural.AdapterPattern.Example2.Adaptee.FoodItem;
import DesignPatterns.Structural.AdapterPattern.Example2.Adaptee.SwiggyStore;
import DesignPatterns.Structural.AdapterPattern.Example2.Adapter.GroceryItemAdapter;
import DesignPatterns.Structural.AdapterPattern.Example2.Adapter.GroceryProduct;

public class Main {

    public static void main(String args[]) {
        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addItem(new FoodItem());
        swiggyStore.addItem(new FoodItem());

        // Adapter grocery which was incompatible with food.
        swiggyStore.addItem(new GroceryItemAdapter(new GroceryProduct()));
    }
}
