package day07_relation_operation;

public class AgeGrupe {
    public static void main(String[] args) {
        /*

        declare and assign an ageOfPersone variable

        check if the person is a kid

        ageOfPersone - up 13 (include 13)

        check if the person is adult

        ageOfPersone - higher 39 or higher


         */

        int ageOfPersone = 40;
        boolean isKid = ageOfPersone <=13;// value has to be true or false
        System.out.println("You are a kid? "+isKid);

        boolean isAdult = ageOfPersone>30;
        System.out.println("You are an adult?"+isAdult);
    }
}
