package day12_swwich_statment;

public class MaleOrFemale {
    /*
    if the gender male
    M,m
    if its Female
    F,f

     */
    public static void main(String[] args) {
        char letter = 'm';

        switch (letter){
            case 'm':
            case'M':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.println("Not valid");

        }
    }
}
