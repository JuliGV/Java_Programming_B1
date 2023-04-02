package day14_string;

public class Recapmethods {
    public static void main(String[] args) {

        String str = "loop"; // make by literals
        String str2 = new String ("loop"); // made string by new keyword

        System.out.println("Compare with =="+(str==str2));//false

        System.out.println("Compare with.equals()"+(str.equals(str2)));//true

        System.out.println("Compare with =="+(str.equals("pen")));//false
        System.out.println("Compare with =="+(str.equals("looP")));//false because difference charecters
        System.out.println("Compare with.equals()"+str.equalsIgnoreCase("LooP"));//true

        String word1 ="Loop academy";
        System.out.println("To upper case: "+word1.toUpperCase());
        String word2 ="LOOP ACADEMY";
        System.out.println("To lower case: "+word2.toLowerCase());






    }
}
