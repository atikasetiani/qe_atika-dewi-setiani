/*
 * SECTION 7 - ITERABLE & MAP DATA STRUCTURE
 * Praktikum Soal Nomor 3
 */
package iterable3;

import java.util.HashMap;

public class Iterable3 {
    
    public static void main(String[] args) {
        //Sample Test Cases 1
        int[] nomor = {1, 2, 3, 4, 6};
        int target = 6;
        int[] pasangan = temukanPasangan(nomor, target);
        System.out.print("Output Sample Test Cases 1 : ");
        System.out.println("[" + pasangan[0] + ", " + pasangan[1] + "]");
        System.out.println("Penjelasan: Bilangan pada indeks " + pasangan[0] + " dan " + pasangan[1] + 
                " dijumlahkan menjadi " + target + " --> " + nomor[pasangan[0]] + " + " + nomor[pasangan[1]] + " = " + target);
        
        //Sample Test Cases 2
        nomor = new int[] {2, 5, 9, 11};
        target = 11;
        pasangan = temukanPasangan(nomor, target);
        System.out.println(" ");
        System.out.print("Output Sample Test Cases 2 : ");
        System.out.println("[" + pasangan[0] + ", " + pasangan[1] + "]");
        System.out.println("Penjelasan: Bilangan pada indeks " + pasangan[0] + " dan " + pasangan[1] + 
                " dijumlahkan menjadi " + target + " --> " + nomor[pasangan[0]] + " + " + nomor[pasangan[1]] + " = " + target);
    }
    
    public static int[] temukanPasangan(int[] nomor, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nomor.length; i++) {
            int complement = target - nomor[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nomor[i], i);
        }
        return new int[] {};
    } 
}
