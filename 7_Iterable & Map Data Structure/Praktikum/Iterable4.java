/*
 * SECTION 7 - ITERABLE & MAP DATA STRUCTURE
 * Praktikum Soal Nomor 4
 */
package iterable4;

import java.util.ArrayList;
import java.util.Arrays;

public class Iterable4 {
    public static void main(String[] args) {
        //Sample Test Cases 1
        int[] arr1_1 = {1, 2, 3, 4};
        int[] arr1_2 = {1, 3, 5, 10, 16};
        int[] hasil = nilaiUnik(arr1_1, arr1_2);
        System.out.print("Output Sample Test Cases 1 : ");
        System.out.println(Arrays.toString(hasil));
        
        //Sample Test Cases 2
        int[] arr2_1 = {3, 8};
        int[] arr2_2 = {2, 8};
        hasil = nilaiUnik(arr2_1, arr2_2);
        System.out.print("Output Sample Test Cases 2 : ");
        System.out.println(Arrays.toString(hasil));
    }

    public static int[] nilaiUnik(int[] arr1, int[] arr2) {
        ArrayList<Integer> unik = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            boolean Duplicate = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    Duplicate = true;
                    break;
                }
            }
            if (!Duplicate) {
                unik.add(arr1[i]);
            }
        }
        int[] hasil = new int[unik.size()];
        for (int i = 0; i < unik.size(); i++) {
            hasil[i] = unik.get(i);
        }
        return hasil;
    }
}
