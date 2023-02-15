package DeretFibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int fn, fn_1, fn_2, n;

        System.out.println();
        System.out.print(" Nilai  : ");
        n = userInput.nextInt();
        System.out.println("----------");

        fn = 1;
        fn_1 = 1;
        fn_2 = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println(fn);

            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;

        }



    }

}
