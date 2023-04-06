package day24_method;

public class MyFirstMethod {

    public static void searchTheWord(String word){
        System.out.println("go to etsy");
        System.out.println("Put word: "+word);
        System.out.println("Click enter");
    }
    public static void sayHello (){// print 1 time
        System.out.println("Hello Loop");
    }

    public static void sayHello50(){//print 50 times
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello Loop");

        }
    }

    public static void main(String[] args) {
        sayHello();//method 1
        sayHello50();//method 2
        searchTheWord("Cable");


    }
}
