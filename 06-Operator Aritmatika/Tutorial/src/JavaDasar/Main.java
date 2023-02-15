package JavaDasar;

public class Main {

    public static void main(String[] args) {

    //    Operasi Aritmatika

        int var1 = 10;
        int var2 = 5;

        int hasil;
        System.out.println();

        // Penjumlahan
        System.out.println("---------- PENJUMLAHAN ---------");
        hasil = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + hasil);

        // Pengurangan
        System.out.println("---------- PENGURANGAN ---------");
        hasil = var1 - var2;
        System.out.printf("%d - %d = %d \n", var1, var2, hasil);

        // Perkalian
        System.out.println("----------- PERKALIAN ----------");
        hasil = var1 * var2;
        System.out.printf("%d x %d = %d \n", var1, var2, hasil);

        // Pembagian
        System.out.println("----------- PEMBAGIAN ----------");
        hasil = var1 / var2;
        System.out.printf("%d : %d = %d \n", var1, var2, hasil);

        double var3 = 6;
        double var4 = 5;
        double HasilDouble;

        HasilDouble = var3 / var4;
        System.out.println(var3 + " : " + var4 + " = " + HasilDouble);

        // Modulus ( Sisa Pembagian )
        System.out.println("----------- MODULUS ----------");
        hasil = var1 % var2;
        System.out.printf("%d %% %d = %d \n", var1, var2, hasil);



    }

}
