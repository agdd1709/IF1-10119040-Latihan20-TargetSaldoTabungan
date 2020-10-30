/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan20.targetsaldotabungan;

/**
 *
 * @author Acer
 * Nama     : Agus Deri Dermawan
 * Kelas    : IF1
 * NIM      : 10119040
 * Program membuat perrhitungan untuk mencapai target saldo
 */
public class IF110119040Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldoTarget, bunga, saldo, saldoAwal, saldoAkhir;
        saldoAwal = 3500000;
        bunga = 8;
        saldoAkhir = 0;
        saldoTarget = 6000000;
        
        for (int i = 1; saldoAkhir <= saldoTarget; i++){
            saldo = saldoAwal * bunga / 100;
            saldoAkhir = saldo + saldoAwal;
            System.out.printf("Saldo di bulan ke-"+ i + " Rp.%,1.0f%n ", + saldoAkhir);
            saldoAwal += saldo;
            
        }
    }
    
}
