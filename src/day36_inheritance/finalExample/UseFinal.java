package day36_inheritance.finalExample;

public class UseFinal {
    public static void main(String[] args) {
        System.out.println(FinalExample.PLANET);
        //FinalExample.PLANET = "Mars"; we can not do it

        FinalExample obj1 = new FinalExample(20);
        System.out.println(obj1.a);
        System.out.println(obj1.b);

//        obj1.a = 6; can not reassign because it is final
//        obj1.b = 6;

        FinalExample obj2 = new FinalExample(30);
        System.out.println(obj2.a);
        System.out.println(obj2.b);




    }
}
