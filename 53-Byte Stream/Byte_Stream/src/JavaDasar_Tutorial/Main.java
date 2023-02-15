package JavaDasar_Tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main (String[] ags) throws IOException {

        FileInputStream fileInput = null;
        FileOutputStream fileOut = null;

        // Menampilkan File Dengan Looping
        System.out.println(" \nMenampilkan File Dengan Looping ");
        System.out.println("-----------------------");

        // Membuka File
        fileInput = new FileInputStream("Input.txt");

        // Membaca & Menampilkan File
        int data = fileInput.read();

        while (data != -1) {
            System.out.print((char) data);
            data = fileInput.read();
        }
        System.out.println();

        // Menutup File
        fileInput.close();


        // Menampilkan & Membuat File Dengan Try,Catch,Finally
        // Jika Sudah Menggunakan Throws Maka Tidak Perlu Menggunakan Catch

        // Menampilkan File Dengan Try,Catch,Finally
        System.out.println(" \n\nMenampilkan File Dengan Try,Catch,Finally ");
        System.out.println("------------------------------");

        try {
            // Membuka File
            fileInput = new FileInputStream("Input2.txt");

            // Membaca & Menampilkan File
            int data2 = fileInput.read();

            while (data2 != -1) {
                System.out.print((char) data2);
                data2 = fileInput.read();
            }

        } finally {
            // Menutup File
            if (fileInput != null) {
                fileInput.close();
            }
        }
        System.out.println();


        // Membuat File Baru Dengan Try,Catch,Finally
        System.out.println(" \n\nMembuat File Baru Dengan Try,Catch,Finally ");
        System.out.println("------------------------");

        try {
            // Membuka File
            fileInput = new FileInputStream("Input.txt");
            fileOut = new FileOutputStream("Output.txt");

            // Membaca & Menampilkan File
            int data3 = fileInput.read();

            while (data3 != -1) {
                fileOut.write(data3);
                data3 = fileInput.read();
            }

        } finally {

            // Menutup File
            if (fileInput != null) {
                fileInput.close();
            }
            if (fileOut != null) {
                fileInput.close();
            }
        }


        // Menampilkan Dan Membuat File Dengan Try With Resource
        // Menampilkan File Dengan Try With Resource
        System.out.println("\n\nMenampilkan File Dengan Try With Resource ");
        System.out.println("-----------------------");

        try (FileInputStream fileIn = new FileInputStream("Input.txt")) {
            int data4 = fileIn.read();

            while (data4 != -1 ) {
                System.out.print((char) data4);
                data4 = fileIn.read();
            }

            System.out.println();
        }

        // Membuat File Baru Dengan Try With Resource
        System.out.println(" \n\nMembuat File Baru Dengan Try With Resource ");
        System.out.println("------------------------");

        try (
                FileInputStream fileIn = new FileInputStream("Input2.txt");
                FileOutputStream fileOutput = new FileOutputStream("Output2.txt")
                ) {

            int data5 = fileIn.read();

            while (data5 != -1) {
                fileOutput.write(data5);
                data5 = fileIn.read();
            }
        }



    }
}
