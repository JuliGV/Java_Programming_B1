package day31_custom_class;

public class Phone {
    String name;
    String brand;
    int memory;
    double version;

    public Phone(String name){
        this.name = name;
    }
    public Phone (String name,String brand){
        this.name = name;
        this.brand = brand;
    }
    public Phone (String name,String brand, int memory,double version){
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;


    }

    @Override
    public String toString() {
        return "Phone " +
                "\nname " + name  +
                "\nbrand " + brand  +
                "\nmemory " + memory +
                "\nversion " + version;
    }
}
