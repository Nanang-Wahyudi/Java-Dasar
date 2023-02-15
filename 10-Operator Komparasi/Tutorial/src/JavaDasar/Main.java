package JavaDasar;

public class Main {

    public static void main(String[] args) {

        // Operator Komparasi ... Ini akan menghasilkan nilai dalam bentuk boolean
        int a,b;
        boolean HasilKomparasi;

        // Cara Penulisan 1
        System.out.println();
        a = 10;
        b = 10;
        System.out.printf(" %d == %d --> %s \n", a, b, (a == b));


        // Cara Penulisan 2
        // Operator Equal (Persamaan)
        System.out.println();
        a = 10;
        b = 10;
        HasilKomparasi = (a == b);
        System.out.printf(" %d == %d --> %s \n", a, b, HasilKomparasi);

        a = 12;
        b = 10;
        HasilKomparasi = (a == b);
        System.out.printf(" %d == %d --> %s \n", a, b, HasilKomparasi);


        // Operator Not Equal (Pertidaksamaan)
        System.out.println();
        a = 10;
        b = 10;
        HasilKomparasi = (a != b);
        System.out.printf(" %d != %d --> %s \n", a, b, HasilKomparasi);

        a = 12;
        b = 10;
        HasilKomparasi = (a != b);
        System.out.printf(" %d != %d --> %s \n", a, b, HasilKomparasi);


        // Operator Less Than (Kurang Dari)
        System.out.println();
        a = 9;
        b = 10;
        HasilKomparasi = (a < b);
        System.out.printf(" %d < %d --> %s \n", a, b, HasilKomparasi);

        a = 12;
        b = 10;
        HasilKomparasi = (a < b);
        System.out.printf(" %d < %d --> %s \n", a, b, HasilKomparasi);


        // Operator Greater Than (Lebih Dari)
        System.out.println();
        a = 10;
        b = 10;
        HasilKomparasi = (a > b);
        System.out.printf(" %d > %d --> %s \n", a, b, HasilKomparasi);

        a = 12;
        b = 10;
        HasilKomparasi = (a > b);
        System.out.printf(" %d > %d --> %s \n", a, b, HasilKomparasi);


        // Operator Less Than Equal (Kurang Dari Sama Dengan)
        System.out.println();
        a = 10;
        b = 10;
        HasilKomparasi = (a <= b);
        System.out.printf(" %d <= %d --> %s \n", a, b, HasilKomparasi);

        a = 12;
        b = 10;
        HasilKomparasi = (a <= b);
        System.out.printf(" %d <= %d --> %s \n", a, b, HasilKomparasi);


        // Operator Greater Than Equal (Lebih Dari Sama Dengan)
        System.out.println();
        a = 9;
        b = 10;
        HasilKomparasi = (a >= b);
        System.out.printf(" %d >= %d --> %s \n", a, b, HasilKomparasi);

        a = 12;
        b = 10;
        HasilKomparasi = (a >= b);
        System.out.printf(" %d >= %d --> %s \n", a, b, HasilKomparasi);

    }
}
