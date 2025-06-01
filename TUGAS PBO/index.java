import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Pilih laptop
            System.out.println("Pilih laptop yang ingin digunakan:");
            System.out.println("1. Lenovo");
            System.out.println("2. Toshiba");
            System.out.println("3. MacBook");
            System.out.print("Masukkan pilihan (1/2/3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            Laptop laptop;
            switch (pilihan) {
                case 1 -> laptop = new Lenovo();
                case 2 -> laptop = new Toshiba();
                case 3 -> laptop = new MacBook();
                default -> {
                    System.out.println("Pilihan tidak valid, default Lenovo digunakan.");
                    laptop = new Lenovo();
                }
            }

            LaptopUser user = new LaptopUser(laptop);

            // Menu interaktif
            String input;
            do {
                System.out.println("\nMenu:");
                System.out.println("ON    : Nyalakan laptop");
                System.out.println("OFF   : Matikan laptop");
                System.out.println("UP    : Volume naik");
                System.out.println("DOWN  : Volume turun");
                System.out.println("EXIT  : Keluar");
                System.out.print("Masukkan perintah: ");
                input = scanner.nextLine().toUpperCase();

                switch (input) {
                    case "ON" -> user.turnOn();
                    case "OFF" -> user.turnOff();
                    case "UP" -> user.volumeUp();
                    case "DOWN" -> user.volumeDown();
                    case "EXIT" -> System.out.println("Keluar dari program.");
                    default -> System.out.println("Perintah tidak dikenal.");
                }
            } while (!input.equals("EXIT"));

            scanner.close();
        }
    }
}
