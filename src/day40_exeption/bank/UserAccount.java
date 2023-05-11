package day40_exeption.bank;

import day40_exeption.bank.Bank;

public class UserAccount {
    public static void main(String[] args) {
        Bank one = new Bank();
        one.balance = 1000;

        one.withdrawn(9000);
        try{
            one.login("Test","yhgbfv");
        }catch (InvalidCredentinals e){
            System.out.println(e.getMessage());
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }




    }
}
