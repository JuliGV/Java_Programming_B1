package day38_abstraction.interface_methods;

public interface Mac {
    String NAME = "Mac";// By DEFAUL,PUBLIC,STATIC,FINAL

    String OS = "IOS";

    void turnOn();// //public abstract

    // how create method with implementation

    static void company(){// public// can be overrided
        System.out.println("Apple");
        System.out.println("LA");
        System.out.println("New release in November");
    }

    default void faceTime(){// public // can be overrided
        System.out.println("Writing");
        System.out.println("Calling someone");
    }




}
