package day32_custom_classes;

public class ChainingExample {
    public ChainingExample(){
        System.out.println("First");
    }
    public ChainingExample(int i){
        this();
        System.out.println("Second");
    }
    public ChainingExample(String s){
        this(12);
        System.out.println("Third");
    }
    public ChainingExample(double d){
        this("test");
        System.out.println("Four");
    }
}
