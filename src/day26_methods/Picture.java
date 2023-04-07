package day26_methods;

public class Picture {
    // how about if i have same methodName with either different parameter amount or different data types
    // draw (int a){}
    // draw (double)
    // draw (boolean)
    // draw (int a, double b)

    public static void main(String[] args) {

    }

    public static void draw (){ // non-parameterized method
        System.out.println("Trying to draw");

    }
    public static void draw (String colour){ // this is parameterized method  - this is overloaded method
        System.out.println("Drawing with the "+colour);

    }
    public static void draw (String colour,String colour2){ // this is parameterized method  - this is overloaded method
        System.out.println("Drawing with two different colours: "+colour+" and "+colour2);

    }
    public static void draw (int size){ // this is parameterized method  - this is overloaded method
        System.out.println("Drawing with this size"+size);

    }
//    we can overload with different Parametrs name
    //it has to be different data type
public static void draw (String str,int size){
    System.out.println("Just drawing");


}


}
