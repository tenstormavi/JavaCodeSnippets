package DesignPatterns.Structural.AdapterPattern.Example2.Adapter;

import DesignPatterns.Structural.AdapterPattern.Example2.Adaptee.Item;

public class GroceryItemAdapter implements Item {
    private GroceryItem item;

    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.item = groceryItem;
    }
    @Override
    public String getItemName() {
        return this.item.getName();
    }

    @Override
    public String getPrice() {
        return this.item.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return this.item.getStoreName();
    }
}
