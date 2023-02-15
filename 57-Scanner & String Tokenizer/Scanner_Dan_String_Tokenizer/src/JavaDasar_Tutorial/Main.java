package JavaDasar_Tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {

        FileReader fileInput         = new FileReader("Input.txt");
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedInput);

        // Cek Ada Kata Selanjutnya Atau Tidak
        System.out.println();
        System.out.println(scanner.hasNext()); // True
        System.out.println("-----");

        // Membaca Kata Dengan Delimiter Spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        // Cek Ada Kata Selanjutnya Atau Tidak
        System.out.println("------");
        System.out.println(scanner.hasNext()); // False


        // Membaca Kata Menggunakan Delimeter Tertentu
        fileInput = new FileReader("Input2.txt");
        bufferedInput = new BufferedReader(fileInput);

        bufferedInput.mark(200);

        scanner = new Scanner(bufferedInput);
        scanner.useDelimiter(",");

        // Jika Menggunakan useDelimiter Maka Baris Kedua Dengan Delimiter Spasi Tidak Akan berurut Vertikal,
        // Tetapi Jika useDelimiter-nya Dihapus Maka Delimiter Spasi Akan Berurut Vertikal Dan Yang Delimiter "," Akan Berurut Horizontal

        // Print Dengan Looping
        System.out.println();
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }


        // Mengggunakan String Tokenizer
        bufferedInput.reset();

        // Baris Pertama
        String data = bufferedInput.readLine();
        System.out.println("\n" + data);
        System.out.println("-------");

        StringTokenizer stringTokenizer = new StringTokenizer(data,",");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        // Baris Kedua
        data = bufferedInput.readLine();
        System.out.println(data);
        System.out.println("----");

        stringTokenizer = new StringTokenizer(data," ");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }





    }
}
