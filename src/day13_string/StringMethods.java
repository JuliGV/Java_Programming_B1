package day13_string;

public class StringMethods {
    public static void main(String[] args) {
        String name = "James";

        //how to compare 2 Strings

        System.out.println(name.equals("James"));//true

        System.out.println("cat".equals("dog"));//false

        System.out.println(name.equals("james"));//false

        // how to compare 2 Strings ignoring case

        System.out.println(name.equalsIgnoreCase("JAMES"));// true

    }
}
