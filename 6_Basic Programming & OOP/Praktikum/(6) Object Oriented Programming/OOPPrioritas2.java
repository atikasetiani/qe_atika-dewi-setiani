/*
 * SECTION 6 - BASIC PROGRAMMING & OOP
 * Object Oriented Programming
 * Praktikum Soal Prioritas 2
 */
package oop.prioritas2;

public class OOPPrioritas2 {
    
    // fungsi penjumlahan
    public static int add(int a, int b) {
        return a + b;
    }

    // fungsi pengurangan
    public static int subtract(int a, int b) {
        return a - b;
    }

    // fungsi perkalian
    public static int multiply(int a, int b) {
        return a * b;
    }

    // fungsi pembagian
    public static int divide(int a, int b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        
        // memanggil fungsi penjumlahan
        int result1 = add(3, 4);
        System.out.println("Penjumlahan: " + result1);

        // memanggil fungsi pengurangan
        int result2 = subtract(15, 4);
        System.out.println("Pengurangan: " + result2);

        // memanggil fungsi perkalian
        int result3 = multiply(10, 10);
        System.out.println("Perkalian: " + result3);

        // memanggil fungsi pembagian
        int result4 = divide(12, 3);
        System.out.println("Pembagian: " + result4);
    }
}

