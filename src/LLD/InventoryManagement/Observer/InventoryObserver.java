package LLD.InventoryManagement.Observer;

import LLD.InventoryManagement.Entity.Product;

public interface InventoryObserver {

    public void OnInventoryChange(Product product, int newQuantity);
}
