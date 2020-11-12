package stringconcat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void wrongNameParameters() {

        assertEquals(null, new Employee(null, "job", 12000));
    }
}
