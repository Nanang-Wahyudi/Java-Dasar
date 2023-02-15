package JavaDasar_Tutorial;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

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
                    System.out.println("------------------------------\n");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n----------------------");
                    System.out.println(" CARI DATA MAHASISWA ");
                    System.out.println("----------------------");
                    cariData();
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

    public static void cariData() throws IOException {
        // Cek Database Ada Atau Tidak
        try {
            File file = new File("Database.txt");
        } catch (Exception ex) {
            System.err.println(" Database Tidak Ditemukan !!! ");
            System.err.println(" Silahkan Masukan Data Terlebih Dahulu !!! ");
            return;
        }

        // Ambil Keyword Dara User
        Scanner userInput = new Scanner(System.in);
        System.out.print("\n Masukan Keywords : ");
        String cari = userInput.nextLine();
        String[] keywords = cari.split("\\s+");

        // Cek Keyword Di Database
        cekDataDiDatabase(keywords);
    }

    private static void cekDataDiDatabase(String[] keywords) throws IOException {
        FileReader fileReader = new FileReader("Database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String data = bufferedReader.readLine();
        boolean jikaAda;
        int nomorData = 0;

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("|  No  | \t  Nama Lengkap\t         | Jenjang Studi |    \tProgram Studi\t      |");
        System.out.println("---------------------------------------------------------------------------------------");

        while (data != null) {
            // Cek Keyword Di Dalam Baris Database
            jikaAda = true;

            for (String keyword : keywords) {
                jikaAda = jikaAda && data.toLowerCase().contains(keyword.toLowerCase());
            }

            // Jika Keyword-nya Cocok Maka Tampilkan
            if (jikaAda) {
                nomorData++;
                StringTokenizer stringTokenizer = new StringTokenizer(data, ";");

                System.out.printf("| %2d   |", nomorData);
                System.out.printf(" %-25s\t |", stringTokenizer.nextToken());
                System.out.printf(" %7s\t |", stringTokenizer.nextToken());
                System.out.printf(" %-25s  |", stringTokenizer.nextToken());
                System.out.println();
            }

            data = bufferedReader.readLine();
        }

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
    }

    private static void tampilkanData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("Database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception ex) {
            System.err.println(" Database Tidak Ditemukan !!! ");
            System.err.println(" Silahkan Masukan Data Terlebih Dahulu !!! ");
            return;
        }

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("|  No  | \t  Nama Lengkap\t         | Jenjang Studi |    \tProgram Studi\t      |");
        System.out.println("---------------------------------------------------------------------------------------");

        String data = bufferInput.readLine();
        int nomorData = 0;

        while (data != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(data, ";");
            nomorData++;

            System.out.printf("| %2d   |", nomorData);
            System.out.printf(" %-25s\t |", stringTokenizer.nextToken());
            System.out.printf(" %7s\t |", stringTokenizer.nextToken());
            System.out.printf(" %-25s  |", stringTokenizer.nextToken());
            System.out.println();

            data = bufferInput.readLine();
        }

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
    }

    private static boolean getYesOrNo(String pesan) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(" \n " + pesan + " [y/n] ??? ");
        String pilihanUser = userInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("\n Pilihan Anda Bukan [y/n] !!! ");
            System.out.print(" \n " + pesan + " [y/n] ??? ");
            pilihanUser = userInput.next();
        }

        System.out.println();
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
