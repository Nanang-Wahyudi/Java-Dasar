package JavaTutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayKe1 = {1,2,3,4,5};

        // Merubah Array Menjadi String
        System.out.println("\n * MERUBAH ARRAY MENJADI STRING");
        System.out.println("-------------------------------");
        printArray(arrayKe1);

        // Meng-Copy Array
        System.out.println("\n * MENG-COPY ARRAY");
        System.out.println("------------------");
        int[] arrayKe2 = new int[5];
        System.out.println(" " + arrayKe1);
        System.out.println(" " + arrayKe2);
        printArray(arrayKe1);
        printArray(arrayKe2);

        // Meng-Copy Array Dengan Looping
        System.out.println(" \n Meng-Copy Array Dengan Looping ");
        System.out.println("--------------------------------");
        for (int i = 0; i < arrayKe1.length; i++) {
            arrayKe2[i] = arrayKe1[i];
        }
        System.out.println(" " + arrayKe1);
        System.out.println(" " + arrayKe2);
        printArray(arrayKe1);
        printArray(arrayKe2);

        // Meng-Copy Array Dengan CopyOf
        System.out.println(" \n Meng-Copy Array Dengan CopyOf ");
        System.out.println("-------------------------------");
        int[] arrayKe3 = Arrays.copyOf(arrayKe1,5);
        int[] arrayKe4 = Arrays.copyOf(arrayKe3,3);
        System.out.println(" " + arrayKe1);
        System.out.println(" " + arrayKe3);
        System.out.println(" " + arrayKe4);
        printArray(arrayKe1);
        printArray(arrayKe3);
        printArray(arrayKe4);

        // Meng-Copy Array Dengan CopyOfRange
        System.out.println(" \n Meng-Copy Array Dengan CopyOfRange ");
        System.out.println("------------------------------------");
        int[] arrayKe5 = Arrays.copyOfRange(arrayKe1,2,5);
        System.out.println(" " + arrayKe1);
        System.out.println(" " + arrayKe5);
        printArray(arrayKe1);
        printArray(arrayKe5);

        // Fill Array
        System.out.println(" \n * FILL ARRAY ");
        System.out.println("-----------------");
        int[] arrayKe6 = new int[7];
        System.out.println(" " + arrayKe6);
        printArray(arrayKe6);
        Arrays.fill(arrayKe6,2);
        System.out.println(" " + arrayKe6);
        printArray(arrayKe6);

        // Komparasi Array
        System.out.println(" \n * KOMPARASI ARRAY ");
        System.out.println("----------------------");
        int[] arrayKe7 = {1,2,3,4,5};
        int[] arrayKe8 = {1,2,3,4,5};
        // Jika Kita Komparasi Menggunakan IF Biasa
        printArray(arrayKe7);
        printArray(arrayKe8);
        if (arrayKe7 == arrayKe8){
            System.out.println(" Kedua Array Sama ");
        } else {
            System.out.println(" Kedua Array Berbeda ");
        }

        // Komparasi Array Dengan Equal (Membandingkan Dua Buah Array)
        System.out.println(" \n Komparasi Array Dengan Equal ");
        System.out.println("------------------------------");
        printArray(arrayKe7);
        printArray(arrayKe8);
        System.out.println(" " + Arrays.equals(arrayKe7,arrayKe8));
        // Kombinasi Equal Dan if
        if (Arrays.equals(arrayKe7,arrayKe8)){
            System.out.println(" Kedua Array Sama ");
        } else {
            System.out.println(" Kedua Array Berbeda ");
        }

        // Komparasi Array Dengan Compare (Mencari Index Array Yang Terbesar)
        // Jika arrayKe7 == arrayKe8 --> 0
        // Jika arrayKe7 > arrayKe8 --> 1
        // Jika arrayKe7 < arrayKe8 --> -1
        System.out.println(" \n Komparasi Array Dengan Compare ");
        System.out.println("-----------------------------------");
        printArray(arrayKe7);
        printArray(arrayKe8);
        System.out.println(" " + Arrays.compare(arrayKe7,arrayKe8));

        // Sort Array
        System.out.println(" \n * SORT ARRAY ");
        System.out.println("-----------------");
        int[] arrayKe9 = {1,4,5,8,9,5,8,2,10,3,10,6,7};
        printArray(arrayKe9);
        Arrays.sort(arrayKe9);
        printArray(arrayKe9);

        // Search Array
        System.out.println(" \n * SEARCH ARRAY ");
        System.out.println("-------------------");
        printArray(arrayKe9);
        int cariAngka = 2;
        int posisiAngka = Arrays.binarySearch(arrayKe9,cariAngka);
        System.out.println(" Angka " + cariAngka + " Ada Pada Index Ke - " + posisiAngka);

    }

    private static void printArray(int[] dataArray) {
        System.out.println(" Array = " + Arrays.toString(dataArray));
    }

}
