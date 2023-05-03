package day36_inheritance.Shapes;

public class Shapes {
    String name;
    public double calculateArea (){
        return 0;
    }
    public Shapes(String name){
        this.name = name;
    }
    public double perimetr(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "name='" + name + '\'' +
                '}';
    }
}
