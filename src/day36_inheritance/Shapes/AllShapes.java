package day36_inheritance.Shapes;

public class AllShapes {
    public static void main(String[] args) {
        Squer obj1 = new Squer(23.6);
        System.out.println(obj1);
        System.out.println(obj1.calculateArea());
        System.out.println(obj1.perimetr());
        System.out.println();

        Circule obj2 = new Circule(1.5);
        System.out.println(obj2);
        System.out.println(obj2.calculateArea());
        System.out.println(obj2.perimetr());

    }
}
