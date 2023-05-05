package day38_abstraction.language;

public class Translator {
    public static void main(String[] args) {
        Turkish tr = new Turkish();
        Spanish sp = new Spanish();

        tr.hi();
        tr.bye();

        sp.hi();
        sp.bye();
    }
}
