package day24_method;

public class VoidVsRetorn {
    public static void sayHello(){
        System.out.println("Hello");

    }

    public static String saybye(){
        return "Bye";

    }

    public static void main(String[] args) {
        sayHello();
        saybye();/// this is just retorn String
        System.out.println("-----------");
        System.out.println(saybye());//retorn bye
        String result = saybye()+" Yuliia";
        System.out.println(result);
    }
}
