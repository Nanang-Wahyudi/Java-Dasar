package Tutorial;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        int b = 1;
        boolean kondisi = true;
        System.out.println();

        // Do While Loop
        // Sama Seperti While Penempatan Increment(++)/Decrement(--) Mempengaruhi Hasil Dari Looping

        // Decrement (--)
//        do {
//            a--;
//            System.out.println(" Do While Ke - " + a);
//        } while (a >= 1);


        // Increment (++)
//        do {
//            System.out.println(" Do While Ke - " + b);
//            b++;
//        } while (b <= 5);


        // If Dalam Pengulangan Do While

        // Decrement (--)
//        do {
//            System.out.println(" Do While Ke - " + a);
//            if ( a == 1) {
//                kondisi = false;
//            }
//            a--;
//        } while (kondisi);


        // Increment (++)
        do {
            b++;
            System.out.println(" Do While Ke - " + b);
            if ( b == 5) {
                kondisi = false;
            }
        } while (kondisi);




    }

}
