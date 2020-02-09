package LatihanArray;

import java.util.Scanner;

public class Latihan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String find;
        System.out.println("Input something: ");
        find = input.nextLine();
        
        int a = 0;
        for (int i = 0; i < find.length(); i++) {
            if (find.charAt(i) == 'a'){
             a++;   
            }
        }
        System.out.println("Jumlah huruf a adalah "+ a);
    }
}
