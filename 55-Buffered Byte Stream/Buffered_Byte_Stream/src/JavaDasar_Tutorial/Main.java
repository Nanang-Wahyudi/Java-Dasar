package JavaDasar_Tutorial;

import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        long waktuStart, waktuFinish;

        // Membaca Dari FIle
        System.out.println(" \nMembaca Dari File ");
        System.out.println("------------------");

        FileInputStream byteInput = new FileInputStream("Input.txt");
        System.out.println(byteInput.available());

        // Menghitung Waktu Pembacaan Dari File
        System.out.println(" \nMenghitung Waktu Pembacaan Dari File ");
        System.out.println("-------------------------------------");

        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("Waktu Baca = " + (waktuFinish - waktuStart));
        byteInput.close();


        // Membaca Dari Memory
        System.out.println(" \nMembaca Dari Memory ");
        System.out.println("--------------------");

        FileInputStream byteInput2        = new FileInputStream("Input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);
        System.out.println(bufferedInput.available());

        bufferedInput.mark(200);

        // Menghitung Waktu Pembacaan Dari Memory
        System.out.println(" \nMenghitung Waktu Pembacaan Dari Memory ");
        System.out.println("---------------------------------------");

        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("Waktu Baca = " + (waktuFinish - waktuStart));

        bufferedInput.reset();

        // Baca Ulang
        System.out.println("\nBaca Ulang Dari Memory");
        System.out.println("-----------------------");

        byte[] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);

        byteInput2.close();
        bufferedInput.close();

        // Menulis Dengan Buffered Output
        System.out.println("\nMenulis Dengan Buffered Output");
        System.out.println("-------------------------------");

        FileOutputStream byteOutput         = new FileOutputStream("Output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        // Write Data Berupa Byte
        bufferedOutput.write(data,0, data.length);
        bufferedOutput.flush();

        byteOutput.close();
        bufferedOutput.close();


    }
}
