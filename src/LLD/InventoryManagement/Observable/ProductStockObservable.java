package LLD.InventoryManagement.Observable;

import LLD.InventoryManagement.Entity.Product;
import LLD.InventoryManagement.Observer.InventoryObserver;

public interface ProductStockObservable {

    public void addObserver(InventoryObserver observer);

    public void removeObserver(InventoryObserver observer);

    public void notifyObservers(Product product, int newQuantity);
}
