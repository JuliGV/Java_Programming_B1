package day20_nested_loop;
/*


 */

public class DuplicatCharacters {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            if (unique.contains(""+str.charAt(i))){
                continue;
            }

            for (int j = 0; j < str.length(); j++) {


                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count >1){
                System.out.print(str.charAt(i));

            }unique+=str.charAt(i);

        }
    }
}
