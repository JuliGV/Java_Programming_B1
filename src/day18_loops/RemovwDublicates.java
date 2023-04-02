package day18_loops;
/*
Remove Duplicates
    Write a program that can remove duplicates from a String
     Ex:
    Input: abcaabc
    Output: abc
 */

public class RemovwDublicates {
    public static void main(String[] args) {

        String word = "abcbca";
        String unique = "";


        for (int i = 0; i < word.length(); i++) {

            if (!unique.contains(""+word.charAt(i))){
                unique+= word.charAt(i);
            }

        }
        System.out.println(unique);
    }
}
