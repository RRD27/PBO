public abstract class Kryptorian extends Animal implements IFlyer {
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