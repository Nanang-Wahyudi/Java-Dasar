package Menghitung_Jumlah_Abjad;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        char[] huruf = new char[50];
        int[] jumlahHuruf = new int[50];
        int jumlahHurufBerbeda = 0;
        String kalimat;

        System.out.println();
        System.out.print(" Masukan kalimat : ");
        kalimat = input.nextLine();

        if(kalimat.isEmpty()){
            System.out.println(" Masukan kosong ");
        } else {

            huruf[0] = kalimat.charAt(0);
            jumlahHuruf[0] = 1;
            jumlahHurufBerbeda = 1;

            for(int i = 1; i < kalimat.length(); i++){
                boolean sudahMuncul = false;

                for(int j = 0; j < jumlahHurufBerbeda; j++){
                    if(kalimat.charAt(i) == huruf[j]){
                        sudahMuncul = true;
                        jumlahHuruf[j] += 1;
                    }
                }

                if(!sudahMuncul){
                    huruf[jumlahHurufBerbeda] = kalimat.charAt(i);
                    jumlahHuruf[jumlahHurufBerbeda] = 1;
                    jumlahHurufBerbeda++;
                }
            }

            System.out.println("-------------------");
            for(int i = 0; i < jumlahHurufBerbeda; i++){
                System.out.println(" Huruf " + huruf[i] + " : " + jumlahHuruf[i]);
            }
        }





    }

}
