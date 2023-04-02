package day11_if_statment;

//import java.util.Scanner;

public class Drive {

    /*
    variable = speed
    and assign int based on the speed limit print the message
    we are in the neighborhood(45)
    above 90 (inclusive)---> You speed limi is requirmet jail
    above (inclusive)--->70 You speed limit requires DL suspension
    above 60(inc) ---> You speed limit requires a ticket
    between 35 and 50(inclusive) --> You speed limit is in the speed range
    below 35 ---> Going to slow or you are stopped
    else ---> not valid input

     */
    public static void main(String[] args) {
        //Scanner input = new Scanner (System.in);
        int speed = -10;

        if (speed >=90){
            System.out.println("You speed limi is requirmet jail");
        }else if (speed>=70){
            System.out.println("You speed limit requires DL suspension");

        }else if (speed>=60){
            System.out.println("You speed limit requires a ticket");
        }else if(speed>=35 && speed<=50){
            System.out.println("You speed limit is in the speed range");
        }else if (speed<35 && speed>=0){
            System.out.println("Going to slow or you are stopped");

        }else{
            System.out.println("not valid input");
        }

    }
}
