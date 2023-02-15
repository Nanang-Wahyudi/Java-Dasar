package JavaDasar_Tutorial;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {

        FileInputStream inputFile = new FileInputStream("Input.txt");

        System.out.println();
        System.out.println((char) inputFile.read());
        System.out.println((char) inputFile.read());
        System.out.println((char) inputFile.read());
        System.out.println((char) inputFile.read());
        System.out.println((char) inputFile.read());

    }
}
