package JavaTutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int nilai;

        System.out.println();
        System.out.print(" Masukan Nilai  : ");
        nilai = userInput.nextInt();

        System.out.println();
        printNilai(nilai);

        System.out.println();
        System.out.println(" Jumlah Nilai  = " + jumlahNilai(nilai));

        System.out.println();
        System.out.println(" Faktorial  = " + hitungFaktorial(nilai));
    }

    private static void printNilai(int parameter) {
        System.out.println(" Parameter  : " + parameter);

        if (parameter == 0) {
            return;
        }
        parameter--;

        printNilai(parameter);
    }

    private static int jumlahNilai(int parameter) {
        System.out.println(" Nilai  : " + parameter);

        if (parameter == 0) {
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }

    private static int hitungFaktorial(int parameter) {
        System.out.println(" Nilai : " + parameter);

        if (parameter == 1) {
            return parameter;
        }

        return parameter * hitungFaktorial(parameter - 1);
    }



}
