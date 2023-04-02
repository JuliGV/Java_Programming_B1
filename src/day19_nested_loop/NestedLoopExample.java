package day19_nested_loop;

public class NestedLoopExample {
    public static void main(String[] args) {


//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello Loop Academy");
//
//        }

        for (int i = 0; i < 2; i++) {////outer Loop
            System.out.println("This is number "+i+" iteration");

            for (int j = 0; j < 5; j++) {// inner loop

                System.out.println("Hello Loop Academy");

            }

        }
    }
}
