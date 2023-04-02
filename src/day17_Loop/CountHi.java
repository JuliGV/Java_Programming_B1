package day17_Loop;

public class CountHi {
    public static void main(String[] args) {

        String sen = "jdhgfhjhijdbdhjhijdhfjhi";

        int counthi = 0;


        for (int i = 0; i < sen.length(); i++) {

            if (sen.charAt(i) == 'h' && sen.charAt(i+1) == 'i') {
                counthi++;
            }

        }
        System.out.println("The sentence contains hi :" + counthi);
    }
}
