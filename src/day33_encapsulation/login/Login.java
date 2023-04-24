package day33_encapsulation.login;

public class Login {
    private  String userName;
    private  String password;

    public void setUpUserName (String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        if(password.length()>= 8){
            this.password = password;
        }
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(String userName){
        if(this.userName.equals(userName)){
            return password;
        }
        return null;
    }

//    @Override
//    public String toString() {
//        return "Login{" +
//                "userName='" + userName + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
