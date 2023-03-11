/*
 * SECTION 6 - BASIC PROGRAMMING & OOP
 * Object Oriented Programming
 * Praktikum Soal Prioritas 1
 * Class Main
 */
package OOPPriotitas1;

public class Main {
    public static void main(String[] args) {
        Product coffee = new Product("coffee", "this is coffee", 15000, 10);
        Product milk = new Product("milk", "this is fresh milk", 25000, 10);
        Product appleJuice = new Product("apple juice", "this is juice", 18000, 20);
        
        coffee.getInfo();
        milk.getInfo();
        appleJuice.getInfo();
    }
}



