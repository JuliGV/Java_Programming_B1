package day24_method;
/*
/*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

    Ex:

        {"James", "is", "back"}
        {"he", "was", "never", "gone"}
        {"methods", "tomorrow"}

    Output:
        ssk
        esre
        sw

 */


public class LastCharacter {
    public static void main(String[] args) {

        int [][]num;// we declare 2D Array
        //int [][]num = new int [][];  you cant do like this

        String [] [] names = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"} };

        for (String [] each:names) {
            for (String eachElement : each) {
                String lastChar = eachElement.substring(eachElement.length()-1);
                System.out.print(lastChar);
            }
            System.out.println();

        }




        



    }
}
