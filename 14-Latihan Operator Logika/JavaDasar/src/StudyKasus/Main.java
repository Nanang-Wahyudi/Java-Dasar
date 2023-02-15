package StudyKasus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);

    // Membuat Program Tebak Angka
        int AngkaBenar = 22;
        int AngkaTebakan;
        boolean StatusTebakan;

        System.out.println();
        System.out.println("    -----------------------");
        System.out.println("         Tebakan Angka     ");
        System.out.println("    -----------------------");

        System.out.println();
        System.out.println();
        System.out.print(" Masukan Angka Tebakan : ");
        AngkaTebakan = UserInput.nextInt();
        System.out.println(" Angka Tebakan Anda    : " + AngkaTebakan);
        // Operasi Logika
        System.out.println();
        System.out.println("-------------------------");
        StatusTebakan = ( AngkaTebakan == AngkaBenar );
        System.out.println(" Status Tebakan        : " + StatusTebakan);

        System.out.println();
        System.out.println();
        System.out.println("    -----------------------");
        System.out.println("        Selamat Bermain    ");
        System.out.println("         Terima Kasih      ");
        System.out.println("    -----------------------");


    }

}
