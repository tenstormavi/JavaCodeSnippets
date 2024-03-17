package LLD.ParkingLot.Service;

import LLD.ParkingLot.AbstractClass.ParkingSpotManager;
import LLD.ParkingLot.Factory.ParkingSpotManagerFactory;
import LLD.ParkingLot.Model.ParkingSpot;
import LLD.ParkingLot.Model.Ticket;

import java.util.List;

public class ExitGate {

    private final ParkingSpotManagerFactory parkingSpotManagerFactory;

    public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public int calculateAmount(Ticket ticket) {
        long entryTime = ticket.getEntryTime();
        int priceOfSpot = ticket.getParkingSpot().getPrice();
        long timeDiff = 2; // currentTime - entryTime
        int paymentToPay = (int) (timeDiff * priceOfSpot);
        return paymentToPay;
    }

    public boolean collectPayment(int amount) {
        // Collect payment logic
        return true;
    }

    public void removeVehicle(Ticket ticket, List<ParkingSpot> spots) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkSpotManager(
                ticket.getVehicle().getVehicleType(), spots);
        parkingSpotManager.removeVehicle(ticket.getVehicle());
    }
}
