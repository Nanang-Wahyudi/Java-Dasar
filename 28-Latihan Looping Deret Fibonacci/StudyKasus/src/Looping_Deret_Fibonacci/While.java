package Looping_Deret_Fibonacci;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        // Membuat Looping Deret Fibonacci

        Scanner userInput = new Scanner(System.in);
        int fn, fn_1, fn_2, n, i;

        System.out.println();
        System.out.println(" Nilai Fibonacci Ke - : ");
        n = userInput.nextInt();
        System.out.println("--------------------------");

        fn = 1;
        fn_1 = 1;
        fn_2 = 0;
        i = 0;

        while (i <= n) {

            System.out.println(" Nilai Ke - " + i + " = " + fn);

            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;

            i++;

        }



    }

}
