package day10_if_statments;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 4;
        String evenOrOdd;
        if (a%2==0){
            evenOrOdd = "even";

        }else {
            evenOrOdd = "odd";

        }
        System.out.println(evenOrOdd);

        a = 8;
        String evenOrOdd2 = (a%2==0) ? "Even":"Odd";
        System.out.println(evenOrOdd2);

    }
}
