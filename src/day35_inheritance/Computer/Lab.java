package day35_inheritance.Computer;

public class Lab {
    public static void main(String[] args) {
        Windows comp1 = new Windows(512);
         Mac  comp2 = new Mac (256);
         Linux comp3 = new Linux(1);
        System.out.println(comp3.os);

    }
}
