package day24_office_hours;

public class Car {
    // make a method that prints out "Unlocking the car

    public static void unlockCar (){
        System.out.println("Unlocking the car");

    }
    // declair the method that prints out "Opening a door"

    public static void openDoor(){
        System.out.println("Open door");
    }
    //declare a method that prints "Getting in the car" \ "Closing the door"

    public static void getinCar (){
        System.out.println("Getting in the car");
        System.out.println("Closing the door");
    }
    // declair a method that prints couple statments for getting ready

    public static void getReadyToGo(){
        System.out.println("Putting seatbelt");
        System.out.println("Cheking mirrors");
        System.out.println("Put a music on");
        System.out.println("Put on a navigation");
    }
    // declair the method that starts the car

    public static void startCar(){
        System.out.println("Starting the car");
    }
    // declair the method for driving

    public static void getReady(){
        System.out.println("Putting gear into drive mod");
        System.out.println("Start driving");


    }
    public static void startToDrive(){
        unlockCar();
        openDoor();
        getinCar();
        getReadyToGo();
        startCar();
        getReady();

    }

    public static void main(String[] args) {
        startToDrive();
        System.out.println("---------");
        openDoor();


    }
}
