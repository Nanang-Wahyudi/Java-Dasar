package JavaDasar_Tutorial;

import java.util.Formatter;

public class Main {

    public static void main (String[] args) {

        String nama = "Samsudin";
        int umur    = 80;

        // Print Biasa
        System.out.println("\n Nama Saya " + nama + " Umur " + umur);

        // Print Format
        System.out.printf(" Nama Saya %s Umur %d \n ",nama,umur);

       /* Conversion :
        f = Floating Point
        s = String
        d = Integer
        c = Character
        b = Boolean */
        /* Struktur Format = %[Argumen_Index$][Flags][Width][.Precision]Conversion */

        // [Argumen_Index$]
        System.out.println(" \n Argumen_Index$ ");
        System.out.println("-------------------");
        System.out.printf(" %1$s, %1$s, Mau Kawin %1$s \n ", nama);
        System.out.printf("%1$s Paket!!!, %1$s Menjawab Paket Apa??, Keris Petir Harganya %2$d \n",nama,umur);

        // [Flags]
        System.out.println(" \n Flags ");
        System.out.println("----------");
        int int1 = 5;
        int int2 = 10;
        int hasil = int1 + int2;
        System.out.printf(" %d + %d = %+d \n",int1,int2,hasil);

        // [Width]
        System.out.println("\n Width");
        System.out.println("--------");

        System.out.println(" Integer ");
        System.out.println("-----");
        int int3 = 1000;
        System.out.printf(" %d \n",int3);
        System.out.printf(" %5d \n",int3);
        System.out.printf(" %-5d \n",int3); // Flags = "-" Artinya Rata Kiri
        System.out.printf(" %+5d \n",int3); // Flags Akan Mengambil Slot Didalam Format
        System.out.printf(" %+-6d \n",int3); // Flags Bisa Digabungkan
        System.out.printf(" %10d \n",int3);
        System.out.printf(" %010d \n",int3); // Flags = "0", Artinya Kita Tambahkan Leading "0" Didepan
        System.out.printf(" %+010d \n",int3);
        int int4 = 1000000;
        System.out.printf(" %-,15d \n",int4); // Flags = "," Artinya Menambahkan Delimeter Per Seribu

        System.out.println(" \n Floating Point ");
        System.out.println("-------");
        float float1 = 1.234f;
        System.out.printf(" %f \n",float1);
        System.out.printf(" %+9f \n",float1); // Floating Point Akan Mengambil Width Dengan 6 Decimal

        // [.Precision]
        System.out.println(" \n .Precision ");
        System.out.println("---------------");
        float float2 = 12.345f;
        System.out.printf(" %f \n",float2);
        System.out.printf(" %.1f \n",float2);
        System.out.printf(" %.2f \n",float2);
        System.out.printf(" %8.2f \n",float2); // Gabungkan Dengan Width
        System.out.printf(" %08.2f \n",float2); // Gabungkan Dengan Flags Dan Width

        // Contoh
        System.out.println(" \n Contoh ");
        System.out.println("-----------");
        String nama2 = "Dukun";
        float nilai  = 3.123456789f;
        System.out.printf(" Nilai %1$s Berapa?? \n %1$s : Saya Dapet %2$+5.2f \n",nama2,nilai);

        // Lebih Dalam
        System.out.println(" \n Lebih Dalam ");
        System.out.println("---------------");

        // Save Format Kedalam Variabel String
        System.out.println(" String Biasa ");
        System.out.println("-----");
        String biasa = String.format(" Nilai %1$s Berapa?? \n %1$s : Saya Dapet %2$+5.2f ",nama2,nilai);
        System.out.println(biasa);

        // Save Format Kedalam Variabel String Builder
        System.out.println(" \n String Builder ");
        System.out.println("-----");
        StringBuilder builder = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder);

        formatBuilder.format(" Nilai %1$s Berapa?? \n %1$s : Saya Dapet %2$+5.2f ",nama2,nilai);
        System.out.println(builder);

    }
}
