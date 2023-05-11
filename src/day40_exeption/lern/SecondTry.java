package day40_exeption.lern;

public class SecondTry {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
            int [] a = {1,2,3,4};
        }catch(NullPointerException n){
            System.out.println(" null");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Array");

        }
        System.out.println("Done");
    }
}