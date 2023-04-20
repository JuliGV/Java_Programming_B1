package day30_custom_classes;

public class AllPeople {
    public static void main(String[] args) {
        Person person1 = new Person();//object of person class
        Person person2 = new Person();

        person1.name = "Yuliia";
        person2.name = "Natalia";

        System.out.println(person1.name);
        System.out.println(person2.name);

        System.out.println(person1.lastName);/// null --> because we don't have ane value

        // assigned the instans variable with values
        person2.lastName = "Kolisnyk";
        person2.age = 20;
        person2.height = 1.70;
        person2.isMerried = true;



        // print each object own copy of the name
        System.out.println(person2.lastName);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMerried);

        person1.test();
        person2.test();



    }




}
