package JavaTutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int inputPanjang, inputLebar;

        System.out.println();
        System.out.print(" Masukan Panjang : ");
        inputPanjang = userInput.nextInt();
        System.out.print(" Masukan Lebar   : ");
        inputLebar = userInput.nextInt();
        System.out.println("-----------------------");

        System.out.println();
        gambar(inputPanjang, inputLebar);

        System.out.println();
        System.out.println("-------------------");
        System.out.println(" Luas       = " + luas(inputPanjang, inputLebar));
        System.out.println(" Keliling   = " + keliling(inputPanjang, inputLebar));
    }


    private static void gambar(int panjang, int lebar) {
        for (int x = 0; x < lebar; x++) {
            for (int y = 0; y < panjang; y++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static int luas(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil;
    }

    private static int keliling(int panjang, int lebar) {
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }



}
