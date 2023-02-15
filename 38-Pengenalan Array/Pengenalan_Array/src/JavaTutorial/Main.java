package JavaTutorial;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        // Assignment
        // TipeData[] NamaArray = { Komponen-Komponen };
        System.out.println();
        System.out.println("Assignment Array");
        System.out.println("-----------------");
        int[] arrayInteger = {1,2,3,4};

        // Merubah Isi Array
        arrayInteger[2] = 12;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);


        // Deklarasi
        // TipeData[] NamaArray = new TipeData[JumlahArray];
        System.out.println();
        System.out.println("Deklarasi Array");
        System.out.println("----------------");
        float[] arrayFloat = new float[4];

        // memasukan Isi Array
        arrayFloat[2] = 12.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);


        // Helper Class
        // Merupakan Class Yang Sudah Disediakan Oleh Java
        // Dapat Digunakan Dengan Menambahkan Dokumentasi import java.util.Arrays;
        System.out.println();
        System.out.println("Helper Class");
        System.out.println("-------------");
        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));





    }

}
