public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public double calcFuelEfficency() {
        return 0;
    }

    @Override
    public double calcTripDistance() {
        return 0;
    }
}