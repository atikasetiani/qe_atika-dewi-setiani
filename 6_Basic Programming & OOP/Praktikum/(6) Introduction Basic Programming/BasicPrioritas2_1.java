/*
 * SECTION 6 - BASIC PROGRAMMING & OOP
 * Introduction Basic Programming
 * Praktikum Soal Prioritas 2 nomor 1
 */
package basicp.prioritas2_1;

class BasicPrioritas2_1 {
    public static void drawXYZ(int n) {
        char[][] pattern = new char[n][n];
        int x = 0, y = 0;

        for (int i = 1; i <= n * n; i++) {
            if (i % 2 == 1) {
                pattern[x][y] = 'Y';
            } else if (i % 2 == 0) {
                pattern[x][y] = 'Z';
            }

            if (i % 3 == 0) {
                pattern[x][y] = 'X';
            }

            if (y == n - 1) {
                x++;
                y = 0;
            } else {
                y++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j] + " ");
            }
                System.out.println();
        }
    }

    public static void main(String[] args) {
        drawXYZ(5);
    }
}


