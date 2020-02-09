package PraktikumArray;

import java.util.Scanner;

public class praktikum4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, i, u, e, o;
        a = 0;
        i = 0;
        u = 0;
        e = 0;
        o = 0;
        String xy, kata = new String();

        System.out.print("Masukkan kalimat atau kata: ");
        xy = input.nextLine();
        char tchar[] = new char[xy.length()];
        kata = xy.toLowerCase();
        for (int j = 0; j < tchar.length; j++) {
            if (kata.charAt(j) == 'a') {
                a++;
            }
            if (kata.charAt(j) == 'i') {
                i++;
            }
            if (kata.charAt(j) == 'u') {
                u++;
            }
            if (kata.charAt(j) == 'e') {
                e++;
            }
            if (kata.charAt(j) == 'o') {
                o++;
            }
        }
        System.out.println("Jumlah huruf a: " + a);
        System.out.println("Jumlah huruf i: " + i);
        System.out.println("Jumlah huruf u: " + u);
        System.out.println("Jumlah huruf e: " + e);
        System.out.println("Jumlah huruf o: " + o);
        System.out.println("Total semua huruf vokal: " + (a + i + u + e + o));
    }
}
