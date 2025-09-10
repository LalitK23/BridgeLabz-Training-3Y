class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

class Manager extends Employee {
    private int teamSize;

    Manager(String employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID); // public
        System.out.println("Department: " + department); // protected
        System.out.println("Salary (via getter): " + getSalary()); // private accessed via public method
        System.out.println("Team Size: " + teamSize);
        System.out.println("----------------------");
    }
}

class EmployeeSystem {
    public static void main(String[] args) {
        Employee emp = new Employee("E101", "HR", 50000);
        emp.displayEmployeeDetails();

        Manager mgr = new Manager("M202", "Sales", 80000, 10);
        mgr.displayManagerDetails();
    }
}
