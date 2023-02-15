package Kasus_SDA;

import java.util.Scanner;

public class Sequential_2 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int[] arr = new int[100];
        int x, arrIndex, posisi;

        // Baca Elemen Array arr
        System.out.println();
        for (arrIndex = 1; arrIndex <= 5; arrIndex++) {
            System.out.print(" Masukan Angka Index Ke - " + arrIndex + " : ");
            arr[arrIndex] = userInput.nextInt();
        }
        System.out.println("--------------------------------");

        // Baca Elemen x
        System.out.println();
        System.out.print(" Masukan Angka Yang Dicari  : ");
        x = userInput.nextInt();
        System.out.println("--------------------------------");

        // Mencari x Dalam arr
        arrIndex = 1;
        while (arrIndex <= 5 && x != arr[arrIndex]) {
            arrIndex = arrIndex + 1;
        }

        // Menetapkan Hasil
        posisi = 0;
        if (x == arr[arrIndex]) {
            posisi = arrIndex;
        }

        System.out.println();
        System.out.println(" Posisi = Index Ke - " + posisi);
        System.out.println("-----------------------");



    }

}
