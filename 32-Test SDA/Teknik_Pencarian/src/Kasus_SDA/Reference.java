package Kasus_SDA;

import java.util.Scanner;

public class Reference {

    public static void main(String[] args) {

        // Modifikasi Referensi Google

        Scanner userInput = new Scanner(System.in);
        int[] arr = new int[100];
        int arrIndex, i, cari;

        System.out.println();
        System.out.print(" Masukan Jumlah Array : ");
        arrIndex = userInput.nextInt();
        System.out.println("--------------------------");

        System.out.println();
        // Simpan Setiap Angka Yang Diinput Kedalam Array
        for (i = 0; i < arrIndex; i++) {
            System.out.print(" Masukan Angka Index Ke - " + i + " : ");
            arr[i] = userInput.nextInt();
        }
        System.out.println("--------------------------------");

        System.out.println();
        System.out.print(" Masukan Angka Yang Dicari  : ");
        cari = userInput.nextInt();
        System.out.println("--------------------------------");

        System.out.println();
        // Proses Pencarian Array
        for (i = 0; i < arrIndex; i++) {
            if (arr[i] == cari) {
                System.out.println(" Angka " + cari + " Ditemukan Pada Index Ke - " + i);
                System.out.println("-------------------------------------");
                break;
            }
        }

        if (i == arrIndex) {
            System.out.println(" Angka " + cari + " Tidak Ditemukan Dalam Array ");
            System.out.println("-------------------------------------");
        }



    }

}
