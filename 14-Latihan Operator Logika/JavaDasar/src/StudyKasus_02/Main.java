package StudyKasus_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);

    // Membuat program menebak nilai antara 20-50
        int NilaiTebakan;
        boolean StatusTebakan;

        System.out.println();
        System.out.println("    ------------------------------");
        System.out.println("         Tebak Rentang Nilai      ");
        System.out.println("    ------------------------------");

        System.out.println();
        System.out.println();
        System.out.print(" Masukan Angka Tebakan : ");
        NilaiTebakan = UserInput.nextInt();

        // Operasi aljabar boolean (AND / OR);
        System.out.println();
        System.out.println("----------------------");
        System.out.println(" Tebakan Anda         : " + NilaiTebakan);
        StatusTebakan = (NilaiTebakan >= 20) && (NilaiTebakan <= 50);
        System.out.println(" Status Tebakan       : " + StatusTebakan);
        System.out.println("----------------------");

        System.out.println();
        System.out.println();
        System.out.println("    ------------------------------");
        System.out.println("            Selamat Bermain       ");
        System.out.println("             Terima Kasih         ");
        System.out.println("    ------------------------------");


    }

}
