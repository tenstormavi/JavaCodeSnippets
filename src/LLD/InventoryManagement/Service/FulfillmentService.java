package LLD.InventoryManagement.Service;

import LLD.InventoryManagement.Entity.Product;
import LLD.InventoryManagement.Observable.ProductStockObservable;

import java.util.HashMap;
import java.util.Map;

public class FulfillmentService {

    private static FulfillmentService instance;
    private Map<String, Integer> inventory = new HashMap<>();

    private FulfillmentService() {}

    public static synchronized FulfillmentService getInstance() {
        if (instance == null) {
            instance = new FulfillmentService();
        }
        return instance;
    }

    public void addInventory(String productId, int quantity, ProductStockObservable sampleProductObservable) {
        int newQuantity = inventory.getOrDefault(productId, 0) + quantity;
        inventory.put(productId, newQuantity);

        Product product = new Product(productId, "Sample Product");
        sampleProductObservable.notifyObservers(product, newQuantity);
    }

    public void removeInventory(String productId, ProductStockObservable sampleProductObservable) {
        if (inventory.containsKey(productId)) {
            int newQuantity = inventory.get(productId) - 1;
            if (newQuantity == 0) {
                inventory.remove(productId);
            } else {
                inventory.put(productId, newQuantity);
            }

            Product product = new Product(productId, "Sample Product");
            sampleProductObservable.notifyObservers(product, newQuantity);
        } else {
            System.out.println("No inventory present for product ID: " + productId);
        }
    }

    public void viewInventory() {
        System.out.println("Current Inventory: ");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
