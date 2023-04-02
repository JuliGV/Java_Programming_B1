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


}
