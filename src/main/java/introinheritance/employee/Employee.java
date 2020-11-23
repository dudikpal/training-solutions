package introinheritance.employee;

public class Employee extends Person{

    private double salary;

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public void raiseSalary(int percent) {
        salary += salary * percent /100;
    }

    public static void main(String[] args) {

        Employee emp = new Employee("jani", "görcs u. 1.", 210000);

        System.out.println(emp.getName());
        System.out.println(emp.getAddress());
        System.out.println(emp.getSalary());
    }

    public double getSalary() {
        return salary;
    }
}
