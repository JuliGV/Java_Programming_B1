package day31_custom_class;

public class Marker {

    //instans variable
    String type;
    String brand;
    String colour;

    // local variable String inputType,String inputColour,String inputBrand
    // Java priority local variable
    public Marker (String inputType,String inputColour,String inputBrand){
        type = inputType;
        colour = inputColour;
        brand = inputBrand;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "\ntype " + type +
                "\nbrand " + brand  +
                "\ncolour " + colour;
    }
}
