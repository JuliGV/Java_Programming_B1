package day23_multidimensional_arrays;

import java.util.Arrays;

public class ArrayRecap {
    public static void main(String[] args) {
        int [] arr = {20,30,40,50,100};
        int [] arr2 = {187,394,874,76};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Min"+arr[0]);
        System.out.println("Max"+arr[arr.length-1]);

        System.out.println("Min"+arr2[0]);
        System.out.println("Max"+arr2[arr2.length-1]);

        String [] words = {"java","sql","api","softskills"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        String afterjoin = String.join("<<<",words);

        String sentence = "java,sql,api,softskills";
        String [] sentArr = sentence.split("sql");
        System.out.println(Arrays.toString(sentArr));


        String sentenceTwo = "Hello loopes";
        char [] chars = sentenceTwo.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char each:chars) {
            System.out.println((""+each).toUpperCase());

        }


    }
}
