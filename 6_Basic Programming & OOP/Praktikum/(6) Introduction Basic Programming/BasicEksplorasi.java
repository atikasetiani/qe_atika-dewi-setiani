/*
 * SECTION 6 - BASIC PROGRAMMING & OOP
 * Introduction Basic Programming
 * Praktikum Soal Eksplorasi
 */
package basicp.eksplorasi;

public class BasicEksplorasi {
    private static String encrypt(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 10);
                if (c > 'Z') {
                    c = (char) (c - 26);
                }
                ch[i] = c;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }
}

