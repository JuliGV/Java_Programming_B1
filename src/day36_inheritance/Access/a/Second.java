package day36_inheritance.Access.a;
//different class but same package
public class Second {
    public static void main(String[] args) {
        //Second obj = new Second();
        First obj = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
       // System.out.println(obj.four); not accesseble because it is PRIVATE, IT ACCESSEBLE OPNLY IN THE SAME CLASSS
        // CAN ACCESS WITH GETTER AND SETTER

    }
}
