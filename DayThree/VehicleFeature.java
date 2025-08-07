public abstract class VehicleFeature {
    protected String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public abstract double calculateFeaturePrice();

    public abstract boolean equals(Object o);
}
