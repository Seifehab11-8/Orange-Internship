public class CargoCapacity extends VehicleFeature{
    private double capacity;
    public static final String TYPE = "Capacity";
    public CargoCapacity(double capacity) {
        this.capacity = capacity;
        type = TYPE;
    }

    public double getCapacity() {
        return capacity;
    }
    
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public double calculateFeaturePrice() {
        return capacity * 0.05;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof CargoCapacity)) return false;
        CargoCapacity c = (CargoCapacity) o;
        return (this.capacity == c.getCapacity());
    }
}
