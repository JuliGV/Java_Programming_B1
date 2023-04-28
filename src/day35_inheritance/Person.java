package day35_inheritance;
// Parent class or super class

public class Person {

    String name;
    int age;
    String favoriteHobbys;


    public void talk(){
        System.out.println(name+" is taking");
    }

    @Override
    public String toString() {
        return
                "name " + name + '\'' +
                ", age=" + age +
                ", favoriteHobbys='" + favoriteHobbys + '\'' +
                '}';
    }
}
