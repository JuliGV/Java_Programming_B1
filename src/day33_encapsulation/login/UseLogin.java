package day33_encapsulation.login;

public class UseLogin {
    public static void main(String[] args) {
        Login obj1 = new Login();
        obj1.setUpUserName("test");
        obj1.setPassword("12345678");
        //System.out.println(obj1);

        System.out.println(obj1.getPassword("test"));
        System.out.println(obj1.getUserName());
        Login obj2 = new Login();
        obj2.setUpUserName("Yuliia");
        obj2.setPassword("qawsed123");
        System.out.println(obj2.getPassword("Yuliia"));


    }
}
