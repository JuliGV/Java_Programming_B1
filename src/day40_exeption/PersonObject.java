package day40_exeption;

public class PersonObject {
    public static void main(String[] args) {
        Person p = new Person();
        try{
            p.setName(null);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Hello");
        System.out.println("Bye");

    }

}
