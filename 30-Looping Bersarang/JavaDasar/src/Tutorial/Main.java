package Tutorial;

public class Main {

    public static void main(String[] args) {

        // Looping Bersarang

        // Looping 1
        System.out.println();
        for (int baris = 0; baris < 5; baris++) {

            for (int kolom = 0; kolom < 7; kolom++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // Looping 2
        System.out.println();
        for (int baris = 0; baris < 6; baris++) {

            for (int kolom = 0; kolom < 6; kolom++) {
                System.out.print("* ");

                if ((baris + kolom) == 5) {
                    break;
                }
            }

            System.out.println();
        }


        // Looping 3
        System.out.println();
        for (int baris = 0; baris < 6; baris++) {

            for (int kolom = 0; kolom < 6; kolom++) {
                System.out.print("* ");

                if ((baris == kolom)) {
                    break;
                }
            }

            System.out.println();
        }


        // Looping 4
        System.out.println();
        for (int baris = 0; baris < 10; baris++) {

            for (int kolom = 0; kolom < 10; kolom++) {
                System.out.print("* ");

                if ((baris == kolom)) {
                    break;
                } else if ((baris + kolom) == 9) {
                    break;
                }
            }

            System.out.println();
        }




    }

}
