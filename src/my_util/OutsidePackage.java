package my_util;

import day33_encapsulation.AcceserModifiers;

public class OutsidePackage {
    public static void main(String[] args) {
        AcceserModifiers obj = new AcceserModifiers();
        System.out.println(obj.a);
//        System.out.println(obj.b);// because is a default, only same package
//        System.out.println(obj.c);//because is a private
//        System.out.println(obj.z); private
//        System.out.println(obj.y); private and static need to reach with Class name
        //System.out.println(obj.z); private
        //System.out.println(obj.y); access modifier is default it is accesseble only in the same package
    }
}
