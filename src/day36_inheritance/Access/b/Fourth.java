package day36_inheritance.Access.b;

import day36_inheritance.Access.a.First;

public class Fourth extends First {
    public static void main(String[] args) {
        Fourth obj = new Fourth();

        System.out.println(obj.one);
        System.out.println(obj.two);
        //System.out.println(obj.three); same class
        //System.out.println(obj.four);same class

    }
}
