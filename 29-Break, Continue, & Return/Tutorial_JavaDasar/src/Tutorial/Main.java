package Tutorial;

public class Main {

    public static void main(String [] args) {

        // Break, Continue, Dan Return
        // Break    ---> Berfungsi Untuk Memaksa Program Untuk Berhenti
        // Continue ---> Berfungsi Untuk Memaksa Program Memulai Dari Awal
        // Return   ---> Berfungsi Untuk Mengeluarkan Program Dari Sebuah Method main

        int a = 0;

        System.out.println();
        System.out.println(" Awal Looping ");
        System.out.println("--------------");

        while (true) {

            a ++;

            if (a == 15) {
                break;
            } else if (a == 10) {
//                continue;
            } else if (a == 5) {
//                return;
            }

            System.out.println(" Looping Ke - " + a);

        }

        System.out.println("---------------");
        System.out.println(" Akhir Looping ");


    }

}
