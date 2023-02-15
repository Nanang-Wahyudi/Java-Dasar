package JavaDasar;

public class Main {

    public static void main(String[] args) {

        // Unary = Operasi yang dilakukan pada satu variabel

        // Unary + dan -
        System.out.println();
        int a = 10;
        System.out.printf(" Unary '+'   = %d Menjadi %d \n", a, +a);
        System.out.printf(" Unary '-'   = %d Menjadi %d \n", a, -a);

        // Unary Decrement dan Increment
        System.out.println();
        int b = 20;
        b++;
        System.out.println(" Unary '++'  = " + " Menjadi " + b);

        int c = 20;
        c--;
        System.out.println(" Unary '--'  = " + " Menjadi " + c);

        int d = 25;
        System.out.println();
        System.out.printf(" Unary Prefix = %d \n", ++d);

        int e = 25;
        System.out.println();
        System.out.printf(" Unary Postfix = %d \n", e++);
        System.out.printf(" Unary Postfix = %d \n", e);

        // Unary Boolean dengan ! untuk negasi
        System.out.println();
        boolean pertama = true;
        System.out.println(" Nilai Boolean = " + pertama);
        System.out.println(" Nilai Boolean = " + !pertama);



    }

}
