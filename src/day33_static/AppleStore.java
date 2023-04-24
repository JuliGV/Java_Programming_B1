package day33_static;

public class AppleStore {
    public static void main(String[] args) {

        Iphone phone1 = new Iphone("Iphone 14",999.99);
        System.out.println(phone1);
        Iphone phone2 = new Iphone("Iphone 15",1000.0);
        System.out.println(phone2);

        System.out.println(phone1.company);
        System.out.println(phone1.OS);
        System.out.println(phone1.appleDay);
        System.out.println(Iphone.company);
        System.out.println(Iphone.OS);
        System.out.println(Iphone.appleDay);

        Iphone.company = "Samsung";
        phone1.OS = "Android";
        phone2.appleDay = true;
        System.out.println();
        System.out.println(phone1.OS);
        System.out.println(phone1.appleDay);
        System.out.println(Iphone.company);
        System.out.println(Iphone.OS);
        System.out.println(Iphone.appleDay);


    }

}
