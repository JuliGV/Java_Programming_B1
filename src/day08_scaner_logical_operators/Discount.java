package day08_scaner_logical_operators;

public class Discount {
    /*declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter

             Do you get a discount?
                Must be a weekend day and you must be one of the given professions

     */

    public static void main(String[] args) {

        boolean isItTheWeekend = true;
        boolean areYouATeacher = true;
        boolean areYouAPoliceOfficer = false;
        boolean areYouAFirefigther = false;

        boolean discount = isItTheWeekend && (areYouATeacher || areYouAPoliceOfficer || areYouAFirefigther);

        System.out.println("Do you get a discount? "+ discount);



    }
}
