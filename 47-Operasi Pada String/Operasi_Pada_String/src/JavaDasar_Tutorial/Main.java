package JavaDasar_Tutorial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        // Membuat String
        String kalimat1 = "Selamat Pagi";
        System.out.println("\n" + kalimat1);
        System.out.println("---------------------");

        // Mengambil Komponen Dari String
        System.out.println(kalimat1.charAt(9));
        System.out.println("---------------------");

        // Substring
        String kata = kalimat1.substring(8,12);
        System.out.println(kata);
        System.out.println("---------------------");

        // Concatenation (Penggabungan String)
        String kalimat2 = kalimat1 + " Semua ";
        System.out.println(kalimat2);

        kata = kata + " Semuanya ";
        System.out.println(kata);
        System.out.println("---------------------");

        // Concat Dengan Non-String
        int jumlah = 20;
        String kalimat3 = kalimat1 + " " + jumlah;
        System.out.println(kalimat3);

        System.out.println(kata + "" + jumlah);
        System.out.println("---------------------");

        // Lowercase Dan Uppercase
        System.out.println(kalimat1.toUpperCase());
        System.out.println(kalimat1.toLowerCase());
        System.out.println("---------------------");

        // Replace (Mengganti Komponen Pada String)
        String kalimat4 = kalimat1.replace("Pagi","Sore");
        System.out.println(kalimat1);
        System.out.println(kalimat4);
        System.out.println("---------------------");

        // Compare (Membandingkan)
        String buah1 = "Pisang";
        String buah2 = "Mangga";
        System.out.println("Pisang = " + buah1.compareTo(buah2));
        System.out.println("Mangga = " + buah2.compareTo(buah1));

        /* Cara Kerja Dari Compare Yaitu Membandingkan Setiap Huruf Pada String.
        Jika Huruf Pertama Pada Kedua String Sama, Maka Yang Dibandingkan
        Adalah Huruf Yang Kedua, Begitupun Seterusnya .
        Contoh :
        Huruf Pertama buah1 = P Sedangkan buah2 = M, Berdasarkan Urutan Abjad
        MNOP, Maka P > M , Sehingga Selih Kedua Huruf Tersebut Adalah 3   */

        String buah3 = "Anggur";
        String buah4 = "Apel";
        System.out.println("Anggur = " + buah3.compareTo(buah4));
        System.out.println("Apel   = " + buah4.compareTo(buah3));

       /* Cara Kerjanya : Kita Ambil Huruf ke-2 Karena Huruf Ke-1 Sama Yaitu A .
        NOP ---> N < P = -2 Maka Anggur = -2 Sedangkan P > N = 2 Maka Apel = 2 .*/
        System.out.println("---------------------");

        // Equality (Persamaan)
        // Persamaan Pasa Lokasi String Pool
        String kata2 = "Test";                      // Ada Di String Pool
//      String kata3 = "Test";                     // Ada Di String Pool
        String kata3 = new String("Test");  // Tidak Ada Di String Pool

        /* Jika Menggunakan If Seperti Dibawah Ini, Maka Yang Dibandingkan Adalah Memory-nya
        Bukan Komponen String-nya */
        if (kata2 == kata3) {
            System.out.println("Sama");
        }else {
            System.out.println("Tidak Sama");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("\nMasukan Input User  : ");
        kata3 = userInput.next();
        System.out.println("User Input          : " + kata3);

//      Tetapi Jika Menggunakan Equal Pada If Maka Yang Dibandingkan Komponen Pada String-nya
        if (kata2.equals(kata3)) {
            System.out.println("Sama");
        } else {
            System.out.println("Tidak Sama");
        }



    }


}
