package JavaDasar;

import javax.swing.text.Style;
import java.text.Format;

public class Main {

    public static void main(String[] args) {

    // Operator Bitwise --> Operator untuk melakukan operasi pada nilai bit

        byte a,b,c;
        String a_bit, b_bit, c_bit;

    // Operator Shift Left (<<)
        // Operator ini berfungsi untuk menggeser nilai byte kearah kiri
        System.out.println();
        System.out.println("--------- SHIFT LEFT ---------");
        a = 3;
        a_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf(" %s = %d \n", a_bit, a);

        b = (byte) (a << 2);
        // b --> Maksudnya akan menggeser hasil dari byte a = 3, sebanyak 2 kali kekiri
        b_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf(" %s = %d \n", b_bit, b);


    // Operator Shift Right (>>)
        // Operator ini berfungsi untuk menggeser nilai byte kearah kanan
        System.out.println("--------- SHIFT RIGHT ---------");
        a = 24;
        a_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf(" %s = %d \n", a_bit, a);

        b = (byte) (a >> 3);
        // b --> Maksudnya akan menggeser hasil dari byte a = 24, sebanyak 3 kali kekanan
        b_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf(" %s = %d \n", b_bit, b);


    // Operator Bitwise OR
        // Operator ini akan mengeksekusi hasil dari dua byte dan akan di konversikan ke dalam OR
        System.out.println();
        System.out.println("--------- BITWISE OR (|) ---------");
        a = 24;
        a_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf(" %s = %d \n", a_bit, a);

        b = 12;
        b_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf(" %s = %d \n", b_bit, b);

        // Setelah dikonversi ke OR
        System.out.println("----------------");
        c = (byte) (a | b);
        c_bit = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf(" %s = %d \n", c_bit, c);


    // Operator Bitwise AND
        // Operator ini akan mengeksekusi hasil dari dua byte dan akan dikonversikan kedalam AND
        System.out.println();
        System.out.println("--------- BITWISE AND (&) ---------");
        a = 24;
        a_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf(" %s = %d \n", a_bit, a);

        b = 12;
        b_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf(" %s = %d \n", b_bit, b);

        // Setelah dikonversi ke AND
        System.out.println("----------------");
        c = (byte) (a & b);
        c_bit = String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf(" %s = %d \n", c_bit, c);


    // Operator Bitwise XOR
        // Operator ini akan mengeksekusi hasil dari dua byte dan akan dikonversikan kedalam XOR
        System.out.println();
        System.out.println("--------- BITWISE XOR (^) ---------");
        a = 24;
        a_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf(" %s = %d \n", a_bit, a);

        b = 12;
        b_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf(" %s = %d \n", b_bit, b);

        // Setelah dikonversi ke XOR
        System.out.println("----------------");
        c = (byte) (a ^ b);
        c_bit = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf(" %s = %d \n", c_bit, c);


    // Operasi Bitwise NOT / Negasi (~)
        // Operasi ini akan mengeksekusi hasil dari sebuah byte dan akan dikonversikan kedalam NOT
        System.out.println();
        System.out.println("--------- BITWISE NOT (~) ---------");
        a = 24;
        a_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf(" %s = %d \n", a_bit, a);

        // Setelah dikonversi ke NOT
        System.out.println("----------------");
        b = (byte) (~a);
        b_bit = String.format("%8s",Integer.toBinaryString(b).substring(24));
        System.out.printf(" %s = %d \n", b_bit, b);



    }

}
