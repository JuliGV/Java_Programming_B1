package day36_inheritance.hidding;

public class b extends a{
    @Override
    public void instanceMethod(){
        System.out.println();
        instanceMethod();

    }
    public static void staticMethod(){
        System.out.println("Static method from child class");
        //instanceMethod(); ONLY STATIC

    }
}
