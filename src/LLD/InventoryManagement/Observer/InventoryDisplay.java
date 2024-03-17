package LLD.InventoryManagement.Observer;

import LLD.InventoryManagement.Entity.Product;

public class InventoryDisplay implements InventoryObserver {

    @Override
    public void OnInventoryChange(Product product, int newQuantity) {
        System.out.println("Inventory updated - " + product.getName() + " : " + newQuantity);
    }
}
