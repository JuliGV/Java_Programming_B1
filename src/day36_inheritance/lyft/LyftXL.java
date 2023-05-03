package day36_inheritance.lyft;

public class LyftXL extends Lyft{
    public LyftXL(String driver){
        super(driver);
    }

    @Override
    public double calculate(int miles) {
        //return (miles*3.75) *1.1;
        return super.calculate(miles)*1.1;// because it will be dynamically
    }
}
