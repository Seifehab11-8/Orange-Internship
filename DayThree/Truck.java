
public class Truck extends Vehicle {
    private static final double TRUCK_BASE_PRICE = 80;
    public static final String TRUCK_TYPE = "Truck";
    public Truck() {
    }

    public Truck(String registrationNumber, String fuelType) {
        super(registrationNumber, fuelType);
        this.registrationNumber = registrationNumber;
        this.fuelType = fuelType;
        this.isAvailable = true;
    }

    @Override
    public String getVehicleType() {
        return TRUCK_TYPE;
    }

    @Override
    public double calcPrice() {
        return TRUCK_BASE_PRICE + calcAllFeaturePrices();
    }
}
