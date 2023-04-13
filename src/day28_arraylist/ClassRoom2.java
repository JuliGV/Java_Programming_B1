package day28_arraylist;

import java.util.ArrayList;

public class ClassRoom2 {
    public static void main(String[] args) {
        ArrayList<String> group = new ArrayList<>();
        System.out.println(group);
        group.add("Gunel");
        System.out.println(group);
        group.add(0,"Yuliia");
        System.out.println(group);


        // method overloading is happening
        group.add("Vlad");
        group.add(0,"Petro");

    }
}
