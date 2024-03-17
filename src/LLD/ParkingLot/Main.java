package LLD.ParkingLot;

import LLD.ParkingLot.Constants.VehicleType;
import LLD.ParkingLot.Factory.ParkingSpotManagerFactory;
import LLD.ParkingLot.Model.ParkingSpot;
import LLD.ParkingLot.Model.Ticket;
import LLD.ParkingLot.Model.Vehicle;
import LLD.ParkingLot.Service.EntranceGate;
import LLD.ParkingLot.Service.ExitGate;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        // Initialize parking spot
        List<ParkingSpot> spots = new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            if (i <= 50) {
                spots.add(new ParkingSpot(i, 10));
            } else {
                spots.add(new ParkingSpot(i, 20));
            }
        }

        // Create Parking Spot Manager Factory
        ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory();

        // Create Entrance gate and Exit gate
        EntranceGate entranceGate = new EntranceGate(factory);
        ExitGate exitGate = new ExitGate(factory);

        // Usage
        Vehicle vehicle = new Vehicle(123, VehicleType.TWO_WHEELER);
        ParkingSpot spot = entranceGate.findParkingSpot(vehicle.getVehicleType(), spots);
        System.out.println("Two wheeler spot: " + spot.getId());
        Ticket ticket = entranceGate.generateTicket(vehicle, spot);

        // Vehicle Leaves
        int amount = exitGate.calculateAmount(ticket);
        System.out.println("Amount to pay: " + amount);
        boolean paymentStatus = exitGate.collectPayment(amount);
        if (paymentStatus)
        exitGate.removeVehicle(ticket, spots);
    }
}
