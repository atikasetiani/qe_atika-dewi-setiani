/*
 * SECTION 6 - BASIC PROGRAMMING & OOP
 * Introduction Basic Programming
 * Praktikum Soal Prioritas 1 nomor 1
 */
package basicp.prioritas1_1;

public class BasicPrioritas1_1 {
   public static void main(String[] args) {
       // segitiga
       float alas = 20;
       float tinggi = 25;

       // hitung luas segitiga
       float luasSegitiga = (alas * tinggi) / 2;
       System.out.println("Luas segitiga adalah : " + luasSegitiga);

       // persegi panjang
       float panjang = 40;
       float lebar = 6;

       // hitung luas persegi panjang
       float luasPersegiPanjang = panjang * lebar;
       System.out.println("Luas persegi panjang adalah : " + luasPersegiPanjang);

       // lingkaran
       double jari2 = 7;

       // hitung luas lingkaran
       double luasLingkaran = 3.14 * Math.pow(jari2, 2);
       System.out.println("Luas lingkaran adalah: " + luasLingkaran);
   }
}

