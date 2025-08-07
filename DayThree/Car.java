
public class Car extends Vehicle{
    private static final double CAR_BASE_PRICE = 50;
    public static final String CAR_TYPE = "Car";
    public Car() {

    }

    public Car(String registrationNumber, String fuelType) {
        super(registrationNumber, fuelType);
        this.registrationNumber = registrationNumber;
        this.fuelType = fuelType;
        this.isAvailable = true;
    }

    @Override
    public String getVehicleType() {
        return CAR_TYPE;
    }

    @Override
    public double calcPrice() {
        return CAR_BASE_PRICE + calcAllFeaturePrices();
    }
}
