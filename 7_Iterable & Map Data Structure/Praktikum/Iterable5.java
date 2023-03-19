/*
 * SECTION 7 - ITERABLE & MAP DATA STRUCTURE
 * Praktikum Soal Nomor 5
 */
package iterable5;

import java.util.Arrays;

public class Iterable5 {
    
    public static void main(String[] args) {
        //Sample Test Case 1
        int[] nomor = {2, 3, 3, 3, 6, 9, 9};
        int n = hapusDuplikat(nomor);
        System.out.print("Output Sample Test Cases 1 : ");
        System.out.println(n);
        System.out.print("Penjelasan : Dua elemen pertama setelah menghilangkan duplikatnya adalah ");
        System.out.println(Arrays.toString(Arrays.copyOfRange(nomor, 0, n)));

        //Sample Test Case 2
        nomor = new int[] {2, 2, 2, 11};
        n = hapusDuplikat(nomor);
        System.out.println(" ");
        System.out.print("Output Sample Test Cases 2 : ");
        System.out.println(n);
        System.out.print("Penjelasan : Dua elemen pertama setelah menghilangkan duplikatnya adalah ");
        System.out.println(Arrays.toString(Arrays.copyOfRange(nomor, 0, n)));
    }
    
    public static int hapusDuplikat(int[] nomor) {
        int i = 0;
        for (int j = 1; j < nomor.length; j++) {
            if (nomor[j] != nomor[i]) {
                i++;
                nomor[i] = nomor[j];
            }
        }
        return i + 1;
    }   
}

