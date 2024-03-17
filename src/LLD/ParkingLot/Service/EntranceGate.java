package LLD.ParkingLot.Service;

import LLD.ParkingLot.AbstractClass.ParkingSpotManager;
import LLD.ParkingLot.Constants.VehicleType;
import LLD.ParkingLot.Factory.ParkingSpotManagerFactory;
import LLD.ParkingLot.Model.ParkingSpot;
import LLD.ParkingLot.Model.Ticket;
import LLD.ParkingLot.Model.Vehicle;

import java.util.List;

public class EntranceGate {
    private final ParkingSpotManagerFactory parkingSpotManagerFactory;

    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public ParkingSpot findParkingSpot(VehicleType vehicleType, List<ParkingSpot> spots) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkSpotManager(vehicleType, spots);
        return parkingSpotManager.findParkingSpot();
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        Ticket ticket = new Ticket(234423, parkingSpot, vehicle);
        return ticket;
    }
}
