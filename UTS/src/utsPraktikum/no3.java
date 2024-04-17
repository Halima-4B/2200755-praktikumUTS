/* (Jumlah digit dalam bilangan bulat) Tulis metode yang menghitung jumlah digit dalam
bilangan bulat. Gunakan tajuk metode berikut :
public static int sumDigits(long n) */

package utsPraktikum;

import java.util.Scanner;

public class no3{
    public static int sumDigits(long n){
        int sum = 0;
        
        // Loop untuk mengekstrak dan menjumlahkan setiap digit
        while (n != 0){
            // Mengekstrak digit terakhir
            int digit = (int) (n % 10);
            // Menambahkan digit ke jumlah
            sum += digit;
            // Menghapus digit terakhir
            n /= 10;
        }
        
        return sum;
    }

    public static void main(String[] args){
        
        Scanner bilangan = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        long number = bilangan.nextLong();

        // Memanggil metode sumDigits untuk menghitung jumlah digit
        int result = sumDigits(number);

        // Menampilkan jumlah digit
        System.out.println("Jumlah digit dalam bilangan adalah " + result);

        bilangan.close();
    }
}