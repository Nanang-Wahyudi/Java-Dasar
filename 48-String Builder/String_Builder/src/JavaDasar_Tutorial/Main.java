package JavaDasar_Tutorial;

import java.lang.StringBuilder;

public class Main {

    public static void main (String[] args) {

    /* String Builder Dianggap Lebih Efisien Dibandingkan Dengan String Biasa
    Dalam Kondisi Tertentu, Karena String Builder Hanya Menggunakan Satu Address Saja */

        // Membuat String Builder
        StringBuilder builder = new StringBuilder("Hallo");
        printData(builder);
        System.out.println("-------------");

        // Append
        builder.append(" Semua");
        printData(builder);

        builder.append(" Mahasiswa UNBAJA, Banten");
        printData(builder);
        System.out.println("-------------");

        //Insert
        builder.insert(30, "Provinsi ");
        printData(builder);
        System.out.println("-------------");

        // Delete
        builder.delete(30,39);
        printData(builder);
        System.out.println("-------------");

        // Mengubah Character Pada Index Tertentu
        builder.setCharAt(35,'N');
        printData(builder);
        System.out.println("-------------");

        // Replace
        builder.replace(30,36,"Kota Serang");
        printData(builder);
        System.out.println("-------------");

       // Cating Menjadi String
        String dataString = builder.toString();
        System.out.println("\n Data      = " + dataString);

        int addressString = System.identityHashCode(dataString);
        System.out.println(" Address   = " + Integer.toHexString(addressString));
        System.out.println("-------------");

    }

    private static void printData (StringBuilder dataBuilder) {
        System.out.println("\n Data      = " + dataBuilder);
        System.out.println(" Panjang   = " + dataBuilder.length());
        System.out.println(" Kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println(" Address   = " + Integer.toHexString(addressBuilder));
    }

}
