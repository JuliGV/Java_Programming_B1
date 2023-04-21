package day32_custom_classes;
/*
// name, quantity, unit price, total price
/*
- constructor

    - create a constructor that creates a Food object with the name

    - create a constructor that creates a Food object with the name and quantity

    - create a constructor that creates a Food object with the name, quantity, and unit price
        -> call calculatePrice() method here
- method:

    - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

    - toString()
        print all the Food information

*/
public class Food {
    String name;
    int quality;
    double unitPrice;

    double totalPrice;


    public Food (String name){
        this.name = name;

    }
    public Food (String name, int quality){
        this(name);
        this.quality = quality;

    }
    public Food (String name, int quality, double unitPrice){
        this(name,quality);
        this.unitPrice = unitPrice;
        calculatePrice();
    }
    public void calculatePrice(){
        totalPrice = quality*unitPrice;
    }

    @Override
    public String toString() {
        return "Food " +
                "\nName " + name +
                "\nQuality " + quality +
                "\nUnit Price " + unitPrice +
                "\ntotalPrice " + totalPrice;
    }
}
