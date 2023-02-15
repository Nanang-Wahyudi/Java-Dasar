package JavaDasar_Tutorial;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        int[] dataArray = {0,1,2,3};
        Scanner userInput = new Scanner(System.in);

        System.out.print(" \n Data Ke - : ");
        int indexInput = userInput.nextInt();


        // Exception Biasa
        System.out.println(" \n\n Exception Biasa ");
        System.out.println("--------------------");
        try {
            System.out.printf(" Data Array Ke - %d = %d \n ",indexInput,dataArray[indexInput]);
        } catch (Exception ex) {
            System.err.println(" \n " + ex);
        }


        // Exception Dalam Method
        System.out.println(" \n\n Exception Dalam Method ");
        System.out.println("---------------------------");
        int data = ambilData(dataArray,indexInput);
        System.out.printf(" Data Array Ke - %d = %d ",indexInput,data);


        // Exception Throws By Method
        System.out.println(" \n\n Exception Throws By Method ");
        System.out.println("-------------------------------");
        int data2 = 0;

        try {
            data2 = ambilDataThrows(dataArray,indexInput);
        } catch (Exception ex) {
            System.err.println(" " + ex);
        }
        System.out.printf(" Data Array Ke - %d = %d ",indexInput,data2);


        System.out.println(" \n\n Akhir Program ");
        System.out.println("--------------------");
    }

    private static int ambilDataThrows (int[] array, int index) /*throws Exception*/ {
        int hasil = array[index];
        return hasil;
    }

    private static int ambilData (int[] array, int index) {
        int hasil = 0;

        try {
            hasil = array[index];
        } catch (Exception ex) {
            System.err.println(" " + ex);
        }
        return hasil;
    }



}
