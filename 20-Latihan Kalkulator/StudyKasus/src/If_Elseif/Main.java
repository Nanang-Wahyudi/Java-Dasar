package If_Elseif;

import java.util.Scanner;

public class Main {

    static float hasil = 0, a = 1, b = 1;
    static char operator;

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);

        while(a != 0 & b != 0) {

            System.out.println();
            System.out.print(" Masukan Nilai a = ");
            a = UserInput.nextInt();
            System.out.print(" Pilih Operator  = ");
            operator = UserInput.next().charAt(0);
            System.out.print(" Masukan Nilai b = ");
            b = UserInput.nextInt();

            System.out.println("---------------------------");
            if (operator == '+') {

                hasil = (a + b);
                System.out.printf("     %.0f + %.0f = %.0f \n", a, b, hasil);
                System.out.println("---------------------------");
                System.out.println();

            } else if (operator == '-') {

                hasil = (a - b);
                System.out.printf("     %.0f - %.0f = %.2f \n", a, b, hasil);
                System.out.println("---------------------------");
                System.out.println();

            } else if (operator == 'x') {

                hasil = (a * b);
                System.out.printf("     %.0f x %.0f = %.0f \n", a, b, hasil);
                System.out.println("---------------------------");
                System.out.println();

            } else if (operator == ':') {

                if (b == 0) {

                    System.out.println("  Hasil Tidak Terdifinisi ");
                    System.out.println("---------------------------");
                    System.out.println();

                } else {

                    hasil = (a / b);
                    System.out.printf("     %.0f : %.0f = %f \n", a, b, hasil);
                    System.out.println("---------------------------");
                    System.out.println();

                }

            } else {

                System.out.println(" Operator Tidak Ditemukan ");
                System.out.println("---------------------------");

            }


        }



    }

}
