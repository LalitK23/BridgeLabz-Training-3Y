import java.util.ArrayList;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getDetails() {
        return "Employee: " + name;
    }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            System.out.println("   -> " + e.getDetails());
        }
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    public void closeCompany() {
        departments.clear();
        System.out.println(companyName + " is closed. All departments and employees are removed.");
    }
}

class CompositionExample {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee("Alice");
        d1.addEmployee("Bob");
        d2.addEmployee("Charlie");

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();

        comp.closeCompany();
    }
}
