package StudyKasus_OperasiMatrix;

public class Main {

    public static void main (String[] args) {

        System.out.println();

        int[][] matrix_a = {
                {1,2},
                {3,4}
        };

        int[][] matrix_b = {
                {11,12},
                {13,14}
        };

        printArray("Matrix a", matrix_a);
        printArray("Matrix b", matrix_b);

        int[][] hasilTambahMatrix = penjumlahanMatrix(matrix_a,matrix_b);
        printArray("Hasil Penjumlahan", hasilTambahMatrix);

        int[][] hasilKaliMatrix = perkalianMatrix(matrix_a,matrix_b);
        printArray("Hasil Perkalian", hasilKaliMatrix);

    }

    public static int[][] perkalianMatrix (int[][] matrix_1, int[][] matrix_2) {
        int baris_a = matrix_1.length;
        int kolom_a = matrix_1[0].length;

        int baris_b = matrix_2.length;
        int kolom_b = matrix_2[0].length;

        int[][] hasilKali = new int[baris_a][kolom_b];
        int buffer;

        // IF Atau Syarat Untuk Perkalian Matrix Masih Error
        /*if (baris_a == kolom_b) {*/

            for (int i = 0; i < baris_a; i++) {
                for (int j = 0; j < kolom_b; j++) {
                    buffer = 0;

                    for (int k = 0; k < kolom_a; k++) {
                        buffer += matrix_1[i][k] * matrix_2[k][j];
                    }

                    hasilKali[i][j] = buffer;
                }
            }

//        } else {
//            System.out.println("Hasil Tidak Ditemukan!!! \nJumlah Baris Atau Kolom Pada Matrix Tidak Sama \n");
//        }

        return hasilKali;
    }

    public static int[][] penjumlahanMatrix (int[][] matrix_1, int[][] matrix_2) {
        int baris_a = matrix_1.length;
        int kolom_a = matrix_1[0].length;

        int baris_b = matrix_2.length;
        int kolom_b =  matrix_2[0].length;

        int[][] hasilTambah = new int[baris_a][kolom_a];

        if (baris_a == baris_b && kolom_a == kolom_b) {

            for (int b = 0; b < baris_a; b++) {
                for (int k = 0; k < kolom_a; k++) {
                    hasilTambah[b][k] = matrix_1[b][k] + matrix_2[b][k];
                }
            }

        } else {
            System.out.println("Hasil Tidak Ditemukan!!! \nJumlah Baris Atau Kolom Pada Matrix Tidak Sama!!! \n");
        }

        return hasilTambah;
    }

    public static void printArray (String namaMatrix, int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        System.out.println(namaMatrix);
        System.out.println("----------");

        for (int b = 0; b < baris; b++) {
            System.out.print("[");

            for (int k = 0; k < kolom; k++) {
                System.out.print(dataArray[b][k]);

                if (k < kolom - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}
