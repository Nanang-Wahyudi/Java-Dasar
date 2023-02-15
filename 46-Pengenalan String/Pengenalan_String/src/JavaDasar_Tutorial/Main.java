package JavaDasar_Tutorial;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        // Membuat Dan Membandingkan String Dengan Char
        String kataString = "Hallo";
        char[] kataChar = {'H','a','l','l','o'};

        // Menampilkan Komponen Dari String Dan Char
        System.out.println(" \n Komponen String = " + kataString);
        System.out.println(" Komponen Char[] = " + Arrays.toString(kataChar));
        System.out.println("-----------------------------------");

        // Mengakses Komponen Dari String Dan Char
        System.out.println(" Komponen Pertama Pada String = " + kataString.charAt(0));
        System.out.println(" Komponen Pertama Pada Char[] = " + kataChar[0]);
        System.out.println("-----------------------------------");
        printAddresString("String",kataString);
        System.out.println("-------------------------");
        printAddresChar("Char[]",kataChar);
        System.out.println("-----------------------------------");

        // Merubah Komponen Dari String Dan Char
        System.out.println();
        // Sebenarnya Komponen Pada String Tidak Bisa Dirubah, Karena String Dijava Itu Immutable
        // Tetapi Kita Bisa Merubahnya Secara Tidak Langsung, Dengan Cara Membuat Addres Baru Untuk Menggantikan Addres Yang Lama

        kataString = "C" + kataString.substring(1,5);
        System.out.println(" \n Komponen String = " + kataString);

        kataChar[0] = 'C';
        System.out.println(" Komponen Char[] = " + Arrays.toString(kataChar));
        System.out.println("-----------------------------------");

        printAddresString("String",kataString);
        System.out.println("-------------------------");
        printAddresChar("Char[]",kataChar);
        System.out.println("-----------------------------------");

        // Memory Dari String (String Pool)
        System.out.println();
        String string1 = "Hallo";
        String string2 = "Callo";
        kataString     = "Callo";
        System.out.println();
        printAddresString("String 1",string1);
        System.out.println("------------");
        printAddresString("String 2",string2);
        System.out.println("------------");
        printAddresString("String",kataString);
        System.out.println("-------------------------");

        String string3 = "Test";
        String string4 = "Test";
        printAddresString("String 3",string3);
        System.out.println("------------");
        printAddresString("String 4",string4);
        System.out.println("-------------------------");

        String string5 = "Testing";
        printAddresString("String 5",string5);
        System.out.println("------------");
        string5 = string5.substring(0,4);
        printAddresString("String 5",string5);
        System.out.println("-------------------------");

//        Kesimpulan :
//        1. String Di Java Itu Immutable (Tidak Bisa Berubah) .
//        2. String Yang Berada Di String Pool Itu Akan Reusable (Menggunakan Kembali), Sehingga Lebih Efisien .
//        3. Membuat String Dengan Objek Baru, Maka Dia Akan Disimpan Di Memory (Addres) Lain Bukan Di String Pool .
//        4. Penggunaan String Lebih Efektif Dibandingkan Dengan Char Array .

        // Sebagai Contoh
        // Pada Kasus DiBawah, String Akan Disimpan Didalam Memory Heaf, Sehingga Dia Tidak Akan Mengambil Data Didalam String Pool, Karena Datanya Ditempatkan Diluar Dari String Pool, Sehingga Dia Memiliki Addres Yang Berbeda

        System.out.println();
        String heaf = new String("Hallo");
        printAddresString("Heaf",heaf);
        System.out.println("-------------------------");

    }

    public static void printAddresChar (String nama, char[] dataChar) {
        int addres = System.identityHashCode(dataChar);
        System.out.println(" " + nama + " = " + Arrays.toString(dataChar));
        System.out.println(" Addres = " + addres);
    }

    public static void printAddresString (String nama, String dataString) {
        int addres = System.identityHashCode(dataString);
        System.out.println(" " + nama + " = " + dataString);
        System.out.println(" Addres = " + addres);
    }



}
