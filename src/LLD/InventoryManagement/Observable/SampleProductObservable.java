package LLD.InventoryManagement.Observable;

import LLD.InventoryManagement.Entity.Product;
import LLD.InventoryManagement.Observer.InventoryObserver;

import java.util.ArrayList;
import java.util.List;

public class SampleProductObservable implements ProductStockObservable {

    private List<InventoryObserver> observerList = new ArrayList<>();


    @Override
    public void addObserver(InventoryObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(InventoryObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(Product product, int newQuantity) {
        for (InventoryObserver observer: observerList) {
            observer.OnInventoryChange(product, newQuantity);
        }
    }
}
