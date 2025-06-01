public class Toshiba implements Laptop {
    private int volume;
    private boolean isOn;

    public Toshiba() {
        this.volume = 30;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Toshiba menyala.");
        } else {
            System.out.println("Toshiba sudah menyala.");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Toshiba dimatikan.");
        } else {
            System.out.println("Toshiba sudah mati.");
        }
    }

    @Override
    public void volumeUp() {
        if (isOn) {
            if (volume < 100) {
                volume += 10;
                System.out.println("Volume Toshiba: " + volume);
            } else {
                System.out.println("Volume Toshiba sudah maksimal.");
            }
        } else {
            System.out.println("Nyalakan dulu Toshiba-nya.");
        }
    }

    @Override
    public void volumeDown() {
        if (isOn) {
            if (volume > 0) {
                volume -= 10;
                System.out.println("Volume Toshiba: " + volume);
            } else {
                System.out.println("Volume Toshiba sudah minimal.");
            }
        } else {
            System.out.println("Nyalakan dulu Toshiba-nya.");
        }
    }
}
