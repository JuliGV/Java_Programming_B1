package day36_inheritance.lyft;

public class Lyft {
    String driver;

    public Lyft(String driver){
        this.driver = driver;
    }


    public double calculate (int miles){
        return miles*9.75;
    }
}
