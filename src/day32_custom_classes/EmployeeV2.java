package day32_custom_classes;

public class EmployeeV2 {
    String name;
    int id;
    String jobTitle;
    double salary;

    public EmployeeV2 (String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }
    public EmployeeV2 (String name, String jobTitle,int id,double salary ){
        this(name,jobTitle);
        this.id = id;
        this.salary = salary;
    }
    //instans method that is has void return type without arguments
    public void goToMeeting(){
        System.out.println(name+" is going to a meeting");
    }

//    @Override
//    public String toString() {
//        return "Employee " +
//                "\nName " + name +
//                "\nId " + id +
//                "\nJobTitle " + jobTitle +
//                "\nSalary " + salary;
//    }

    public String toString(){
        String msg = "";

        msg+="\nName: "+name;
        msg+= "\nTitle: "+jobTitle;
        msg+="\nID "+((id!=0) ? id: "Id to be determined");
        msg+="\nName: "+((name!=null) ? name: "Name to be determined");
        msg+="\nSalary "+((salary!=0) ? salary: "Salary to be determined");
        return  msg;
    }
//    public void goToMeeting(String name){
//
//        System.out.println(this.name+" and "+" is going to a meeting");
//    }

}
