package LatihanArray;

public class Latihan3 {
    public static void main(String[] args) {
     int max = 0;
     int[] data = new int[] {-21,90,82,190,-83,74};
        System.out.println("Data pada array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]+"\t");
            if(data[i] > max){
                max = data [i];
            }
            
        }
        System.out.println("\n Data terbesar dari array adalah " + max);
    }
}
