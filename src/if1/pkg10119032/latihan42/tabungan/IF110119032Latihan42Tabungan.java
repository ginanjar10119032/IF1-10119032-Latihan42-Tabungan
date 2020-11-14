package if1.pkg10119032.latihan42.tabungan;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan tabungan 
 * dengan pendekatan berorientasi objek
 */

public class IF110119032Latihan42Tabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal : ");
        Tabungan tabungan1 = new Tabungan(input.nextInt());
        
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda Sekarang : " + tabungan1.ambilUang(input.nextInt()));
    }
}