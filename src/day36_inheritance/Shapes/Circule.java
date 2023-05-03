package day36_inheritance.Shapes;

public class Circule extends Shapes{

    double radius;
    public Circule(double radius){
        super("Circule");
        this.radius = radius;
    }
    @Override
    public double calculateArea (){
        return radius*radius*Math.PI;
    }
    @Override
    public double perimetr(){
        return 2*Math.PI *radius;
    }

    @Override
    public String toString() {
        return "Circule{" +
                "radius=" + radius +
                '}';
    }
}
