package Kasus_SDA;

import java.util.Scanner;

public class Sentinal {

    public static void main (String[] args) {

        // Matode Pencarian Sentinal

        Scanner userInput = new Scanner(System.in);
        int m = 5;
        int[] arr = new int[100];
        int x, arrIndex;

        // Baca Elemen Array arr
        System.out.println();
        for (arrIndex = 1; arrIndex <= m; arrIndex++) {
            System.out.print(" Masukan Angka Index Ke - " + arrIndex + " : ");
            arr[arrIndex] = userInput.nextInt();
        }

        // Baca Elemen x
        System.out.println();
        System.out.print(" Masukan Angka Yang Dicari  : ");
        x = userInput.nextInt();

        // Menambahkan Sentinel
        arr[m + 1] = x;

        // Mulai Pencarian
        arrIndex = 1;
        while (x != arr[arrIndex]) {
            arrIndex = arrIndex + 1;
        }

        // Menetapkan Hasil
        System.out.println();
        if (arrIndex < m + 1) {
            System.out.println(" Angka " + x + " Ditemukan Pada Index Ke - " + arrIndex);
        } else {
            System.out.println(" Angka " + x + " Tidak Ditemukan Dalam Array ");
        }




    }

}
