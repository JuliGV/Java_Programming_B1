package day31_custom_class;

public class Carpet {
    // have instans variables : width, length,isPersian
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(double inputWidth, double inputLength, boolean inputIsPersian,double inputUnitPrice){
        width = inputWidth;
        length = inputLength;
        isPersian = inputIsPersian;
        unitPrice = inputUnitPrice;

        calculatePrice();// execute calculate method
    }
    // instance method
    public void calculatePrice (){
        totalPrice = width*length*unitPrice;
        if(isPersian){
            totalPrice+=1000;
        }


    }

    @Override
    public String toString() {
        return "Carpet 1" +
                "\nWidth " + width +
                "\nLength " + length +
                "\nIs Persian " + isPersian +
                "\nUnitPrice " + unitPrice +
                "\nTotalPrice " + totalPrice;
    }
}
