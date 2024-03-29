package day28_arraylist;
/*
HTML Generator

Given a String in the following format take the number part of the generator the html tags.
Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

Ex:
    Input:
        div^2
    Output:
        <div></div> <div></div>

Ex:
    Input:
        li^3
    Output:
        <li></li><li></li><li></li>
 */

import java.util.Arrays;

public class HTMLGenerator {
    public static String htmlGenerator (String str){
        String html ="";
        String [] parts = str.split("\\^");
        int nums = Integer.parseInt(parts[1]);
        for (int i = 0; i < nums; i++) {
            html +="<"+parts[0]+"></"+parts[0]+">";

        }

        return html;
    }

    public static void main(String[] args) {

        System.out.println(htmlGenerator("li^3"));
        System.out.println(htmlGenerator("div^2"));
    }

}
