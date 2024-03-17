package LLD.ParkingLot.AbstractClass;

import LLD.ParkingLot.Model.ParkingSpot;
import LLD.ParkingLot.Model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> spots = new ArrayList<>();

    public ParkingSpotManager(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public abstract ParkingSpot findParkingSpot();

    public void parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findParkingSpot();
        spot.setVehicle(vehicle);
        spot.setEmpty(false);
    }

    public void removeVehicle(Vehicle vehicle) {
        for (ParkingSpot spot: spots) {
            if (spot.getVehicle() != null && spot.getVehicle().equals(vehicle)) {
                spot.setVehicle(null);
                spot.setEmpty(true);
                break;
            }
        }
    }
}
