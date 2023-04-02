package day16;

public class MethoChaning {
    public static void main(String[] args) {
        String word ="   Java is a greate langluage";

        word = word.trim();
        System.out.println(word);
        word = word.substring(0,word.indexOf(" "));
        System.out.println(word);
        System.out.println("---------------");

        word ="   Java is a greate langluage  ";
        word = word.trim().substring(0,4).toLowerCase();
        System.out.println(word);

    }
}
