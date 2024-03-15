package DesignPatterns.Structural.AdapterPattern.Example2.Adaptee;

import java.util.ArrayList;
import java.util.List;

public class SwiggyStore {
    List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }
}
