import java.util.*;
class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Department {
    String name;
    List<Employee> employees = new ArrayList<>();
    Department(String name) {
        this.name = name;
    }
    void addEmployee(Employee e) {
        employees.add(e);
    }
}

public class OneToManyDemo {
    public static void main(String[] args) {
        Department dept = new Department("CSE");
        dept.addEmployee(new Employee(17, "Cherry"));
        dept.addEmployee(new Employee(22, "Banti"));
        for (Employee e : dept.employees)
            System.out.println(e.id + " " + e.name);
    }
}
