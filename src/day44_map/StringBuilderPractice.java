package day44_map;
/*
String builders is an object representation of sequence of character
   - StringBuilder is mutable - can be modified
   - It is not synchronized - not thread-save
   - We can Only create object with NEW keyword
   - it is coming fron java.lang package
 */

public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        stringBuilder.append(2);
        System.out.println(stringBuilder);
        stringBuilder.append("olleh");
        System.out.println(stringBuilder);

        stringBuilder.delete(0,5);
        System.out.println(stringBuilder);

        stringBuilder.insert(1,"test");// add char from index
        System.out.println(stringBuilder);

        stringBuilder.replace(5,7,"---");
        System.out.println(stringBuilder);

    }

}
