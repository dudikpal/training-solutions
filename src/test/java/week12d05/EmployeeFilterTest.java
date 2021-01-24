package week12d05;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFilterTest {

    @Test
    void countSeniorDevs() {
        EmployeeFilter ef = new EmployeeFilter();
        List<Employee> employees = List.of(
                new Employee(35, 4, "Csávó1", List.of("programming", "drinking", "eating")),
                new Employee(39, 1, "Csávó2", List.of("programming", "drinking", "eating")),
                new Employee(45, 2, "Csávó3", List.of("sinking", "drinking", "eating")),
                new Employee(34, 3, "Csávó4", List.of("thinking", "drinking", "eating")),
                new Employee(25, 4, "Csávó5", List.of("programming", "drinking", "eating"))
        );
        assertEquals(2, ef.countSeniorDevs(employees).size());
    }
}