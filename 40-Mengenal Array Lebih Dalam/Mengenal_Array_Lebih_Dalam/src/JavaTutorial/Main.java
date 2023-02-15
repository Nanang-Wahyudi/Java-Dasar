package JavaTutorial;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];
        int[] arrayAngka3 = {1,2,3,4,5};

        // Memori-Nya Berbeda
        System.out.println();
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        System.out.println(arrayAngka3);

        arrayAngka2 = arrayAngka1;
        // Memori-Nya Sama Setelah arrayAngka2 = arrayAngka1
        System.out.println();
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        System.out.println(arrayAngka3);

        System.out.println();
        System.out.println(" Angka 1 --> " + Arrays.toString(arrayAngka1));
        System.out.println(" Angka 2 --> " + Arrays.toString(arrayAngka2));
        System.out.println(" Angka 3 --> " + Arrays.toString(arrayAngka3));

        // Jika Ada Perubahan Pada Data Array Di Salah Satu Array, Maka Array Yang Memorinya Sama Akan Ikut Berubah
        arrayAngka1[0] = 10;
        arrayAngka2[4] = 50;
        arrayAngka3[2] = 30;
        System.out.println();
        System.out.println(" Angka 1 --> " + Arrays.toString(arrayAngka1));
        System.out.println(" Angka 2 --> " + Arrays.toString(arrayAngka2));
        System.out.println(" Angka 3 --> " + Arrays.toString(arrayAngka3));

        ubahArray(arrayAngka1);
        System.out.println();
        System.out.println(" Angka 1 --> " + Arrays.toString(arrayAngka1));
        System.out.println(" Angka 2 --> " + Arrays.toString(arrayAngka2));
        System.out.println(" Angka 3 --> " + Arrays.toString(arrayAngka3));

    }

    // Method Yang Argument-Nya Adalah Reference Biasanya Disebut Pass By Reference (Referensi Bukan Nilai Aslinya)

    // Sedangkan Method Yang Parameter-Nya Bukan Array Biasanya Disebut Pass By Value (Nilai Aslinya)
    private static void ubahArray(int dataArray[]) {
        dataArray[0] = 100;
    }

}
