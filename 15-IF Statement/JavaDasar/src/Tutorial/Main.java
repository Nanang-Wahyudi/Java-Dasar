package Tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);

    // IF Statement (Percabangan)
        int a;

        System.out.println();
        System.out.print(" Masukan Nilai  : ");
        a = UserInput.nextInt();

        System.out.println("----------------");
        System.out.println(" Nilai Anda     : " + a);

        if ( a >= 70 ) {
            System.out.println(" Keterangan     : LULUS" );
        } else {
            System.out.println(" Keterangan     : TIDAK LULUS ");
        }




    }

}
