package PraktikumArray;

public class praktikum3 {

    public static void main(String[] args) {
        int array[] = new int[]{92, 98, 76, 72, 84, 101, 39};
        int angka = 0;
        System.out.println("Nilai pada array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");

        }
        System.out.println("\n");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 3 == 0) {
                System.out.println("Nilai yang merupakan kelipatan tiga: " + array[j]);
            }
        }
    }
}
