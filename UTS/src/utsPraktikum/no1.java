/* Tulis program dalam bahasa Java yang secara acak menghasilkan bilangan bulat antara
1 dan 12 dan menampilkan nama bulan bahasa Indonesia Januari, Februari, ...,
Desember untuk nomor 1, 2, ..., 12, yang sesuai. */

package utsPraktikum;

import java.util.Random;

public class no1{
    public static void main(String[] args){
        String[] namaBulan ={
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        // Objek untuk menghasilkan bilangan acak
        Random angka = new Random();
        
        // Menghasilkan bilangan bulat acak antara 1 dan 12
        int nomorBulan = angka.nextInt(12) + 1;
        
        System.out.println("Bulan ke-" + (nomorBulan + 1) + " adalah " + namaBulan[nomorBulan]);
    }
}