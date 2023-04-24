package day33_static;

public class TestBuyStores {
    public static void main(String[] args) {
        System.out.println(BestBuy.heardQuoter);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.computer);


        BestBuy store1 = new BestBuy("FairFox");
        System.out.println(store1.location);
        System.out.println(store1.computer);
        store1.computer -= 10;
        System.out.println(store1.computer);
        BestBuy store2 = new BestBuy("Monclair");
        System.out.println(store2.computer);

        store2.location = "New York";
        System.out.println(store1.location);
        System.out.println(store2.location);

        System.out.println();

        store2.day = "Monday";
        System.out.println(BestBuy.day);
        System.out.println(store1.day);
        System.out.println(store2.day);

        BestBuy.day = "Weekend";
        System.out.println(BestBuy.day);
        System.out.println(store1.day);
        System.out.println(store2.day);

        //static method I can call with class name of object but proper use Class name
        BestBuy.reStock();
        System.out.println(BestBuy.computer);
        store1.reStock();

        // can call instans method by class name
        //BestBuy.openStore();


        store1.openStore();
        store2.openStore();
    }

}
