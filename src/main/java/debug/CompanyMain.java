package debug;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {


    public static void main(String[] args) {

        Employee emp1 = new Employee("első", 1999);
        Employee emp2 = new Employee("második", 2000);
        Employee emp3 = new Employee("harmadik", 2001);
        Employee emp4 = new Employee("negyedik", 2002);
        Employee emp5 = new Employee("ötödik", 2003);

        List<Employee> employeeList = new ArrayList<>();
        Company company = new Company(employeeList);
        System.out.println(company.listEmployeeNames());
        company.addEmployee(emp1);
        company.addEmployee(emp2);
        company.addEmployee(emp3);
        company.addEmployee(emp4);
        company.addEmployee(emp5);
        System.out.println(company.listEmployeeNames());

        System.out.println(company.findEmployeeByName("harmadik").getName());
        System.out.println(company.findEmployeeByName("harmadik").getYearOfBirth());
    }

}
