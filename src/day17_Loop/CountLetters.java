package day17_Loop;

public class CountLetters {
    public static void main(String[] args) {

        String word = "aabbcca"; // loop is great.loop is amazing

        char letter = 'a';
        int countOfLetterA =0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter){
                countOfLetterA++;

            }

        }
        System.out.println("Count of letter a is:" + countOfLetterA);

    }
}
