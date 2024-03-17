package LLD.ParkingLot.Factory;

import LLD.ParkingLot.AbstractClass.FourWheelerManager;
import LLD.ParkingLot.AbstractClass.ParkingSpotManager;
import LLD.ParkingLot.AbstractClass.TwoWheelerManager;
import LLD.ParkingLot.Constants.VehicleType;
import LLD.ParkingLot.Model.ParkingSpot;

import java.util.List;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getParkSpotManager(VehicleType vehicleType, List<ParkingSpot> spots) {
        if (vehicleType.equals(VehicleType.TWO_WHEELER)) {
            return new TwoWheelerManager(spots);
        }
        else if (vehicleType.equals(VehicleType.FOUR_WHEELER)) {
            return new FourWheelerManager(spots);
        }
        return null;
    }
}
