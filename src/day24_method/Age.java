package day24_method;

public class Age {
//     make a method that accept the number and calculates how old are you
    public static void calculateAge (int bornYear){
        int currentYear = 2023;
        int yourAge = currentYear - bornYear;
        System.out.println("You are "+yourAge);
    }

    public static void calculateAge (int bornYear,int currentYear ){// with 2 arguments
        int yourAge = currentYear - bornYear;
        System.out.println("You are "+yourAge);
    }



    public static void main(String[] args) {
        calculateAge(1993);
        calculateAge(1993,2023);
    }


}
