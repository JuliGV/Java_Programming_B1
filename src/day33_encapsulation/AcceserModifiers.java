package day33_encapsulation;

public class AcceserModifiers {
    public int a;// public instanc variable
    int b;// default instance variable
    private int c;// private instance variable
    static  int y;//default static variable

    private static int z;// privete static instance variable

    public static void main(String[] args) {
        AcceserModifiers obj = new AcceserModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.z);
        System.out.println(obj.y);


       // System.out.println(AcceserModifiers.a);// because is not static, we need object name
        System.out.println(AcceserModifiers.z);
        System.out.println(AcceserModifiers.y);


    }

}
