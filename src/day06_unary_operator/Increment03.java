package day06_unary_operator;

public class Increment03 {

    public static void main(String[] args) {


        int i =5;
        int z = i++;
        // 1 step z=5;
        // 2 step i = i+1;
        //int z = i++; it means that we assign i + 1 but after run statmens
        // but we dont reassign z
        System.out.println(i);//6
        System.out.println(z);//5

        int a = 10;
        int b = a+1;
        //

        System.out.println(a);// 10
        System.out.println(b);//11

        // int b = a+1; it means that we assign b value a+1, bur a not change;


        int j = 10;
        int l = ++j;
        // we assign ++j before run statmens

        System.out.println(j);
        System.out.println(l);

        int c =++a;
        System.out.println(c);

        int d = a++;
        System.out.println(d);
        System.out.println(a);
        System.out.println(a);

    }
}
