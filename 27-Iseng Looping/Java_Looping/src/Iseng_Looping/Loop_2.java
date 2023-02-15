package Iseng_Looping;

import java.util.Scanner;

public class Loop_2 {

    public static void main(String[] args) {

        // Program Mencari Nilai Terbesar Dengan While Loop

        Scanner userInput = new Scanner(System.in);
        int jumlahBilangan, bilanganKe, bilanganTerbesar, bilangan[] = new int[100];
        boolean kondisi;

        System.out.println();
        System.out.print(" Masukan Jumlah Bilangan  : ");
        jumlahBilangan = userInput.nextInt();
        System.out.println("----------------------------");
        System.out.println();

        kondisi = true;
        bilanganKe = 1;
        bilanganTerbesar = 0;

        while (kondisi) {

            System.out.print(" Bilangan Ke - " + bilanganKe + "  : ");
            bilangan[bilanganKe] = userInput.nextInt();

            if (bilanganKe == jumlahBilangan) {
                kondisi = false;
            }
            bilanganKe++;

        }


        System.out.println();
        for (bilanganKe = 1; bilanganKe <= jumlahBilangan; bilanganKe++) {

            if (bilangan[bilanganKe] > bilanganTerbesar) {
                bilanganTerbesar = bilangan[bilanganKe];
            }

        }
        System.out.println("----------------------------");
        System.out.println(" Bilangan Terbesar        : " + bilanganTerbesar);



    }

}
