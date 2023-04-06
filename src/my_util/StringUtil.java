package my_util;

public class StringUtil {
    /**
     * This method made by Loopcamp Batch
     * the methodaccept the string and retorn th revers String
     */

    public static String reversStr(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }
        return reversed;
    }

    /**
     * This method made by Loopcamp Batch
     * This method accept a String parametr and puts it in a format
     * Ex:
     * The format will be like this
     * <p>
     * First letter Uppercase and rest is in lower case
     * <p>
     * <p>
     * Then retorns a String in formatted way
     */
    public static String fixFormat (String str) {
        String fixed = str.trim();
        fixed = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return fixed;
    }

    /**
     This method accept a String with multiple words and converted it to camelCase
     */

    public static String cameCase (String str){

        String [] arr = str.split(" ");
        String result = "";

        for (String each:arr) {
            result +=(each.charAt(0)+"").toUpperCase()+each.substring(1).toLowerCase();

        }
        return (result.charAt(0)+"").toLowerCase()+result.substring(1);

    }

    /**
     *
     * This method accept String and char
     * And returns how many times that char exist in the String
     */

    public static int frequencyOfCharacter (String  str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                count++;
            }
        }return count;
    }

    /**
     *
     * This method accept String
     * And return only unique characters as a String
     */

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
