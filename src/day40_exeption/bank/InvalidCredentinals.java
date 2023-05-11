package day40_exeption.bank;

public class InvalidCredentinals extends Exception{
    public InvalidCredentinals(String msg){
        super(msg);
    }

}
