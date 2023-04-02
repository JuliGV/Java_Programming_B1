package day06_a_arithmetic_operators;

public class DifferentTypes {
    public static void main(String[] args) {

        // two int type
        System.out.println(10 - 5);//=5

        System.out.println(5 * 10);// 50

        // double and int
        System.out.println(10.0 / 5); //2.0

        System.out.println(10 / 5.0);//2.0

        System.out.println(10.0 / 5.0);//2.0
        System.out.println((int) (10.0 / 5.0));//2
        System.out.println((double) (5 * 2));//10.0
        System.out.println((double) 5 * 2);//10.0 -> steps

        byte b1 = 5;
        short s1 =6;
        System.out.println(b1*s1);// 30 it will be int besause by defolt its int with all type of calculation

        //-5, +4

    }
}
