import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VehicleInventory {
    private List <Vehicle> inventoryList;
    private int listSize;
    
    public int getListSize() {
        return listSize;
    }

    public VehicleInventory() {
        inventoryList = new ArrayList<Vehicle>();
        listSize = 0;
    }
    
    public void addVehicle(Vehicle vehicle) {
        inventoryList.add(vehicle);
        listSize++;
    }

    public Vehicle getVehicle(int index) {
        if(index < inventoryList.size()) {
            return inventoryList.get(index);
        }
        return null;
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

    public Vehicle checkAvailability(String type, Vector<VehicleFeature> desiredFeatures) {
        boolean desiredCarFound = true;
        for(int i = 0; i < inventoryList.size(); i++) {
            desiredCarFound = true;
            if(
                    inventoryList.get(i).getVehicleType() == type 
                && inventoryList.get(i).isAvailable() == true
            ){
                for(VehicleFeature vh : desiredFeatures) {
                    if(!checkIfFeatureExist(inventoryList.get(i), vh)){
                        desiredCarFound = false;
                    }
                }
            }
            else {
                desiredCarFound = false;
            }
            if(desiredCarFound) {
                return inventoryList.get(i);
            }
        }
        return null;
    }
}
