package day15_string;

public class MergeString {
    public static void main(String[] args) {
        String a ="abc";
        String b = "xyz";

        String merge1 = a+b;
        System.out.println(merge1);

        String merge2 = ""+ a.charAt(0)+a.charAt(1);
        System.out.println(merge2);

        merge2+=a.charAt(2);
        merge2 += a.charAt(1);
        merge2 += a.charAt(0);
        merge2 += b.charAt(0);
        System.out.println(a);

    }
}
