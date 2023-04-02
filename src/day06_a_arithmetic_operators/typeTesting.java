package day06_a_arithmetic_operators;

public class typeTesting {
    public static void main (String [] args){

        byte b = 48;
        int i = b;// the byte value is automaticaly (implicitly) because byte smaller


        int i2 = 100;
        byte b2 = (byte) i2; // reassigning chech the data type first.

        byte b3 =100;// putting the value directly gives a data type automatically after checking the range
        System.out.println("b2: " + b2);
        System.out.println("b3: " +b3);

        int i3 = 130;
        byte b4 = (byte) i3; // -128 ....127 -->
        System.out.println("b4: " +b4);

        char letter = 65; // print A, imlicit casting
        //char letter = (char)65; // print A, explicit casting
        char letter2 = 'A';
        System.out.println(letter);
        System.out.println(letter2);

        byte b5 = 'B';
        char num = (char) b5;
        System.out.println(num);

        byte aa = 5;
        char bb = (char)aa;
        System.out.println(bb);


        int i10 = 500;
        long l1 = i10;// int is smaller than long

        System.out.println(l1);

        long l2 = 200;
        int i11 = (int) l2;//explicit casting, because long bigger than int

        int hg = 200;

        System.out.println(i11);

        long l3 = 1_000_000_000_000L;
        int i12 = (int) l3; //explicit testing

        double d = 50.5; // output 50.0 because decimal
        System.out.println(d);


        int i13 =(int) d;



    }
}
