package debug;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employeeList;

    public Company(List<Employee> list) {

        employeeList = list;
    }

    public void addEmployee(Employee employee) {

        employeeList.add(employee);
    }

    public Employee findEmployeeByName(String name) {

        return employeeList.get(listEmployeeNames().indexOf(name));
    }

    List<String> listEmployeeNames() {

        List<String> names = new ArrayList<>();

        for (Employee item: employeeList) {
            names.add(item.getName());
        }

        return names;
    }
}
