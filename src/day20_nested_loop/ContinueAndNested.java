package day20_nested_loop;

public class ContinueAndNested {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {///outerloop

            if (i==1){
                continue;
            }
            System.out.println("i: "+i);

            for (int j = 0; j < 3; j++) {//innerloop
                System.out.println("j: "+j);

            }

        }
    }
}
