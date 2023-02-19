package day05_variables;

import javax.sound.midi.Soundbank;

public class CharExamples {
    public static void main(String[] args) {

        // Let's assigne characters type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';
//        bigger size
//       -> int number = 9;
//
//        System.out.println(numberOne);
//        System.out.println(number);

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        // from ASCII a=97,Z=90

        System.out.println(letterOne+letterTwo);
        System.out.println("resual: " + letterOne + letterTwo);
        System.out.println(letterOne + letterOne +" String " + letterOne + letterTwo);
        System.out.println("String" +letterOne + letterOne +" String " + letterOne + letterTwo);

        // if we have a String in our action anything after string will be CONCATENATION
        //ANYTHING BEFORE FIRS STRING will be addition

        char letterThree = 65;
        System.out.println(letterThree);

        //this is invalid because it's two characters
        //char letterFour = '65';


    }
}
