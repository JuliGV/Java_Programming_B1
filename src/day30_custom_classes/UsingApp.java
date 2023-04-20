package day30_custom_classes;

public class UsingApp {
    public static void main(String[] args) {
        App bootcamp = new App();
        // name
        // version
        //run
        //update

        bootcamp.name = "LoopCamp";
        bootcamp.version = 8.8;

        System.out.println(bootcamp.name);
        System.out.println(bootcamp.version);
        bootcamp.run();
        bootcamp.update();

        System.out.println();


        App social = new App();
        social.name = "Instagram";
        social.version = 3.4;

        System.out.println(social.name);
        System.out.println(social.version);
        social.run();
        social.update();

        System.out.println(bootcamp.version);
        System.out.println(social.version);

        new App().run();// we created new object of App class and directly call run(); method, default data is null
    }



}
