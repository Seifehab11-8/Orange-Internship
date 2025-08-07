import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        VehicleInventory vehicleInventory = new VehicleInventory();
        vehicleInventory.addVehicle(new Car("AAA123", "diesel"));
        vehicleInventory.addVehicle(new Truck("AAA4236223", "fuel"));
        vehicleInventory.addVehicle(new Motorcycle("dsfaAA123", "petrol"));
        vehicleInventory.addVehicle(new Car("AAA1sfad3", "diesel"));
        vehicleInventory.getVehicle(0).addFeature(new Sunroof());
        vehicleInventory.getVehicle(1).addFeature(new CargoCapacity(1234));
        VehicleOrderSystem v1 = new VehicleOrderSystem(vehicleInventory);
        Vector<VehicleFeature> vehicleFeatures = new Vector<>();
        vehicleFeatures.add(new CargoCapacity(1234));

        v1.placeOrder("Truck", vehicleFeatures);
        v1.placeOrder("Truck", vehicleFeatures);
    }
}
