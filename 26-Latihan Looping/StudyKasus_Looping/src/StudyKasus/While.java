package StudyKasus;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        // Membuat Program Penjumlahan Angka Dengan Rentang Nilai Menggunakan While Loop

        Scanner userInput = new Scanner(System.in);
        int nilaiAwal, nilaiAkhir, total;

        System.out.println();
        System.out.print(" Masukan Nilai Awal   : ");
        nilaiAwal = userInput.nextInt();

        System.out.print(" Masukan Nilai Akhir  : ");
        nilaiAkhir = userInput.nextInt();
        System.out.println("------------------------");

        total = 0;

        if (nilaiAwal >= nilaiAkhir) {

            System.out.println();
            System.out.println(" Program Tidak Bisa Dijalankan!!! ");
            System.out.println(" Ket : Nilai Awal <= Nilai Akhir ");
            System.out.println("----------------------------------");

        } else {

            while (nilaiAwal <= nilaiAkhir) {
                total = nilaiAwal + total;
                System.out.println(" Ditambah " + nilaiAwal + " Menjadi " + total);

                nilaiAwal++;
            }

        }








    }

}
