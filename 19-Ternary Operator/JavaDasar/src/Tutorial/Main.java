package Tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);

    // Tutorial Ternary Operator
        // Variabel x = Syarat ? Aksi_true : Aksi_false
        // Maksudnya jika nilai input yang dimasukan bernilai true, maka akan dijalankan Aksi_true. Sebaliknya jika nilai input yang dimasukan bernilai false, maka akan dijalankan Aksi_false .

        int input, x;

        System.out.println();
        System.out.print(" Masukan Nilai x   = ");
        input = UserInput.nextInt();

        System.out.println("---------------------");
        x = ( input == 10 ) ? ( input * input ) : (  input / 2 );
        System.out.println("         Nilai x   = " + x);








    }

}
