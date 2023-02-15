package JavaDasar_Tutorial;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main (String[] args) throws IOException {

        // Membaca File
        FileReader charInput = new FileReader("Input.txt");
        BufferedReader bufferedInput = new BufferedReader(charInput);
        bufferedInput.mark(200);

        // Membaca File Kedalam String
        System.out.println("\nMemabaca File Kedalam String");
        System.out.println("-----------------------------");

        String data = bufferedInput.readLine();
        System.out.println(data);

        // Membaca Per Character
        System.out.println("\nMembaca Per Character");
        System.out.println("---------------------");

        System.out.print((char) bufferedInput.read());
        System.out.print((char) bufferedInput.read());
        System.out.print((char) bufferedInput.read());
        System.out.print((char) bufferedInput.read());

        // Membaca Kedalam Char
        System.out.println("\n\nMembaca Kedalam Char");
        System.out.println("---------------------");

        bufferedInput.reset();
        char[] dataChar = new char[60];
        bufferedInput.read(dataChar,0,60);
        System.out.println(Arrays.toString(dataChar));

        // Membaca Baris
        System.out.println("\nMembaca Baris");
        System.out.println("--------------");

        bufferedInput.reset();
        System.out.println(bufferedInput.readLine());
        System.out.println(bufferedInput.readLine());

        // Menulis File
        System.out.println("\nMenulis File");
        System.out.println("-------------");

        FileWriter charOutput         = new FileWriter("Output.txt");
        BufferedWriter bufferedOutput = new BufferedWriter(charOutput);

        bufferedInput.reset();
        String baris1 = bufferedInput.readLine();
        bufferedOutput.write(baris1,0,baris1.length());
        bufferedOutput.flush();

        // Menambah New Line (Enter)
        bufferedOutput.newLine();

        String baris2 = bufferedInput.readLine();
        bufferedOutput.write(baris2,0,baris2.length());
        bufferedOutput.flush();

        // Menutup File
        charInput.close();
        charOutput.close();
        bufferedInput.close();
        bufferedOutput.close();




    }
}
