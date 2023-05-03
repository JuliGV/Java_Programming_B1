package day36_inheritance.finalExample;

public final class FinalExample {

    final int a = 5;

    // if something is final we must immediately give value or assigne in the
    //constractor
    final int b;

    public final static String PLANET = "Earth";//constant variable

    public FinalExample(int b){
        this.b = b;
    }
}
