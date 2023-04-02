package day20_nested_loop;

import java.util.Scanner;

public class FinRainRange {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter is number: ");
        int number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i%3==0 && i%5==0){
                System.out.println(i+" is finra");
            }else if (i%3==0){
                System.out.println(i+" is Ra");
            }else if (i%5==0){
                System.out.println(i+" is Fin");

            }

        }
//        int num = 5;    // 1, 2, 3, 4, 5,
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number to check each up to that number: ");
//        int userNum = input.nextInt();
//
//        for (int i = 1; i <= userNum; i++) {  //10
//            String str = "";
//
//            if (i % 3 == 0) {                //
//                str+= "FIN";
//            }
//
//            if (i % 5 == 0) {               //RA
//                str += "RA";
//            }
//
////
////            if (str.isEmpty()) {
////                System.out.println(i);
////            } else {
////                System.out.println(str + " ");   // 1, 2, 3, 4, 5
////            }
//
//
//            System.out.println(str.isEmpty() ? i : str  );
//            //                 boolean       ? true : false

//        }

    }

}
