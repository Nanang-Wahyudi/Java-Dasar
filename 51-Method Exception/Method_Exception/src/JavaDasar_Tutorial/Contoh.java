package JavaDasar_Tutorial;

import java.io.FileInputStream;

public class Contoh {

    public static void main (String[] args) throws Exception {

        FileInputStream fileInput = new FileInputStream("Index.txt");
        System.out.println(" \n " + (char) fileInput.read());

        System.out.println(" \n Akhir Program ");

    }
}
