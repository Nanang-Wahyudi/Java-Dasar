package StudyKasus;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        // Membuat Program Penjumlahan Angka Dengan Rentang Nilai Menggunakan For Looping

        Scanner userInput = new Scanner(System.in);
        int nilaiAwal, nilaiAkhir, total;

        System.out.println();
        System.out.print(" Masukan Nilai Awal   : ");
        nilaiAwal = userInput.nextInt();

        System.out.print(" Masukan Nilai Akhir  : ");
        nilaiAkhir = userInput.nextInt();
        System.out.println("------------------------");


        if (nilaiAwal >= nilaiAkhir) {

            System.out.println();
            System.out.println(" Program Tidak Bisa Dijalankan ");
            System.out.println(" Ket : Nilai Awal <= Nilai Akhir ");
            System.out.println("---------------------------------");

        } else {

            for (total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
                total = nilaiAwal + total;
                System.out.println(" Ditambah " + nilaiAwal + " Menjadi " + total);
            }

        }




    }

}
