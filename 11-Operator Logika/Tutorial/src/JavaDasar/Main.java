package JavaDasar;

public class Main {

    public static void main(String[] args) {

//        operator Logika :
//        1. OR   --> a = 1 (true),  b = 0 (false)  -->  1 (true)
//                    a = 0 (false), b = 1 (true)   -->  1 (true)
//                    a = 1 (true),  b = 1 (true)   -->  1 (true)
//                    a = 0 (false), b = 0 (false)  -->  0 (false)
//
//
//        2. AND  --> a = 1 (true),  b = 0 (false)  -->  0 (false)
//                    a = 0 (false), b = 1 (true)   -->  0 (false)
//                    a = 0 (false), b = 0 (false)  -->  0 (false)
//                    a = 1 (true),  b = 1 (true)   -->  1 (true)
//
//
//        2. AND  --> a = 1 (true),  b = 0 (false)  -->  1 (true)
//                    a = 0 (false), b = 1 (true)   -->  1 (true)
//                    a = 1 (true),  b = 1 (true)   -->  0 (false)
//                    a = 0 (false), b = 0 (false)  -->  0 (false)


        boolean a,b,c;

        // OR (atau) Dilambangkan ||
        System.out.println();
        System.out.println("----------- OR ------------");
        a = true;
        b = false;
        c = (a || b);
        System.out.println( a + "  || " + b + " = " + c );
        a = false;
        b = true;
        c = (a || b);
        System.out.println( a + " || " + b + "  = " + c );
        a = true;
        b = true;
        c = (a || b);
        System.out.println( a + "  || " + b + "  = " + c );
        a = false;
        b = false;
        c = (a || b);
        System.out.println( a + " || " + b + " = " + c );


        // AND (Dan) Dilambangkan &&
        System.out.println("----------- AND ------------");
        a = true;
        b = false;
        c = (a && b);
        System.out.println( a + "  && " + b + "  = " + c );
        a = false;
        b = true;
        c = (a && b);
        System.out.println( a + " && " + b + "   = " + c );
        a = false;
        b = false;
        c = (a && b);
        System.out.println( a + " && " + b + "  = " + c );
        a = true;
        b = true;
        c = (a && b);
        System.out.println( a + "  && " + b + "   = " + c );


        // XOR (Exlusive OR) Dilambangkan ^
        System.out.println("----------- XOR ------------");
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println( a + "  ^ " + b + "  = " + c );
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println( a + " ^ " + b + "   = " + c );
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println( a + " ^ " + b + "  = " + c );
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println( a + "  ^ " + b + "   = " + c );


        // NOT (Negasi) Dilambangkan !
        System.out.println("----------- NOT ------------");
        a = true;
        c = !a;
        System.out.println( a + "  --> (!) = " + c);
        a = false;
        c = !a;
        System.out.println( a + " --> (!) = " + c);


    }

}
