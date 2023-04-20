package day30_custom_classes;
/*
/*

Create a coffee class with these instance variables:
     price, size(oz), brand, types

     ex types: black, cappuccino, latte, mocchiato....

instance methods:

    - make a toString to print all the information of the coffee objects

    - drink(): print: drinking $type of coffee

    - refill(amount in oz): print refilling x oz
        add the number of oz to the total size

 */


public class Coffee {
    double price;
    String size;
    String brand;
    String type;


    @Override
    public String toString() {
        return
                "Price=" + price +
                "\nsize " + size  +
                "\nbrand " + brand  +
                "\ntype " + type;
    }

    public void drink (){
        System.out.println("Drinking "+type+ " type of cpffee");
    }

    public void refill(double amount){
        System.out.println("Refilling amoumt "+amount+ " worth coffee");
        System.out.println("After reffill my total coast is "+(price*amount));



    }
}
