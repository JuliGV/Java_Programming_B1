package day40_exeption;

public class TryWithInheritance {
    public static void main(String[] args) {
        try{

        }catch (IndexOutOfBoundsException e){// 1st more specific

        }catch (RuntimeException e){//2nd more specific

        }catch (Exception e){//3rd specific

        }
    }
}
