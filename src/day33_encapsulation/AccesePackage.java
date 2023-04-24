package day33_encapsulation;

public class AccesePackage {
    public static void main(String[] args) {
        AcceserModifiers obj = new AcceserModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
//        System.out.println(obj.c); because it is  private, private only on class
//        System.out.println(obj.z);// because it is private an we can reach this only inside the class
        System.out.println(obj.y);

    }
}
