package day14_string;

public class RemoveSpace {
    public static void main(String[] args) {
        String day = "    Thursday   ";

        int numberOfCharBeforeTrim = day.length();
        System.out.println(numberOfCharBeforeTrim);

        day = day.trim();
        int numberAfter = day.length();

        System.out.println(numberAfter);

        String msg = "  Today we learned good String methods";
        System.out.println(msg.startsWith("Today"));

        msg = msg.trim();
        System.out.println(msg.startsWith("Today"));


    }
}
