package day33_static;

public class Iphone {
    String model;
    double price;
//    static  String company = "Apple";
//    static String OS = "IOS";
//    static boolean appleDay = false;

    static  String company;
    static String OS;
    static boolean appleDay;

    static {
        company = "Apple";
        OS =  "IOS";
        appleDay = false;


    }

    public Iphone(String model, double price){
        this.model = model;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
