package day24_method;

public class NumberWords {
    public static int numWords (String sentence){
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i)==' '){
                count++;
            }

        }
        return count+1;

    }

    public static boolean everOrOddWords (int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

        // return num % 2 == 0 ? true : false;
    }

    public static void main(String[] args) {
       int numsWords = numWords("Today is Saturday");
        System.out.println("I have total "+numsWords);
        System.out.println("The total number is even: " + everOrOddWords(numsWords));
    }
}
