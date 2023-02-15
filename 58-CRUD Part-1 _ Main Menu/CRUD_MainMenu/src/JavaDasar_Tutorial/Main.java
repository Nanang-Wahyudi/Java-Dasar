package JavaDasar_Tutorial;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner userInput = new Scanner(System.in);
        String pilihanUser;
        boolean lanjutkan = true;

        while (lanjutkan) {
            clearScreen();

            System.out.println("\n\n---------------------");
            System.out.println(" DATABASE MAHASISWA ");
            System.out.println("---------------------");

            System.out.println(" 1 . Lihat Seluruh Data Mahasiswa ");
            System.out.println(" 2 . Cari Data Mahasiswa ");
            System.out.println(" 3 . Tambah Data Mahasiswa ");
            System.out.println(" 4 . Edit Data Mahasiswa ");
            System.out.println(" 5 . Hapus Data Mahasiswa ");

            System.out.print(" \n Masukan Pilihan Anda : ");
            pilihanUser = userInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n------------------------------");
                    System.out.println(" LIST SELURUH DATA MAHASISWA ");
                    System.out.println("------------------------------");

                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n----------------------");
                    System.out.println(" CARI DATA MAHASISWA ");
                    System.out.println("----------------------");
                    break;
                case "3":
                    System.out.println("\n------------------------");
                    System.out.println(" TAMBAH DATA MAHASISWA ");
                    System.out.println("------------------------");
                    break;
                case "4":
                    System.out.println("\n----------------------");
                    System.out.println(" EDIT DATA MAHASISWA ");
                    System.out.println("----------------------");
                    break;
                case "5":
                    System.out.println("\n-----------------------");
                    System.out.println(" HAPUS DATA MAHASISWA ");
                    System.out.println("-----------------------");
                    break;
                default:
                    System.err.println(" \n Input Anda Tidak Ditemukan !!! \n Silahkan Pilih [1 - 5] ");
            }

            lanjutkan = getYesOrNo("Apakah Anda Ingin Melanjutkan");
        }

    }

    private static void tampilkanData() throws IOException {
        System.out.println(" Menu List Seluruh Data Mahasiswa ");

        boolean tambah = getYesOrNo("Apakah Anda Ingin Menambah Data");
    }

    private static boolean getYesOrNo(String pesan) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(" \n " + pesan + " [y/n] ??? ");
        String pilihanUser = userInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println(" Pilihan Anda Bukan [y/n] !!! ");
            System.out.print(" \n " + pesan + " [y/n] ??? ");
            pilihanUser = userInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println(" Tidak Bisa Clear Screen !!! ");
        }
    }

}
