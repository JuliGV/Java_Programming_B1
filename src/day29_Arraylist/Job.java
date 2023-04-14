package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Job {
    public static void main(String[] args) {
        ArrayList<String> jobs = new ArrayList<>();
        //jobs.addAll(Arrays.asList("SDET","Quality Engineer","Automation","Quality Assurance"));
        jobs.addAll(Arrays.asList("SDET","QE","QA","BA","PO","PM","SM"));
        System.out.println("Original: "+jobs);
        ArrayList<String>job1 = new ArrayList<>(jobs);


        System.out.println(job1);
        job1.removeAll(Arrays.asList("BA","PO","PM"));
        System.out.println(job1);


        //retainAll();
        ArrayList<String> job2 = new ArrayList<>(jobs);
        job2.retainAll(Arrays.asList("SDET","QE","QA","BA"));
        System.out.println(job2);



        //containsAll();

        ArrayList<String> job3 = new ArrayList<>(jobs);
        boolean result = job3.containsAll(Arrays.asList("SDET","QE"));
        System.out.println(result);









    }
}
