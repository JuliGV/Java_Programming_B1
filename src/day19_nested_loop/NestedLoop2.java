package day19_nested_loop;

public class NestedLoop2 {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            if (i==1){
//                System.out.println("Color is red");
//            }else if (i==2){
//                System.out.println("Color is black");
//            }else if (i==3){
//                System.out.println("Colors is blue");
//            }
//
//        }


//        for (int i = 0; i < 5; i++) {
//            System.out.println("A"+i);
//            for (int j = 0; j < 5; j++) {
//                System.out.println("B"+j);
//
//            }
//
//        }


        String str = "java";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(str.charAt(i));
            }


        }
        System.out.println();
    }
}
