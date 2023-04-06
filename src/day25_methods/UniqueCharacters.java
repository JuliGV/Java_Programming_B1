package day25_methods;
/*
Unique Characters

create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

Hint: use your frequency method to do some of the work

Ex:
Input:
    aaaaabcccdeeff

Output:
    bd
 */

import my_util.StringUtil;

public class UniqueCharacters {

    public static String uniqueCharacters (String str){

        String check = "";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            if (!check.contains(""+str.charAt(i))){
                int count = StringUtil.frequencyOfCharacter(str,str.charAt(i));
                check +=str.charAt(i);
                if (count==1){
                    unique+=str.charAt(i);
                }

            }
        }return unique;
    }

}
