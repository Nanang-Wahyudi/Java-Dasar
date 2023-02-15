package Tutorial;

public class Main {

    public static void main(String[] args) {

        int a = 1;
        int b = 5;
        boolean kondisi = true;
        System.out.println();

        // While Loop
        // Penempatan increment(++)/decrement(--) berpengaruh kepada hasil looping

        // Increment sebelum aksi
//        System.out.println("=============================");
//        while ( a <= 5 ) {
//            a++;
//            System.out.println(" While Loop ke -  " + a);
//        }
//        System.out.println("=============================");


        // Decrement sesudah aksi
        System.out.println("=============================");
        while ( b >= 1 ) {
            System.out.println(" While Loop ke -  " + b);
            b--;
        }
        System.out.println("=============================");



        // If dalam pengulangan while

        // Increment sesudah aksi dan if
//        System.out.println("=============================");
//        while ( kondisi ) {
//            System.out.println(" While Loop ke -  " + a);
//            if (a == 5){
//                kondisi = false;
//            }
//            a++;
//        }
//        System.out.println("=============================");


        // Decrement sesudah aksi, sebelum if
//        System.out.println("=============================");
//        while ( kondisi ) {
//            System.out.println(" While Loop ke -  " + b);
//            b--;
//            if (b == 1){
//                kondisi = false;
//            }
//        }
//        System.out.println("=============================");


        // Increment sebelum aksi dan if
//        System.out.println("=============================");
//        while ( kondisi ) {
//            a++;
//            System.out.println(" While Loop ke -  " + a);
//            if (a == 5){
//                kondisi = false;
//            }
//        }
//        System.out.println("=============================");



    }

}
