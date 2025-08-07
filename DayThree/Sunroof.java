
public class Sunroof extends VehicleFeature{
    private static final double DEFAULT_PRICE = 10;
    public static final String TYPE = "Sunroof";
    public Sunroof() {
        type = TYPE;
    }

    @Override
    public double calculateFeaturePrice() {
        return DEFAULT_PRICE;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Sunroof)) return false;
        return true;
    }
}
