import java.io.*;
public class EmployeeTest {
    public static void main(String args[]){
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        empOne.empAge(26);
        empOne.empDesignation("Senior soft ware Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
