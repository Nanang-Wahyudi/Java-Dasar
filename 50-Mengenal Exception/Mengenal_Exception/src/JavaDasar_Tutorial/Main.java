package JavaDasar_Tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        int[] dataArray = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;

        System.out.print(" \n Nilai Array Ke - : ");
        int index = userInput.nextInt();


        // Exception Handling (Try,Catch,Finally)
        System.out.println(" \n Heandling Out Of Bound ");
        System.out.println("---------------------------");
        try {
            System.out.printf(" Index Ke - %d = %d \n ",index,dataArray[index]);
        } catch (IndexOutOfBoundsException ex) {
            System.err.println(ex);
        }


        // Runtime Error Jika File Tidak Ada
        System.out.println(" \n Heandling IO Not Found ");
        System.out.println("---------------------------");
        try {
            fileInput = new FileInputStream("Index.html");
        } catch (IOException ex) {
            System.err.println(ex);
        }


        // Menggabungkan Dua Exception
        System.out.println(" \n Menggabungkan Dua Exception ");
        System.out.println("--------------------------------");
        try {
            System.out.printf(" Index Ke - %d = %d \n ",index,dataArray[index]);
            fileInput = new FileInputStream("Index.html");
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Index Yang Anda Masukan Tidak Sesuai Dengan Jumlah Array");
        } catch (IOException ex) {
            System.err.println("File Tidak Ditemukan");
        }


        // Menambahkan Finally
        System.out.println(" \n Menambahkan Finally ");
        System.out.println("------------------------");
        try {
            System.out.printf(" Index Ke - %d = %d \n ",index,dataArray[index]);
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Index Yang Anda Masukan Tidak Sesuai Dengan Jumlah Array");
        } finally {
            System.out.println(" \n Finally ");
            System.out.println("-----");
        }


        System.out.println(" \n\n Akhir Program ");
        System.out.println("--------------------");
    }
}
