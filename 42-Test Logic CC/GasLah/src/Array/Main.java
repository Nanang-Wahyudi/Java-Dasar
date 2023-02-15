package Array;

import jdk.jshell.Snippet;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[][] status = {
                {" Complete "},
                {" Incomplete ", "Complete"},
                {" Complete ", " Incomplete "}
        };

        String[][] kelengkapan = {
                {" Kwitansi Keseluruhan "},
                {" Form Claim ", " Copy Buku Kehamilan "},
                {" Rincian Biaya Lab ", " Rincian Biaya Obat "}
        };

        String stts = status[0][0];
        String ket = kelengkapan [0][0];
        String ket2 = kelengkapan [1][1];
        String ket3 = kelengkapan [2][0];

        System.out.println();
        System.out.println("\t" + stts);
        System.out.println("----------------------");
        System.out.println(ket + "\n" + ket2 + "\n" + ket3);








    }

}
