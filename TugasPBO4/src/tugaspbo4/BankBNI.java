/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo4;

/**
 *
 * @author ASUS
 */
public class BankBNI extends Bank {
     @Override
    void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah 4%");
    }
    
    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " di bank BNI");
    }

    @Override
    double hitungBiayaTransfer(int jumlah) {
        // Misalkan biaya transfer BNI adalah 1% dari jumlah transfer
        return jumlah * 0.01;
    }
}