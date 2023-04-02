package day18_loops;

public class BrainChing {
    public static void main(String[] args) {
//        for (int i = 0; i <=10 ; i++) {
//            System.out.print(i +" ");
//
//        }


//
//        for (int i = 0; i <=10 ; i++) { //// 5
//
//            if(i==5) {
//                System.out.print(i + " ");
//                break;
//            }
//
//        }

//        for (int i = 0; i <=10 ; i++) { ///1 2 3 4 5
//
//            System.out.print(i + " ");
//            if(i==5) {
//                break;
//            }
//
//        }

//        for (int i = 0; i <=10 ; i++) { ///// 0
//
//                System.out.print(i + " ");
//                break;
//
//
//        }


//        for (int i = 0; i <=10 ; i++) { //// 1234  without 5   678910
//
//            if(i==5) {
//
//                continue; // after continue java come back to loop
//            }
//            System.out.print(i + " ");
//
//        }


        for (int i = 0; i <=10 ; i++) { //// only even number

            if(i%2==1) {// true odd number

                continue; // after continue java come back to loop
            }
            System.out.print(i + " ");

        }

    }

}
