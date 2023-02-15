package JavaDasar;

public class Main {

    public static void main(String[] args) {

        // Program untuk koversi data
        System.out.println();
        int NilaiInt = 450;
        System.out.println(" Nilai Int      = " + NilaiInt);

        // Memperluas rentang nilai ke tipe data yang lebih besar
        System.out.println();
        long NilaiLong = NilaiInt;
        System.out.println(" Nilai Long     = " + NilaiLong);

        // Memperkecil rentang nilai ke tipe data yang lebih kecil
            // Jika nilai yang dikonversi lebih besar dari nilai MAX tipe data yang baru maka hasil yang akan ditampilkan akan merubah nilai aslinya
        System.out.println();
        byte NilaiByte = (byte) NilaiInt;
        System.out.println(" Nilai Byte     = " + NilaiByte);
        System.out.println(" Nilai MAX Byte = " + Byte.MAX_VALUE);
        System.out.println(" Nilai MIN Byte = " + Byte.MIN_VALUE);

        // Casting pembagian
        // Jika ingin memperoleh hasil yang sesuai maka harus merubah salah satu tipe datanya
        System.out.println();
        float a = 10;
        int b = 4;
        float c = a / b;
        System.out.printf("%f : %d = %f \n", a, b, c);

        // Cara lain yaitu dengan menambahkan tipe data nya sebelum operasi aritmatika nya
        int x = 10;
        int y = 4;
        float z = (float) x / y;
        System.out.printf("%d : %d = %f \n", x, y, z);


    }

}
