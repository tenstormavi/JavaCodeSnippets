package LLD.ParkingLot.AbstractClass;

import LLD.ParkingLot.Constants.VehicleType;
import LLD.ParkingLot.Model.ParkingSpot;
import LLD.ParkingLot.Model.Vehicle;

import java.util.List;

public class FourWheelerManager extends ParkingSpotManager {
    public FourWheelerManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    public ParkingSpot findParkingSpot() {
        // logic to find nearest parking spot for 4 wheeler
        int index = (int) ((Math.random() * (100 - 51)) + 51);
        ParkingSpot fourWheelerSpot = spots.get(index);
        return fourWheelerSpot;
    }
}
