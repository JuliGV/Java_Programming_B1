package day07_relation_operation;

public class SignType {

    /*

    declare amd assign a number
    I want to know the sign of the number
    If the number is +
    If the number is -
    If the number is 0
     */

    public static void main(String[] args) {

        int number = 0;

        boolean num = number >=0;
        boolean numNeg = number <=0;
        boolean num0 = number ==0;
        System.out.println("Number is bigger than 0 " + num+ "\nNumber is smaller than 0 "+numNeg+"\nNumber is equal 0 " + num0);


    }
}
