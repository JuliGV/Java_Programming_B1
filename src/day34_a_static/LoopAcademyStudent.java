package day34_a_static;

import java.util.Arrays;

public class LoopAcademyStudent {
    String name;
    int group;

    // data the same for all students

    static int batchNum;
    static String [] teacher;
    static String schoolName;

    public LoopAcademyStudent(String name, int group){
        this.name = name;// prioritais instance variable over local
        this.group = group;


    }
    static {
        batchNum = 1;
        teacher = new String[]{"Nadir","Feyruz","James","Diana","Dina"};
        schoolName = "Loop Academy";
        printInfo();

    }

    public static void printInfo(){
        System.out.println("School name: "+schoolName);
        System.out.println("Batch number: "+batchNum);
        System.out.println("Instuctors: "+ Arrays.toString(teacher));
    }

    public String toString(){
        return "Loop Academy student: "+
                "\nName: "+name+
                "\nBatch number: "+batchNum+
                "\nGroup number: "+group;
    }


}
