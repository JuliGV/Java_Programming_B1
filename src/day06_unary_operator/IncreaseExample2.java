package day06_unary_operator;

public class IncreaseExample2 {

    public static void main(String[] args) {
        int age =20;

        System.out.println(age--);//20 ---but value change ---> age -1 = 19
        System.out.println(age );//19
        System.out.println(++age);//20 because if we written ++age it pre increment and it change value before running statment
        System.out.println(--age);//19

        --age; // - 18
        System.out.println(--age);// 17
    }
}
