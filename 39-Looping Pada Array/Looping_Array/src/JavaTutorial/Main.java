package JavaTutorial;

public class Main {

    public static void main (String[] args) {

        int[] angkaArray = {1,2,3,4,5,6,7,8,9,10};

        // Looping Standard
        System.out.println();
        System.out.println(" Looping Standard ");
        System.out.println("------------------");
        for (int i = 0; i < 9; i++) {
            System.out.println(" Array Index Ke - " + i + " = " + angkaArray[i]);
        }

        // Looping Dengan Proferti Array
        System.out.println();
        System.out.println(" Looping Dengan Properti Length ");
        System.out.println("--------------------------------");
        for (int i = 0; i < angkaArray.length; i++) {
            System.out.println(" Array Index Ke - " + i + " = " + angkaArray[i]);
        }

        // Looping Khusus Array --> foreach
        System.out.println();
        System.out.println(" Looping Dengan Foreach ");
        System.out.println("------------------------");
        for (int angka : angkaArray) {
            System.out.println(" Isi Dari Array = " + angka);
        }




    }

}
