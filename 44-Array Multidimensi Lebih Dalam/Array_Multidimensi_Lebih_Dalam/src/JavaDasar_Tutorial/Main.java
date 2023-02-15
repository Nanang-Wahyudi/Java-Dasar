package JavaDasar_Tutorial;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        // Pembuktian Mengapa Array 2D Di Java Bisa Dimasukan Komponen Array Dengan Jumlah Berbeda-beda
        // --> Karena Setiap Array Dan Komponen Array Pada Java Mempunyai Address-nya Masing-Masing

        // Contoh 1
        int[][] arrayInt_2D = {
                {1,2,3},
                {1,2}
        };

        System.out.println();
        System.out.println(Arrays.deepToString(arrayInt_2D));
        System.out.println(arrayInt_2D);
        System.out.println(Arrays.toString(arrayInt_2D));
        System.out.println(arrayInt_2D[0]);
        System.out.println(arrayInt_2D[1]);


        // Contoh 2
        char[] arrayChar1 = {'A','B','C'};
        char[] arrayChar2 = {'A','B'};

        char[][] arrayChar_2D = {
                arrayChar1,
                arrayChar2
        };

        System.out.println();
        System.out.println(Arrays.deepToString(arrayChar_2D));
        System.out.println(arrayChar_2D);
        System.out.println(Arrays.toString(arrayChar_2D));
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar1)));
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar2)));

    }
}
