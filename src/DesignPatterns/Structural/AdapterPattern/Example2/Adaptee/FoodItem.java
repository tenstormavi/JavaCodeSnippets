package DesignPatterns.Structural.AdapterPattern.Example2.Adaptee;

import DesignPatterns.Structural.AdapterPattern.Example2.Adaptee.Item;

public class FoodItem implements Item {
    @Override
    public String getItemName() {
        return "Biryani";
    }

    @Override
    public String getPrice() {
        return "200";
    }

    @Override
    public String getRestaurantName() {
        return "Donne";
    }
}
