package week14.d04;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTransformOperations {
    
    public List<Employee> transformToUppercased(List<Employee> employees) {
        return employees
            .stream()
            .map(employee -> new Employee(employee.getName().toUpperCase()))
            .collect(Collectors.toList());
    }
}
