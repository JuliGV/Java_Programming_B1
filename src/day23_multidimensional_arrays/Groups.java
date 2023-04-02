package day23_multidimensional_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String [] [] groups = new String [3][];// first--> [3] num of Arrays,  second--> [] - number of elements
        System.out.println(Arrays.deepToString(groups));

       String [] groupOne = {"Ilgar","Tamara"};
       groups[0] = groupOne;
        System.out.println(Arrays.deepToString(groups));

        String [] groupTwo = {"Ruslan","Melek"};
        groups [1] = groupTwo;
        System.out.println(Arrays.deepToString(groups));

        String [] groupThree = {"Yuliia","Nazarcat"};
        groups [2] = groupThree;
        System.out.println(Arrays.deepToString(groups));

        for (String [] each :groups) {
            for (String  eachElement :each) {
                System.out.println(eachElement);

            }
            

        }



    }
}
