package day27_wrapper_arraylist;

public class WrapperObject {
    public static void main(String[] args) {
        int a = 5;
        Integer a2 = 6;// autoboxing---> because whole number by default int primitive
        //Integer a3 = new Integer(7);// take more memory// redundant
        System.out.println(a2);

        int a4 = a2;// unboxing ---> wrapper to primitive

        byte b = (byte)200;//narrowing
        Byte b2 = 20; // autoboxing  ---> primitive to object
    }

}
