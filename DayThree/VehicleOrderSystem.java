import java.util.Vector;

public class VehicleOrderSystem {
    private VehicleInventory vehicleInventory;
    public VehicleOrderSystem(VehicleInventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }
    


    public void placeOrder(String type, Vector<VehicleFeature> desiredFeatures) {
        Vehicle vehicle = vehicleInventory.checkAvailability(type, desiredFeatures);
        if(vehicle != null) {
            vehicle.setAvailable(false);
            System.out.println("Vehicle reserved: " + vehicle.getRegistrationNumber());
            System.out.println("Total price: $" + vehicle.calcPrice());
        }
        else {
            System.out.println("No available vehicle matches your criteria.");
        }
    }
}
