package Iseng_Looping;

import java.util.Scanner;

public class Loop_4 {

    public static void main(String[] args) {

        int a, b, hasil, ulang;
        Scanner userInput = new Scanner(System.in);

        System.out.println();
        System.out.print(" Masukan Nilai a  : ");
        a = userInput.nextInt();

        System.out.print(" Masukan Nilai b  : ");
        b = userInput.nextInt();

        hasil = 0;
        ulang = 1;

        do {
            hasil = hasil + a;

            ulang++;
        } while (ulang <= b);

        System.out.println("----------------------");
        System.out.printf(" %d x %d = %d ", a, b, hasil);
        System.out.println();







    }

}
