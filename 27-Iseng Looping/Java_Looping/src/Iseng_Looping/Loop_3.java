package Iseng_Looping;

import java.util.Scanner;

public class Loop_3 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int bilangan;
        boolean kondisi;

        System.out.println();
        System.out.print(" Masukan Bilangan  : ");
        bilangan = userInput.nextInt();
        System.out.println("-----------------------");

        kondisi = true;

        do {

            if (bilangan % 2 == 0) {
                bilangan = bilangan / 2;
            } else {
                bilangan = bilangan * 3 + 1;
            }

            if (bilangan == 1) {
                kondisi = false;
            }

            System.out.print(bilangan + " - ");
        } while (kondisi);

        System.out.println();



    }

}
