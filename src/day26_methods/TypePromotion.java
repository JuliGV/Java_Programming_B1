package day26_methods;

public class TypePromotion {

    public static void main(String[] args) {
        // byte, short, int, long
        // float, double
        use(2);//first call long then float
        use(3.2);// by default double
        use(5.7F);//float
        use(6767L);//long
        use((double)7);//double
    }
    public static void use (float f){
        System.out.println("Calling float");

    }

    public static void use (double d){
        System.out.println("Calling double");

    }
    public static void use (long l){
        System.out.println("Calling long");

    }
}
