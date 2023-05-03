package day36_inheritance.Access.b;

import day36_inheritance.Access.a.First;

public class Third {
    public static void main(String[] args) {
        //Third obj = new Third();
        First obj = new First();
        System.out.println(obj.one);

        //System.out.println(obj.two);
        //Protected because we don't have any inheritance

        //System.out.println(obj.three);
        // DEFAULT accessible only in the same package

        //System.out.println(obj.four);
        // PRIVATE only in the same class

    }
}
