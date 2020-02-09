package LatihanArray;

import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {
        String cari;
        boolean found = false;
        String[] data = new String[]{"a", "i", "u", "e", "o"};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari: ");
        cari = input.nextLine();
        for (String String : data) {
            if (cari.equals(String)) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Data founded");
        } else {
            System.out.println("Access Denied");
        }
    }
}
