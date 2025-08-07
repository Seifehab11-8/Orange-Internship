import java.util.ArrayList;
import java.util.List;

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
}
