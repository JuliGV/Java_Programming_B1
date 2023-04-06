package day24_method;

public class MathMethods {
    /*
    +
    -
    /
    *
     */

    public static void add (int num1,int num2){
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }

    public static void minus (double num1,double num2){
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }
    public static void divide (double num1,double num2){
        if (num2==0){
            System.out.println("We can not divide by 0");
        }else {
            System.out.println(num1+" / "+num2+" = "+(num1/num2));
        }
    }

    public static void main(String[] args) {
        add(43,87);
        minus(9.8,7.9);
        minus(30,15);
        divide(87,98);
        divide(76,0);
    }
}
