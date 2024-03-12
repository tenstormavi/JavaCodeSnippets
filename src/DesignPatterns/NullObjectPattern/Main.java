package DesignPatterns.NullObjectPattern;

public class Main {
    public static void main(String args[]) {
        // Implementation:
        // 1. A null object replaces with NULL return type
        // 2. No need to put IF CHECK for checking NULL
        // 3. Null object reflects do nothing or default behaviour
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle = vehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle);

        Vehicle vehicle1 = vehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle1);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        // no need to check null as it is already handled in the implementation class
//        if (vehicle != null) {
//            System.out.println("Seating Capacity: " + vehicle.getFuelCapacity());
//            System.out.println("Fuel Tank Capacity: " + vehicle.getSeatingCapacity());
//        }

        System.out.println("Seating Capacity: " + vehicle.getFuelCapacity());
        System.out.println("Fuel Tank Capacity: " + vehicle.getSeatingCapacity());
    }
}
