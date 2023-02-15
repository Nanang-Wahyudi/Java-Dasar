package JavaTutorial;

public class Main {

    public static void main (String[] args) {

    // Overload Biasanya Digunakan Untuk Pemanggilan Fungsi Yang Sama Berulang-ulang Tetapi Parameternya Tidak Tetap Atau Berubah-ubah

    // Contoh 1
        System.out.println();
        printAngka(10);
        printAngka(20.5f);

    // Contoh 2
        System.out.println();
        int hasilInteger;
        hasilInteger = printAngka(4,12);
        System.out.println(" Hasil Integer : " + hasilInteger);

        float hasilFloat;
        hasilFloat = printAngka(4.5f,5);
        System.out.println(" Hasil Float   : " + hasilFloat);

    }

    // Fungsi printAngka Dengan Parameter angkaInteger
    private static void printAngka(int angkaInteger) {
        System.out.println(" Angka Integer : " + angkaInteger);
    }

    // Fungsi Yang Sama Dengan Parameter angkaFloat
    private static void printAngka(float angkaFloat) {
        System.out.println(" Angka Float   : " + angkaFloat);
    }

    // Fungsi Yang Sama Dengan Parameter Dua Angka Integer
    private static int printAngka(int angkaInteger1, int angkaInteger2) {
        return angkaInteger1 + angkaInteger2;
    }

    // Fungsi Yang Sama Dengan Parameter Float Dan Integer
    private static float printAngka(float angkaFloat, int angkaInteger) {
        return angkaFloat + angkaInteger;
    }



}
