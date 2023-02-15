package Java_Tutorial;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        // Membuat Array 2D Dengan Assignment
        System.out.println();
        System.out.println(" Membuat Array 2D Dengan Assignment ");
        System.out.println("------------------------------------");
        int[][] array2D = {
                {1,2,3,4},
                {5,6,7,8}
        };
        printArray2D(array2D);

        // Membuat Array 2D Dengan Deklarasi
        System.out.println();
        System.out.println(" Membuat Array 2D Dengan Deklarasi ");
        System.out.println("-----------------------------------");
        int[][] array2D_2 = new int[3][4];
        printArray2D(array2D_2);

        // Penggunaan Looping Pada Array 2D
        System.out.println();
        System.out.println(" Penggunaan Looping Pada Array 2D ");
        System.out.println("----------------------------------");
        loopArray2D(array2D);
        System.out.println();
        loopArray2D(array2D_2);
        System.out.println("-------------------");

        System.out.println();
        loopArray2D_2(array2D);
        System.out.println();
        loopArray2D_2(array2D_2);
        System.out.println("-------------------");

        System.out.println();
        foreachArray2D(array2D);
        System.out.println();
        foreachArray2D(array2D_2);
        System.out.println("-------------------");

        // Dijava Kita Bisa Membuat Array Dengan Jumlah Kolom Yang Berbeda
        System.out.println();
        int[][] arrayRagged = {
                {1,2,3,4},
                {1,2,3},
                {1,2},
                {1}
        };
        loopArray2D(arrayRagged);

    }

    private static void foreachArray2D (int[][] dataArray) {
        for (int[] baris : dataArray) {
            System.out.print(" { ");
            for (int angka : baris) {
                System.out.print(angka + ", ");
            }
            System.out.print("} \n");
        }
    }
    private static void loopArray2D_2 (int[][] dataArray) {
        for (int b = 0; b < dataArray.length; b++) {
            System.out.print(" { ");
            for (int k = 0; k < dataArray[b].length; k++) {
                System.out.print(dataArray[b][k] + ", ");
            }
            System.out.print("} \n");
        }
    }
    private static void loopArray2D (int[][] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(" " + Arrays.toString(dataArray[i]));
        }
    }
    private static void printArray2D (int[][] dataArray) {
        System.out.println(" " + Arrays.deepToString(dataArray));
    }

}
