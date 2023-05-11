package day40_exeption.bank;

public class Bank {

    double balance;
    public void withdrawn(double accountToTakeOut){
        if(accountToTakeOut>balance){
            throw new NotEnoghtMoneyExeptions();
        }

    }
    public void login(String userName, String password) throws Exception{
        if(!userName.equals("Tom Jerry")){
            throw new InvalidCredentinals("Not valid user name");
        }
        if(!password.equals("34erfdcv")){
            throw new InvalidCredentinals("Not valid user password");
        }

    }
}
