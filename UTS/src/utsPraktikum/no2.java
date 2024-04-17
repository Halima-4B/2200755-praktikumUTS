/* Tulis sebuah program yang membaca sejumlah bilangan bulat yang tidak ditentukan,
menentukan berapa banyak nilai positif dan negatif yang telah dibaca, dan menghitung
total dan rata-rata nilai input (tidak termasuk nol). Program Anda diakhiri dengan
input 0. Tampilkan rata-rata sebagai angka floating-point. Berikut adalah contoh
running programnya */

package utsPraktikum;

import java.util.Scanner;

public class no2{
    public static void main(String[] args){
        Scanner bil = new Scanner(System.in);

        int bilangan;
        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        int total = 0;
        int jumlahInput = 0;

        System.out.println("Masukkan sejumlah bilangan bulat (akhiri dengan input 0): ");

        while (true){
            bilangan = bil.nextInt();

            // Keluar dari loop jika input adalah 0
            if (bilangan == 0){
                break;
            }
            
            jumlahInput++;

            // Menambahkan nilai ke total (jika bukan 0)
            if (bilangan != 0){
                total += bilangan;
            }

            // Menghitung jumlah bilangan positif dan negatif
            if (bilangan > 0){
                jumlahPositif++;
            } else if (bilangan < 0){
                jumlahNegatif++;
            }
        }

        // Menghitung rata-rata (jika jumlah input tidak 0)
        double rataRata = (jumlahInput != 0) ? (double) total / jumlahInput : 0.0;

        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata-rata " + rataRata);

        bil.close();
    }
}