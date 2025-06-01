public class LaptopUser {
    private final Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    public void turnOn() {
        laptop.powerOn();
    }

    public void turnOff() {
        laptop.powerOff();
    }

    public void volumeUp() {
        laptop.volumeUp();
    }

    public void volumeDown() {
        laptop.volumeDown();
    }
}
