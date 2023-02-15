package JavaTutorial;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);
        int nilai, nilaiFibonacci;

        System.out.println();
        System.out.print(" Masukan Nilai n  : ");
        nilai = userInput.nextInt();
        System.out.println("----------------------");

        System.out.println();
        nilaiFibonacci = fibonacci(nilai, "atas");
        System.out.println();
        System.out.println(" Nilai Fibonacci Ke - " + nilai + " Adalah " + nilaiFibonacci);
        System.out.println("----------------------------------");
    }

    public static int fibonacci (int n, String cabang) {
        System.out.println(" Cabang " + cabang);
        System.out.println(" Fibonacci Ke - " + n);
        System.out.println("-------------------");
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }



}
