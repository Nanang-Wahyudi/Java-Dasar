package Tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);

    // Switch Case

        int hari;

        System.out.println();
        System.out.print(" Masukan Urutan Hari Ke?? : ");
        hari = UserInput.nextInt();

        System.out.println("----------------------------");

        switch ( hari ) {

            case 1 :
                System.out.println(" 1 --> Senin ");
                break;
            case 2 :
                System.out.println(" 2 --> Selasa ");
                break;
            case 3 :
                System.out.println(" 3 --> Rabu ");
                break;
            case 4 :
                System.out.println(" 4 --> Kamis ");
                break;
            case 5 :
                System.out.println(" 5 --> Jumat ");
                break;
            case 6 :
                System.out.println(" 6 --> Sabtu ");
                break;
            case 7 :
                System.out.println(" 7 --> Minggu ");
                break;
            default:
                System.out.println(" Urutan Hari Yang Anda Masukan Salah ");
                System.out.println(" Note : Silahkan Pilih Urutan Hari Dari 1 - 7 !!! ");

        }







    }

}
