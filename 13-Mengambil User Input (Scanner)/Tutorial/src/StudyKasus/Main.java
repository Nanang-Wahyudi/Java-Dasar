package StudyKasus;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        double GajiPokok, Tunjangan, Pajak, GajiBersih;
        String nama, id;

        DecimalFormat KursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols FormatRp = new DecimalFormatSymbols();
        FormatRp.setCurrencySymbol(" Rp. ");
        FormatRp.setMonetaryDecimalSeparator(',');
        FormatRp.setMonetaryGroupingSeparator('.');


        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("|                Sistem Hitung Gaji               |");
        System.out.println("|       Kementerian Komunikasi Dan Informatika    |");
        System.out.println("|            Kota Serang Provinsi Banten          |");
        System.out.println("---------------------------------------------------");

        // Input Identitas Karyawan
        System.out.println();
        System.out.println();
        System.out.println("------------ Identitas Karyawan -----------");
        System.out.print(" Masukan Nama Karyawan : ");
        nama = UserInput.nextLine();

        System.out.print(" Masukan ID Karyawan   : ");
        id = UserInput.nextLine();

        // Perhitungan Gaji
        System.out.println();
        System.out.println("------------ Mulai Menghitung -------------");
        System.out.print(" Masukan Gaji Pokok    :  Rp. ");
        GajiPokok = UserInput.nextDouble();

        Tunjangan = GajiPokok * 20/100;
        KursIndo.setDecimalFormatSymbols(FormatRp);
        System.out.printf(" Besar Tunjangan       : %s %n ", KursIndo.format(Tunjangan));

        Pajak = (Tunjangan + GajiPokok) * 10/100;
        KursIndo.setDecimalFormatSymbols(FormatRp);
        System.out.printf("Besar Pajak           : %s %n ", KursIndo.format(Pajak));

        System.out.println();
        System.out.println("-------------------------------------------");
        GajiBersih = GajiPokok + Tunjangan - Pajak;
        KursIndo.setDecimalFormatSymbols(FormatRp);
        System.out.printf(" Gaji Bersih           : %s %n ", KursIndo.format(GajiBersih));
        System.out.println("-----------------------");

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("|                  Terima Kasih                   |");
        System.out.println("|     Kami Akan Terus Mengembangkan Sistem Ini    |");
        System.out.println("---------------------------------------------------");



    }

}
