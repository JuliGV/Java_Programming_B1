package day17_Loop;

public class PrintEachChar {
    public static void main(String[] args) {
        String str = "java";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//
//        }

        for (int i = 0; i < 4; i++) {
            System.out.println(str.charAt(i));

        }
    }
}
