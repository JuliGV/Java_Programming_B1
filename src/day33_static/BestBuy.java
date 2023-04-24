package day33_static;

import java.awt.*;

public class BestBuy {

    String location;
    static String heardQuoter = "Richfield, MN,USA";
    static String day = "Sunday";
    static int computer = 100;

    public BestBuy(String location){
        this.location = location;
    }
    // instance method return type void without arguments
    public void openStore (){
        System.out.println("Opening the "+location);

    }

    //statick method except only static variable
    public static void reStock (){
        //System.out.println("Opening the "+location);
        computer = 100;
        System.out.println(computer);

    }
}
