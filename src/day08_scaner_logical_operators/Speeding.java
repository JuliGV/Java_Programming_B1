package day08_scaner_logical_operators;

public class Speeding {

    /* declare 3 variables
    Current speed
    Speed limit
    speeding
    print
    "Is this person speeding? true or false

     */
    public static void main (String [] args){

        int currentSpeed = 60 ;
        int speedLimit = 65;
       boolean isSpeeding = currentSpeed<=speedLimit;

        System.out.println("Is this person speeding?"+isSpeeding);



    }
}
