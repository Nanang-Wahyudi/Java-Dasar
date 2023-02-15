package JavaDasar;

public class Main {

    public static void main(String[] args) {

//        Tipe Data :
//        1. Integer          5. Double
//        2. Byte             6. Float
//        3. Short            7. Char
//        4. Long             8. Boolean

    // Integer ( Satuan )
        int i = 10;
        System.out.println();
        System.out.println("----------- INTEGER ----------");
        System.out.println(" Nilai i   = " + i);
        System.out.println(" Nilai MAX = " + Integer.MAX_VALUE);
        System.out.println(" Nilai MIN = " + Integer.MIN_VALUE);
        System.out.println(" Besar Int = " + Integer.BYTES + " byte ");
        System.out.println(" Besar Int = " + Integer.SIZE + " bit ");

    // Byte ( Satuan )
        byte b = 20;
        System.out.println("----------- BYTE ----------");
        System.out.println(" Nilai b   = " + b );
        System.out.println(" Nilai MAX = " + Byte.MAX_VALUE);
        System.out.println(" Nilai MIN = " + Byte.MIN_VALUE);
        System.out.println(" Besar Int = " + Byte.BYTES + " byte ");
        System.out.println(" Besar Int = " + Byte.SIZE + " bit ");

    // Short ( Satuan )
        short s = 30;
        System.out.println("----------- SHORT ----------");
        System.out.println(" Nilai s   = " + s );
        System.out.println(" Nilai MAX = " + Short.MAX_VALUE);
        System.out.println(" Nilai MIN = " + Short.MIN_VALUE);
        System.out.println(" Besar Int = " + Short.BYTES + " byte ");
        System.out.println(" Besar Int = " + Short.SIZE + " bit ");

    // Long ( Satuan )
        long l = 40L;
        System.out.println("----------- LONG ----------");
        System.out.println(" Nilai l   = " + l );
        System.out.println(" Nilai MAX = " + Long.MAX_VALUE);
        System.out.println(" Nilai MIN = " + Long.MIN_VALUE);
        System.out.println(" Besar Int = " + Long.BYTES + " byte ");
        System.out.println(" Besar Int = " + Long.SIZE + " bit ");

    // Double ( Bilangan Yang Mengandung Koma )
        double d = 50.5D;
        System.out.println("----------- DOUBLE ----------");
        System.out.println(" Nilai d   = " + d );
        System.out.println(" Nilai MAX = " + Double.MAX_VALUE);
        System.out.println(" Nilai MIN = " + Double.MIN_VALUE);
        System.out.println(" Besar Int = " + Double.BYTES + " byte ");
        System.out.println(" Besar Int = " + Double.SIZE + " bit ");

    // Float
        float f = 60.6F;
        System.out.println("----------- FLOAT ----------");
        System.out.println(" Nilai f   = " + f );
        System.out.println(" Nilai MAX = " + Float.MAX_VALUE);
        System.out.println(" Nilai MIN = " + Float.MIN_VALUE);
        System.out.println(" Besar Int = " + Float.BYTES + " byte ");
        System.out.println(" Besar Int = " + Float.SIZE + " bit ");

    // Char ( Karakter ) Berdasarkan ASCII
        char c = 'C';
        System.out.println("----------- CHAR ----------");
        System.out.println(" Nilai c   = " + c );
        System.out.println(" Nilai MAX = " + Character.MAX_VALUE);
        System.out.println(" Nilai MIN = " + Character.MIN_VALUE);
        System.out.println(" Besar Int = " + Character.BYTES + " byte ");
        System.out.println(" Besar Int = " + Character.SIZE + " bit ");

    // Boolean ( Nilai True Atau False )
        boolean bool = true;
        System.out.println("----------- BOOLEAN ----------");
        System.out.println(" Nilai bool    = " + bool );
        System.out.println(" Nilai Boolean = " + Boolean.FALSE);
        System.out.println(" Nilai Boolean = " + Boolean.TRUE);


    }

}
