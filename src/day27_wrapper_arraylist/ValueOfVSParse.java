package day27_wrapper_arraylist;

public class ValueOfVSParse {
    public static void main(String[] args) {
        String s = "30";
        int seconds1 = Integer.parseInt(s); // from String to primitive
        Integer seconds3 = Integer.valueOf(s);

        Integer i = Integer.valueOf("5");
        System.out.println("Total: "+(i+2));
    }
}
