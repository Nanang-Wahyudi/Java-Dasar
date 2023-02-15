package JavaTutorial;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println(simple());
        fungsiVoid("Hello Kotok");
        welcome("Admin");
        welcome("User");
    }


    // Fungsi Atau Method Tanpa Kembalian
    private static void fungsiVoid(String input) {
        System.out.println(input);
    }


    private static void welcome(String position) {
        System.out.println("Selamat Datang " + position);
    }


    // Fungsi Atau Method Dengan Kembalian
    // Sehingga Menggunakan Return Untuk Mengembalikan Nilai-nya
    private static float simple() {
        return 10.0f;
    }




}
