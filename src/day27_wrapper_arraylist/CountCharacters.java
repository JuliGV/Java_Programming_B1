package day27_wrapper_arraylist;
/*

    given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

        aP3d572&*jd@jdJU

    Character.isUpperCase(char) --> checks if a char is uppercase
    Character.isLowerCase(char) --> checks if the char is lowercase
    Character.isDigit(char) --> checks if the character is a number

 */

public class CountCharacters {

    public static void main(String[] args) {

        System.out.println();
        String s = "aP3d572&*jd@jdJU";

        int lowerCase = 0, uppeCase=0,digits = 0, other = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))){
                uppeCase++;
            }else if (Character.isLowerCase(s.charAt(i))){
                lowerCase++;
            }else if (Character.isDigit(s.charAt(i))){
                digits++;
            }else{
                other++;
            }

        }
        System.out.println(uppeCase);
        System.out.println(lowerCase);
        System.out.println(digits);
        System.out.println(other);

    }



}
