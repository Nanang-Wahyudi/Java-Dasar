package JavaDasar_Tutorial;

import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        // Membuka File

        // Byte Stream      --> FileInputStream, FileOutputStream
        // Character Stream --> FileReader, FileWriter

        FileInputStream byteFileInput = new FileInputStream("Input.txt");
        FileReader charFileInput      = new FileReader("Input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("OutputByte.txt");
        FileWriter charFileOutput       = new FileWriter("OutputChar.txt");


        // Membaca & Menampilkan File

        // Byte File
        int buffer = byteFileInput.read();
        System.out.println();

        while(buffer != -1){
            System.out.print((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }
        System.out.println();

        // Char File
        buffer = charFileInput.read();

        while(buffer != -1){
            System.out.print((char)buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }
        System.out.println();


        // Menutup File

        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();

    }
}
