package day39_a_polimorphism.clothes;

public class Store {
    public static void main(String[] args) {
        //put all

        // referens itself
        Tshirt t1 = new Tshirt();
        t1.wear();

        Clothes t2 = new Tshirt();
        t2.wear();
        // because we dont have relation between

        //HasHood t3 = new Tshirt();

       Jacket j = new Jacket();
       j.wear();
       j.putHoody();

       Clothes j2 = new Jacket();
       j2.wear();
       //j2.putOnHoody();

        HasHood j3 = new Jacket();
        //j3.wear();
        j3.putHoody();

        HasHood j4 = new Jacket();

        Object o = new Jacket();
        //o.wear();
        //o.putOnHoody();



    }
}
