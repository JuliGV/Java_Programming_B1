package day32_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Yuliia","SDET");

        Employee emp2 = new Employee("Oksana","QA",123, 120_000.00);
        System.out.println(emp1);
        System.out.println(emp2);
    }


}
