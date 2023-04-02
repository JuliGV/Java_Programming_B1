package day15_string;

public class CharMethod {
    public static void main(String[] args) {
        String word = "Loop";// 4 characters
        //             0123
        //difference between length; and length();!!!!!!!!

        System.out.println(word.length());
        // method wich retorns us a char a given Index - charAt(int);

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        // System.out.println(word.charAt(4));

        String longWord = "jgjhgjghgjhg";
        System.out.println(longWord.length());

        int lastIndex = longWord.length()-1;
        System.out.println(longWord.charAt(lastIndex));


        String words = "Yuliia Kolisnyk";

        int wholeLetters = words.length()-1;

        System.out.println(words.charAt(wholeLetters));


    }
}
