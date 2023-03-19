/*
 * SECTION 7 - ITERABLE & MAP DATA STRUCTURE
 * Praktikum Soal Nomor 1
 */
package iterable1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Iterable1 {
    public static void main(String[] args) {
        //Sample Test Cases 1
        String[] arr1_1 = {"kazuya", "jin", "lee"};
        String[] arr1_2 = {"kazuya", "feng"};
        String[] merged1 = mergeArray1(arr1_1, arr1_2);
        System.out.print("Output Sample Test Cases 1 : ");
        System.out.println(Arrays.toString(merged1));
        
        //Sample Test Cases 2
        String[] arr2_1 = {"lee", "jin"};
        String[] arr2_2 = {"kazuya", "panda"};
        String[] merged2 = mergeArray2(arr2_1, arr2_2);
        System.out.print("Output Sample Test Cases 2 : ");
        System.out.println(Arrays.toString(merged2));
    }
    
    public static String[] mergeArray1(String[] arr1_1, String[] arr1_2) {
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(arr1_1));
        set1.addAll(Arrays.asList(arr1_2));
        String[] merged1 = set1.toArray(new String[0]);
        
        return merged1;
    }
    
    public static String[] mergeArray2(String[] arr2_1, String[] arr2_2) {
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(arr2_1));
        set2.addAll(Arrays.asList(arr2_2));
        String[] merged2 = set2.toArray(new String[0]);
        
        return merged2;
    }
}
