package LLD.ParkingLot.AbstractClass;

import LLD.ParkingLot.Constants.VehicleType;
import LLD.ParkingLot.Model.ParkingSpot;
import LLD.ParkingLot.Model.Vehicle;

import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager {
    public TwoWheelerManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    public ParkingSpot findParkingSpot() {
        // logic to find nearest parking spot for 2 wheeler
        int index = (int) ((Math.random() * (1 - 50)) + 50);
        ParkingSpot twoWheelerSpot = spots.get(index);
        return twoWheelerSpot;
    }
}
