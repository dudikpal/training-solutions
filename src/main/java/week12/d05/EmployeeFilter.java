package week12.d05;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {

    public List<Employee> countSeniorDevs(List<Employee> employees) {
        /*List<Employee> developers = new ArrayList<>();
        for (Employee employee : employees) {
          if (employee.getSkills().contains("programming") && employee.getSkillLevel() > 2) {
              developers.add(employee);
          }
        }
        return developers;*/
        return employees.stream().filter((devs) -> devs.getSkillLevel() > 2 && devs.getSkills().contains("programming")).collect(Collectors.toList());
    }
}
