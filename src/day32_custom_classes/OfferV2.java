package day32_custom_classes;

public class OfferV2 {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;

    public OfferV2 (String location,String company){
        this.company = company;
        this.location = location;
    }

    public OfferV2 (String location,String company,double salary){
        this(location,company);
        this.salary = salary;
    }
    public OfferV2(String location,String company,double salary,boolean isFullTime,int numOfPTO){
        this(location,company,salary);// using with keyword we call another constructor which instansient the value on instance variable
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;


    }

    @Override
    public String toString() {
        return "Offer " +
                "\nLocation " + location +
                "\nCompany " + company +
                "\nSalary $" + salary +
                "\nIsFullTime " + isFullTime +
                "\nNumber of PTO " + numOfPTO;
    }
}
