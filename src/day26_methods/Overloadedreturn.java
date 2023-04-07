package day26_methods;

public class Overloadedreturn {
    public static void method (){
        System.out.println("Just printing by default");
    }


    // return type must be different does not mean that they are overloaded
    //changing the return type does not mean we overload the method

    public static int method (int num){
        System.out.println("Just printing by default");
        return 1;
    }
}
