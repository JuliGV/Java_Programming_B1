package day34_a_static.Debit;

public class Debit {

    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    static String accountType;

    static {
        System.out.println("Static block is running");
        accountType = "Checking";
    }

    public Debit(long cardNumber,String holderName,String cardType){
        if((cardNumber+"").length() ==16){
            this.cardNumber = cardNumber;
        }

        this.holderName = holderName;
        this.cardType = cardType;

    }

    public Debit(long cardNumber,String holderName,String cardType,int pin){

    }





}
