package Looping_Deret_Fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        // Membuat Looping Deret Fibonacci

        Scanner userInput = new Scanner(System.in);

        int fn, fn_1, fn_2, n;

        System.out.println();
        System.out.print(" Nilai Fibonacci ke - : ");
        n = userInput.nextInt();
        System.out.println("------------------------");

        fn = 1;
        fn_1 = 1;
        fn_2 = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println(" Nilai Ke - " + i + " = " + fn);

            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;

        }


    }

}
