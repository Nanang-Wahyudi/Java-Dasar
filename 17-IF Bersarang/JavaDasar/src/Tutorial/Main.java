package Tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);

    // Tutorial IF Bersarang

        int PilihanProduk, PilihanJenisProduk;

        System.out.println();
        System.out.println(" Merek Pilihan ");
        System.out.println("---------------");
        System.out.println("  1. Laptop    ");
        System.out.println("  2. Handphone ");
        System.out.println("---------------");

        System.out.println();
        System.out.print(" Masukan Angka Pilihan Produk : ");
        PilihanProduk = UserInput.nextInt();
        System.out.println();

    // Awal IF Pilihan Produk
        if (PilihanProduk == 1) {

            System.out.println("         Laptop ");
            System.out.println("      -------------");
            System.out.println("       1. Asus");
            System.out.println("       2. Acer");
            System.out.println("       3. Lenovo");
            System.out.println("      -------------");
            System.out.println();
            System.out.print(" Masukan Pilihan Jenis Laptop : ");
            PilihanJenisProduk = UserInput.nextInt();
            System.out.println();

            // Awal IF Bersarang Pilihan Jenis Laptop
                if (PilihanJenisProduk == 1) {

                    System.out.println("------------------------------");
                    System.out.println("    Merek  : Asus ");
                    System.out.println("    Harga  : Rp. 5.000.000");
                    System.out.println("------------------------------");

                } else if (PilihanJenisProduk == 2) {

                    System.out.println("------------------------------");
                    System.out.println("    Merek  : Acer ");
                    System.out.println("    Harga  : Rp. 6.000.000");
                    System.out.println("------------------------------");

                } else if (PilihanJenisProduk == 3) {

                    System.out.println("------------------------------");
                    System.out.println("    Merek  : Lenovo ");
                    System.out.println("    Harga  : Rp. 7.000.000");
                    System.out.println("------------------------------");

                } else {

                    System.out.println(" ------------------------ ");
                    System.out.println("   Pilihan Produk Salah ");
                    System.out.println(" ------------------------ ");

                }
            // Akhir IF Bersarang Pilihan Jenis Laptop


        } else if (PilihanProduk == 2) {

            System.out.println("         Handphone ");
            System.out.println("      ---------------");
            System.out.println("       1. Oppo");
            System.out.println("       2. Vivo");
            System.out.println("       3. Xiaomi");
            System.out.println("      ---------------");
            System.out.println();
            System.out.print(" Masukan Pilihan Jenis Handphone : ");
            PilihanJenisProduk = UserInput.nextInt();
            System.out.println();

            // Awal IF Bersarang Pilihan Jenis Handphone
                if (PilihanJenisProduk == 1) {

                    System.out.println("------------------------------");
                    System.out.println("    Merek  : Oppo ");
                    System.out.println("    Harga  : Rp. 3.000.000");
                    System.out.println("------------------------------");

                } else if (PilihanJenisProduk == 2) {

                    System.out.println("------------------------------");
                    System.out.println("    Merek  : Vivo ");
                    System.out.println("    Harga  : Rp. 4.000.000");
                    System.out.println("------------------------------");

                } else if (PilihanJenisProduk == 3) {

                    System.out.println("------------------------------");
                    System.out.println("    Merek  : Xiaomi ");
                    System.out.println("    Harga  : Rp. 5.000.000");
                    System.out.println("------------------------------");

                } else {

                    System.out.println(" ------------------------ ");
                    System.out.println("   Pilihan Produk Salah ");
                    System.out.println(" ------------------------ ");

                }
            // Akhir IF Bersarang Pilihan Jenis Handphone

        } else {

            System.out.println(" ------------------------ ");
            System.out.println("   Pilihan Produk Salah ");
            System.out.println(" ------------------------ ");

        }
    // Akhir IF Pilihan Produk





    }

}
