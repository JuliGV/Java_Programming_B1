package day36_inheritance.hidding;

public class Person {
    String name = "Yuliia";

}
class Child extends Person{
    String name = "Oksana";


}
class Run {
    public static void main(String[] args) {
        Person one = new Person();
        System.out.println(one.name);

        Child two = new Child();
        System.out.println(two.name);

    }
}