public abstract class Vehicle {
    public abstract double calcFuelEfficency();

    public abstract double calcTripDistance();

    public String StringtoString() {
        return this.getClass().getSimpleName();
    }
}