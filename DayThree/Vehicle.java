import java.util.Vector;

public abstract class Vehicle {
    protected String registrationNumber;
    protected String fuelType;
    protected boolean isAvailable;
    protected Vector<VehicleFeature> features; 

    public abstract String getVehicleType();

    public Vector<VehicleFeature> getFeatures() {
        return features;
    }

    public Vehicle() {
        this.isAvailable = true;
        this.features = new Vector<VehicleFeature>();
    }

    public Vehicle(String registrationNumber, String fuelType) {
        this.registrationNumber = registrationNumber;
        this.fuelType = fuelType;
        this.isAvailable = true;
        this.features = new Vector<VehicleFeature>();
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void addFeature(VehicleFeature vehicleFeature) {
        features.addElement(vehicleFeature);
    }

    public VehicleFeature getFeature(int index) {
        return features.get(index);
    }

    public void setFeatures(Vector<VehicleFeature> features) {
        this.features = features;
    }

    protected double calcAllFeaturePrices() {
        double f_price = 0;
        for(VehicleFeature vh : features) {
            f_price += vh.calculateFeaturePrice();
        }
        return f_price;
    }
    public abstract double calcPrice();
}
