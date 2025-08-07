import java.util.Vector;

public class VehicleOrderSystem {
    private VehicleInventory vehicleInventory;
    public VehicleOrderSystem(VehicleInventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }
    
    private boolean checkIfFeatureExist(Vehicle vehicle, VehicleFeature vehicleFeature) {
        boolean isFound = false;
        for(VehicleFeature vh : vehicle.getFeatures()) {
            if(vh.equals(vehicleFeature)) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    private Vehicle checkAvailability(String type, Vector<VehicleFeature> desiredFeatures) {
        boolean desiredCarFound = true;
        for(int i = 0; i < vehicleInventory.getListSize(); i++) {
            desiredCarFound = true;
            if(
                    vehicleInventory.getVehicle(i).getVehicleType() == type 
                && vehicleInventory.getVehicle(i).isAvailable() == true
            ){
                for(VehicleFeature vh : desiredFeatures) {
                    if(!checkIfFeatureExist(vehicleInventory.getVehicle(i), vh)){
                        desiredCarFound = false;
                    }
                }
            }
            else {
                desiredCarFound = false;
            }
            if(desiredCarFound) {
                return vehicleInventory.getVehicle(i);
            }
        }
        return null;
    }

    public void placeOrder(String type, Vector<VehicleFeature> desiredFeatures) {
        Vehicle vehicle = checkAvailability(type, desiredFeatures);
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
