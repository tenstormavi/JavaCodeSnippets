package DesignPatterns.Structural.AdapterPattern.Example2.Adapter;

public class GroceryProduct implements GroceryItem {
    @Override
    public String getName() {
        return "Maggie";
    }

    @Override
    public String getPrice() {
        return "50";
    }

    @Override
    public String getStoreName() {
        return "More MegaStore";
    }
}
