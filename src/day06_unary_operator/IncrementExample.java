package day06_unary_operator;

public class IncrementExample {

    public static void main(String[] args) {
        int x = 0;
        System.out.println(x);//0

        x=4;
        System.out.println(x);//4


        x=x+1;

        System.out.println(x);//5




        x++;//post increment x=x+1; ++ --> increment

        System.out.println(x);//6

        ++x;
        System.out.println(x);//7 the same than privesly

        System.out.println(x++);//7 statment us run first because it is a post increment
        System.out.println(x);//8
        System.out.println(++x);//9

        int num = 0;
        //pre- increment
        // increses the value by 1 (increment valueby 1  before statment is run)
        //Syntex -> ++num
        // post-increment
        //increments value by 1 after the statment is run
        // Syntax: num++

        //pre- decrement
        // decreses the value by 1 (decrement valueby 1  before statment is run)
        //Syntex -> --num
        // post-decrement
        //decrements value by 1 after the statment is run
        // Syntax: num--




    }
}
