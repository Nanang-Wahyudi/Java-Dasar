package SwitchCase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);
        float hasil = 0, a = 1, b = 1;
        char operator;


        while (a != 0 & b != 0){

            System.out.println();
            System.out.print(" Masukan Nilai a   : ");
            a = UserInput.nextFloat();

            System.out.print(" Pilih Operator    : ");
            operator = UserInput.next().charAt(0);

            System.out.print(" Masukan Nilai b   : ");
            b = UserInput.nextFloat();

            switch (operator){

                case '+' :
                    System.out.println("-----------------------");
                    hasil = a + b;
                    System.out.printf("   %.0f + %.0f = %.0f \n", a, b, hasil);
                    System.out.println("-----------------------");
                    break;

                case '-' :
                    System.out.println("-----------------------");
                    hasil = a - b;
                    System.out.printf("   %.0f - %.0f = %.2f \n", a, b, hasil);
                    System.out.println("-----------------------");
                    break;

                case 'x' :
                    System.out.println("-----------------------");
                    hasil = a * b;
                    System.out.printf("   %.0f x %.0f = %.0f \n", a, b, hasil);
                    System.out.println("-----------------------");
                    break;

                case ':' :
                    if (b == 0) {

                        System.out.println("-------------------------");
                        System.out.println(" Hasil Tidak Terdefinisi ");
                        System.out.println("-------------------------");

                    } else {

                        System.out.println("-----------------------");
                        hasil = a / b;
                        System.out.printf("   %.0f : %.0f = %f \n", a, b, hasil);
                        System.out.println("-----------------------");

                    }
                    break;
                default:
                    System.out.println("--------------------------");
                    System.out.println(" Operator Tidak Ditemukan");
                    System.out.println("--------------------------");

            }

        }



    }
}
