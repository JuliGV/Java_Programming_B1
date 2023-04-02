package day06_a_arithmetic_operators;

public class BasicCalculator {

    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4;

      //  double addition = 4 + 5; // hard coded

        double addition = num1 +num2; // dynamic


        double subtraction = num1 - num2;
        double multiplication  = num1 * num2;
        double dividion  = num1 * num2;
        double reminder  = num1 % num2;

        System.out.println(num1 + "+" + num2+"="+addition);
        System.out.println(num1 + "-" + num2+"="+subtraction);
        System.out.println(num1 + "*"+ num2+"="+multiplication);
        System.out.println(num1 + "/"+ num2+"="+dividion);
        System.out.println(num1 + "%"+ num2+"="+reminder);

        /*
        10/3 = 3.33333
        10%3 = 1
        10-9 = 1

        5/4=1.25
        5%4 = 1
        5-4 = 1

         */

        System.out.println(num1 + "+" + num2 +"="+ num1+ num2);

        // 5+4 = 54
        System.out.println(num1 + "+" + num2 +"="+ (num1+ num2));
        // firs java do in parentheses-> result 5+4=9

        System.out.println(num1 + num2+ "="+ num1+ num2);
        // result 9=9

    }
}
