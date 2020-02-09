package PraktikumArray;

import java.util.Scanner;

public class praktikum1 {

    public static void main(String[] args) {
        int[] bilangan = {74, 98, 72, 74, 72, 90, 81, 72};
        int a = 0;
        int cari;

        Scanner input = new Scanner(System.in);
        System.out.println("Data pada array: ");
        System.out.println("\t" + 74
                + "\t" + 98
                + "\t" + 72
                + "\t" + 74
                + "\t" + 72
                + "\t" + 90
                + "\t" + 81
                + "\t" + 72);
        System.out.print("Masukkan nilai yang dicari: ");
        cari = input.nextInt();

        for (int i = 0; i < bilangan.length; i++) {
            if (cari == bilangan[i]) {
                a++;
            }
        }
        System.out.println("Data yang dicari ditemukan sebanyak " + a + " kali");
    }
}
