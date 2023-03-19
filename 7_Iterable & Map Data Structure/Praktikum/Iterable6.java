/*
 * SECTION 7 - ITERABLE & MAP DATA STRUCTURE
 * Praktikum Soal Nomor 6
 */
package iterable6;

import java.io.PrintStream;
import java.util.Arrays;

public class Iterable6 {
    public static void main(String[] args) {
        //Sample Test Cases 1
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        int maxSum1 = maxSumSubarray(arr1, k1);
        System.out.println("Output Sample Test Cases 1 : " + maxSum1);

        //Sample Test Cases 2
        int[] arr2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        int maxSum2 = maxSumSubarray(arr2, k2);
        System.out.println("Output Sample Test Cases 2 : " + maxSum2);
    }
    
    public static int maxSumSubarray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
