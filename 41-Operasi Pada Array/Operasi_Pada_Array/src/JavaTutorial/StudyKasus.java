package JavaTutorial;

import java.util.Arrays;
import java.util.Collections;

public class StudyKasus {

    public static void main(String[] args) {

        // Sort Kebalik (Terbesar --> Terkecil)
        System.out.println(" \n Sort Terbesar --> Terkecil ");
        System.out.println("-------------------------------");
        Integer[] dataArray = {1,4,5,8,9,5,8,2,10,3,10,6,7};

        Arrays.sort(dataArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(dataArray));


        // Menjumlahkan Array
        System.out.println(" \n Menjumlahkan Array ");
        System.out.println("-----------------------");
        int[] dataArray2 = {9,7,6,15,17,27,8,5};
        int[] dataArray3 = Arrays.copyOf(dataArray2,8);

        printArray(" Array-1 ",dataArray2);
        printArray(" Array-2 ",dataArray3);
        System.out.println("-------------------------------------------- ++");
        int[] hasilTambah = tambahArray(dataArray2,dataArray3);
        printArray(" Hasil ",hasilTambah);


        // Menggabungkan Array
        System.out.println(" \n Menggabungkan Array ");
        System.out.println("------------------------");
        int[] dataArray4 = {1,2,3,4,5};
        int[] dataArray5 = {6,7,8,9};

        int gabung1 = dataArray4.length;
        int gabung2 = dataArray5.length;
        int[] hasilGabung = new int[gabung1 + gabung2];

        System.arraycopy(dataArray4, 0, hasilGabung, 0, gabung1);
        System.arraycopy(dataArray5, 0, hasilGabung, gabung1, gabung2);
        printArray(" Array-1 ", dataArray4);
        printArray(" Array-2 ", dataArray5);
        System.out.println("----------------------------------------");
        printArray(" Hasil ", hasilGabung);

    }

    private static int[] tambahArray(int[] array1, int[]array2) {
        int[] hasilArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            hasilArray[i] = array1[i] + array2[i];
        }
        return hasilArray;
    }

    private static void printArray(String pesan, int[] array) {
        System.out.println(pesan + " = " + Arrays.toString(array));
    }


}
