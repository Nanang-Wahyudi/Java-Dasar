package Tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);

    // IF Else if Statement
        int a;

        System.out.println();
        System.out.print(" Masukan Nilai Mahasiswa : ");
        a = UserInput.nextInt();

        System.out.println("--------------------------");
        System.out.println("     Nilai Mahasiswa   : " + a);

        if ( a >= 90 ) {

            System.out.println("          Keterangan   : A ");
            System.out.println("            Predikat   : Sangat Baik ");

        } else if ( a >= 80) {

            System.out.println("          Keterangan   : B ");
            System.out.println("            Predikat   : Baik ");

        }  else if ( a >= 70) {

            System.out.println("          Keterangan   : C ");
            System.out.println("            Predikat   : Cukup ");

        } else {

            System.out.println("          Keterangan   : REMEDIAL ");

        }




    }

}
