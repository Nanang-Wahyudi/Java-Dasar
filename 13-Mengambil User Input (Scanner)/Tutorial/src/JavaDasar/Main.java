package JavaDasar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // Cara Membuat User Input (Scanner) Di Java
        Scanner UserInput = new Scanner(System.in);
        String nama, prodi;

    // Form Input Data
        System.out.println();
        System.out.println("-------------------- Input Data -------------------");
        System.out.print(" Masukan Nama Lengkap  : ");
        nama = UserInput.nextLine();
        System.out.print(" Masukan Program Studi : ");
        prodi = UserInput.nextLine();

    // Form Output Data
        System.out.println();
        System.out.println("-------------------- Output Data -------------------");
        System.out.println(" Nama Lengkap  : " + nama);
        System.out.println(" Program Studi : " + prodi);


    }

}
