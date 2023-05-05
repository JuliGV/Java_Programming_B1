package day38_abstraction.interface_methods;

public class MacBookPro implements Mac {
    @Override
    public void turnOn() {
        System.out.println("mac is turn on");

    }

//    @Override
//    public void faceTime() {
//        Mac.super.faceTime();
//    }



}



    class Runner {
        public static void main(String[] args) {
            System.out.println(Mac.NAME);
            System.out.println(Mac.OS);

            // not good practice because anything static belongs to the class
            System.out.println(MacBookPro.NAME);
            Mac.company();

            MacBookPro mc = new MacBookPro();
            mc.turnOn();
            mc.faceTime();




    }
}
