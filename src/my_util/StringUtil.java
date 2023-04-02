package my_util;

public class StringUtil {
    /**
     * This method made by Loopcamp Batch
     * the methodaccept the string and retorn th revers String
     */

    public static String reversStr (String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            reversed+=str.charAt(i);

        }
        return reversed;
    }


}
