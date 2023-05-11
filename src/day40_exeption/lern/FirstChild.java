package day40_exeption.lern;

public class FirstChild {
    public static void main(String[] args) {
        System.out.println("First line");
        String word = "Java";
        // runtime exeption

        try{
            System.out.println(word.charAt(10));
        }catch (Exception e){
            System.out.println("Exeption handled");

        }

        System.out.println("Last line");
    }
}
