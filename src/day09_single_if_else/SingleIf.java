package day09_single_if_else;

public class SingleIf {
    public static void main(String[] args) {
        //if condition is true print out "Today is Java day"

        if (true) {
            System.out.println("Today is Java day");

        }

        //System.out.println("Today is Java day");

        // maxdays in Feb 28
        int maxumberOfDays = 28;

        if (maxumberOfDays == 28) {
            System.out.println("This month is Feb");
        }
        maxumberOfDays = 30;

        if (maxumberOfDays == 28) {
            System.out.println("This month is Feb");

        }

        int quizeResoult = 50;
        int passRate = 40;
        if(quizeResoult>=passRate){
            System.out.println("Passed the exam");
        }
        System.out.println();

        if(quizeResoult<passRate){
            System.out.println("Falied the exam");


        }

        int year = 2021;
        boolean isCovidYears;

        //if year is equal and bigger than 2020 and less than or equal to 2022 it is true

        isCovidYears = year >=2020 && year<=2022;

        if(isCovidYears){

            System.out.println("it is a covid year");
        }
    }

}
