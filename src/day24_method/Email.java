package day24_method;
/*

create methid that takes two arguments as a name and domain
and print email
 */

public class Email {
    public static void genereteEmail(String name,String domain){
        String email =name.toLowerCase()+"@"+domain.toLowerCase()+".com";
        System.out.println("Your email address: "+email);
    }

    public static void genereteEmailFromName (String fullName,String domain){
        String email = fullName.substring(0,fullName.indexOf(" ")).toLowerCase()+"@"+domain.toLowerCase()+".com";
        System.out.println(email);
    }




    public static void main(String[] args) {
        genereteEmail("Yuliia","Gmail");
        genereteEmailFromName("Yuliia Kolisnyk", "Gmail");

    }
}

