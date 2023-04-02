package day15_string;

public class MoveFirstWord2 {
    public static void main(String[] args) {
        String str = "One Two";

        String first = str.substring(0,(str.indexOf(" ")));
        String second = str.substring(str.indexOf(" ")+1);

        System.out.println(first+" "+second);


    }
}
