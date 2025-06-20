import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tampilkan Data Buku");
            System.out.println("2. Tambah Data Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1:
                    BukuService.tampilkanDataBuku();
                    break;
                case 2:
                    System.out.print("Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Pengarang: ");
                    String pengarang = input.nextLine();
                    System.out.print("Tahun Terbit: ");
                    int tahun = input.nextInt();
                    input.nextLine(); // konsumsi newline
                    System.out.print("Jenis Buku: ");
                    String jenis = input.nextLine();
                    Buku bukuBaru = new Buku(judul, pengarang, tahun, jenis);
                    BukuService.tambahDataBuku(bukuBaru);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}
