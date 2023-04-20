package day30_custom_classes;

public class UsingItems {
    public static void main(String[] args) {
        Item fruit = new Item();
        System.out.println(fruit);// if you vrite this line and you dont have toString methid in item class it will show hashcode( memory location)

        fruit.name = "Apple";
        fruit.price = 3.4;

        Item fruit2 = new Item();
        fruit2.name = "Banana";
        fruit2.price = 78.9;

        System.out.println(fruit2);


    }
}
