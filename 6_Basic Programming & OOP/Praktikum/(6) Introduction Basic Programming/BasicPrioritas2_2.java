/*
 * SECTION 6 - BASIC PROGRAMMING & OOP
 * Introduction Basic Programming
 * Praktikum Soal Prioritas 2 nomor 2
 */
package basicp.prioritas2_2;

class BasicPrioritas2_2 {
    public static void printAsterisk(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printAsterisk(5);
    }
}

