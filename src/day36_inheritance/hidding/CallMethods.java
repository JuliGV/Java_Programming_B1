package day36_inheritance.hidding;

import day36_inheritance.finalExample.Main;

public class CallMethods {
    public static void main(String[] args) {
        a obj = new a();

        obj.instanceMethod();
        a.staticMethod();

        b obj2 = new b();
        obj2.instanceMethod();
        b.staticMethod();

    }
}
