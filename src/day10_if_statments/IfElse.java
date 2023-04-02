package day10_if_statments;

public class IfElse {

    public static void main(String[] args) {
        char letter = 'A';

//        if (letter>='A'&& letter<='z'){
//
//            System.out.println("Uppercase");
//        }else {
//            System.out.println("Lowercase");
//        }
//    }
    if (letter>='A'&& letter<='Z'){

        System.out.println("Uppercase");
    }else if (letter>='a'&& letter <='z'){

        System.out.println("Lowercase");}
        else {
            System.out.println("It is not a letter");
        }
}
}

