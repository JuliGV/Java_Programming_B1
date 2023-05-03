package day36_inheritance.Shapes;

public class Squer extends Shapes{
    double side;
    public Squer(double side){
        super("Squer");
        this.side = side;

    }
    @Override
    public double calculateArea (){
        return side*side;
    }
    @Override
    public double perimetr(){
        return side*4;
    }


}
