public abstract class Airplane extends Vehicle implements IFlyer {
    @Override
    public void takeOff() {
    }

    @Override
    public void land() {
    }

    @Override
    public void fly() {
    }

    @Override
    public String StringtoString() {
        return this.getClass().getSimpleName();
    }
}