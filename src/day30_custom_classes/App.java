package day30_custom_classes;

public class App {
    String name;
    double version;
    boolean isFree;

    public void run(){
        System.out.println(name+" is runing");

    }
    public void update(){
        System.out.println(name+" is updeting");
        version+=0.1;
    }
}
