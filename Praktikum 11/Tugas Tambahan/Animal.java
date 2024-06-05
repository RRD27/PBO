public abstract class Animal {
    public abstract void eat();

    public String StringtoString() {
        return this.getClass().getSimpleName();
    }
}