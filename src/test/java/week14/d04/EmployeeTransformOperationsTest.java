package week14.d04;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTransformOperationsTest {
    
    
    @Test
    void test() {
        List<Employee> employees = List.of(
            new Employee("kaci"),
            new Employee("ani"),
            new Employee("visa")
        );
        
        
        assertEquals("KACI", new EmployeeTransformOperations().transformToUppercased(employees).get(0).getName());
    }
    
}