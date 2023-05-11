package day40_exeption.bank;

public class NotEnoghtMoneyExeptions extends RuntimeException{

    public NotEnoghtMoneyExeptions(){
        super("Not enough money");
    }

    public NotEnoghtMoneyExeptions(String msg){
        super("msg");
    }
}
