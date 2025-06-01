public class MacBook implements Laptop {
    private int volume;
    private boolean isOn;

    public MacBook() {
        this.volume = 70;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("MacBook menyala.");
        } else {
            System.out.println("MacBook sudah menyala.");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("MacBook dimatikan.");
        } else {
            System.out.println("MacBook sudah mati.");
        }
    }

    @Override
    public void volumeUp() {
        if (isOn) {
            if (volume < 100) {
                volume += 10;
                System.out.println("Volume MacBook: " + volume);
            } else {
                System.out.println("Volume MacBook sudah maksimal.");
            }
        } else {
            System.out.println("Nyalakan dulu MacBook-nya.");
        }
    }

    @Override
    public void volumeDown() {
        if (isOn) {
            if (volume > 0) {
                volume -= 10;
                System.out.println("Volume MacBook: " + volume);
            } else {
                System.out.println("Volume MacBook sudah minimal.");
            }
        } else {
            System.out.println("Nyalakan dulu MacBook-nya.");
        }
    }
}
