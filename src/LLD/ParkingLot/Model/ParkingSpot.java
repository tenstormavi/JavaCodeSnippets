package LLD.ParkingLot.Model;

public class ParkingSpot {
    private int id;
    private boolean isEmpty;
    private int price;
    private Vehicle vehicle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot(int id, int price) {
        this.id = id;
        this.isEmpty = true;
        this.price = price;
        this.vehicle = null;
    }
}
