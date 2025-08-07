
public class Motorcycle extends Vehicle{
    private static final double MOTORCYCLE_BASE_PRICE = 30;
    public static final String MOTORCYCLE_TYPE = "Motorcycle";
    public Motorcycle() {
    }

    public Motorcycle(String registrationNumber, String fuelType) {
        super(registrationNumber, fuelType);
        this.registrationNumber = registrationNumber;
        this.fuelType = fuelType;
        this.isAvailable = true;
    }

        @Override
    public String getVehicleType() {
        return MOTORCYCLE_TYPE;
    }

    @Override
    public double calcPrice() {
        return MOTORCYCLE_BASE_PRICE + calcAllFeaturePrices();
    }
}
