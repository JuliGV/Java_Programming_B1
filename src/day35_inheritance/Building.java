package day35_inheritance;

public class Building {
    public static void main(String[] args) {
        Person person = new Person();
        person.name= "Tom";
        person.age = 40;
        person.favoriteHobbys = "spy";
        person.talk();

        // person.studing(); can have access to child class


        Student student = new Student();
        student.name = "Yuliia";
        student.age = 30;
        student.favoriteHobbys = "cheat";
        student.talk();
        student.study();




    }
}
