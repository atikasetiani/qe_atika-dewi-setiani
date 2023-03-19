/*
 * SECTION 7 - ITERABLE & MAP DATA STRUCTURE
 * Praktikum Soal Nomor 2
 */
package iterable2;

import java.util.ArrayList;
import java.util.List;

public class Iterable2 {

    public static void main(String[] args) {
        //Sample Test Cases 1
        String input = "76523752";
        List<Character> nomorUnik = temukanNomorUnik(input);
        System.out.print("Output Sample Test Cases 1 : ");
        System.out.println(nomorUnik); 

        //Sample Test Cases 2
        input = "1122";
        nomorUnik = temukanNomorUnik(input);
        System.out.print("Output Sample Test Cases 2 : ");
        System.out.println(nomorUnik); 
    }

    public static List<Character> temukanNomorUnik(String input) {
        List<Character> nomorUnik = new ArrayList<>();
        for (int n = 0; n < input.length(); n++) {
            char angka = input.charAt(n);
            boolean isUnique = true;
            for (int m = 0; m < input.length(); m++) {
                if (n != m && angka == input.charAt(m)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                nomorUnik.add(angka);
            }
        }
        return nomorUnik;
    }
}

