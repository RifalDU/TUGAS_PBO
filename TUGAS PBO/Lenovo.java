public class Lenovo implements Laptop {
    private int volume;
    private boolean isOn;

    public Lenovo() {
        this.volume = 50;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Lenovo menyala.");
        } else {
            System.out.println("Lenovo sudah menyala.");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Lenovo dimatikan.");
        } else {
            System.out.println("Lenovo sudah mati.");
        }
    }

    @Override
    public void volumeUp() {
        if (isOn) {
            if (volume < 100) {
                volume += 10;
                System.out.println("Volume Lenovo: " + volume);
            } else {
                System.out.println("Volume Lenovo sudah maksimal.");
            }
        } else {
            System.out.println("Nyalakan dulu Lenovo-nya.");
        }
    }

    @Override
    public void volumeDown() {
        if (isOn) {
            if (volume > 0) {
                volume -= 10;
                System.out.println("Volume Lenovo: " + volume);
            } else {
                System.out.println("Volume Lenovo sudah minimal.");
            }
        } else {
            System.out.println("Nyalakan dulu Lenovo-nya.");
        }
    }
}

