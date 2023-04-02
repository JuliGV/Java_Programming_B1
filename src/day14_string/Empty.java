package day14_string;

public class Empty {
    public static void main(String[] args) {
        String word1 = "last minutes";
        System.out.println(word1.isEmpty());//false

        word1 ="";
        System.out.println(word1.isEmpty());//true;
        System.out.println(word1.isBlank());//true;

        word1 = "   ";
        System.out.println(word1.isEmpty());//fals --> space is a character
        System.out.println(word1.isBlank());//true; because for blank don't read the spaces word1 = "   ";

        word1 = "  y ";
        System.out.println(word1.isEmpty());//fals 
        System.out.println(word1.isBlank());//false;
    }
}
