public class Superman extends Kryptorian {
    private String nama;

    public Superman(String nama) {
        this.nama = nama;
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    public void leapBuilding() {

    }

    public void stopBullet() {

    }

    @Override
    public void eat() {
        System.out.println("Nasi Goreng");
    }

    public String getName() {
        return this.nama;
    }
}