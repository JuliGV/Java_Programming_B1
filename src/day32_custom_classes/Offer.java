package day32_custom_classes;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;

    public Offer(String location,String company){
        this.company = company;
        this.location = location;
    }

    public Offer(String location,String company,double salary){
        this.company = company;
        this.location = location;
        this.salary = salary;
    }
    public Offer(String location,String company,double salary,boolean isFullTime,int numOfPTO){
        this.company = company;
        this.location = location;
        this.salary = salary;
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
