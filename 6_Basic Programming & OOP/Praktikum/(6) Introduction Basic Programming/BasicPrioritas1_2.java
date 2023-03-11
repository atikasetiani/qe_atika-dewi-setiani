/*
 * SECTION 6 - BASIC PROGRAMMING & OOP
 * Introduction Basic Programming
 * Praktikum Soal Prioritas 1 nomor 2
   1. Sampel 1
      a. Input: harga beli = 15000, harga jual = 30000
      b. Output: Untung sebesar: 15000
   2. Sampel 2
      a. Input: harga beli = 12000, harga jual = 9000
      b. Output: Rugi sebesar: -3000
   3. Sampel 3
      a. Input: harga beli = 12000, harga jual = 12000
      b. Output: Sama saja
 */
package basicp.prioritas1_2;
import java.util.Scanner;

public class BasicPrioritas1_2 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       for (int i = 1; i <= 3; i++) {
           System.out.println("Sampel " + i);
           System.out.print("Masukkan Harga Beli = ");
           double hargaBeli = input.nextDouble();

           System.out.print("Masukkan Harga Jual = ");
           double hargaJual = input.nextDouble();

           int keuntungan = (int) (hargaJual - hargaBeli);
           if (keuntungan > 0) {
               System.out.println("Untung sebesar : " + keuntungan);
           } else if (keuntungan < 0) {
               System.out.println("Rugi sebesar : " + keuntungan);
           } else {
               System.out.println("Sama saja");
           }
           System.out.println(" ");
       }
   }
}

