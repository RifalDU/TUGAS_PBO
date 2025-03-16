/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo4;

/**
 *
 * @author ASUS
 */
public class Main {
     public static void main(String[] args) {
        Bank bankUmum = new Bank();
        BankBNI bankBNI = new BankBNI();
        BankBCA bankBCA = new BankBCA();

        System.out.println("\n--- Method Overloading ---");
        bankUmum.transferUang(550000, "9124812472");
        bankUmum.transferUang(100000, "14204825421", "Mandiri");
        bankUmum.transferUang(850000, "125126775", "BRI", "Pembayaran Langganan Netflix");

        System.out.println("\n--- Method Overriding ---");
        bankBNI.sukuBunga();
        bankBCA.sukuBunga();

        System.out.println("\n--- Menguji Transfer dengan Overriding ---");
        bankBNI.transferUang(450000, "968242142", "BNI");
        bankBCA.transferUang(900000, "927412642", "BCA");

        System.out.println("\n--- Menghitung Biaya Transfer ---");
        double biayaBNI = bankBNI.hitungBiayaTransfer(450000);
        System.out.println("Biaya transfer BNI: " + biayaBNI);
        
        double biayaBCA = bankBCA.hitungBiayaTransfer(900000);
        System.out.println("Biaya transfer BCA: " + biayaBCA);
    }
}

