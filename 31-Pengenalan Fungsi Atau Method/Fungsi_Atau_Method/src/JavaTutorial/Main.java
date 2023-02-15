package JavaTutorial;

public class Main {

    public static void main(String[] args) {

        int x, y;

        x = 10;
        y = hitung(x);

        System.out.println();
        System.out.println(" X = " + x + " , " + " Y = " + y);

        x = 20;
        y = hitung(x);

        System.out.println(" X = " + x + " , " + " Y = " + y);

    }

    static int hitung ( int input ) {

        int hasil;
        hasil = (input + 2) * input;

        return hasil;
    }


}
