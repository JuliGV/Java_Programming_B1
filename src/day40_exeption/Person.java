package day40_exeption;

public class Person {
    private System name;
    private int age;

    public System getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(System name) throws Exception{
        if(name==null){
            throw new Exception("Nane can not be null");
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
