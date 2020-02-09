package LatihanArray;

import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        int find;
        boolean found = false;
        int[] data = new int[]{8, 90, 56, 90, 87, 76, 42};
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan data yang ingin dicari: ");
        find = input.nextInt();
        for (int i = 0; i < data.length; i++) {
            if (find == data[i]) {
                found = true;
                System.out.println("Data ditemukan pada indeks ke- " + i);

            }
        }
            if (found != true) {
            System.out.println("Data tidak ditemukan");
        }
    }
}
