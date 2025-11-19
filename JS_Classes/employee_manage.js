class Employee {
    constructor(id, name, department, salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    getAnnualSalary() {
        return this.salary * 12;
    }

    applyBonus(percent) {
        this.salary = this.salary + (this.salary * (percent / 100));
    }
}

const e1 = new Employee(1, "Aman", "IT", 30000);
const e2 = new Employee(2, "Riya", "HR", 25000);
const e3 = new Employee(3, "Sahil", "Finance", 40000);
const e4 = new Employee(4, "Neha", "Marketing", 28000);
const e5 = new Employee(5, "Krish", "IT", 35000);

const employees = [e1, e2, e3, e4, e5];

employees.forEach(emp => {
    console.log(`${emp.name}: Annual Salary = ₹${emp.getAnnualSalary()}`);
});

const totalAnnualPayout = employees.reduce((total, emp) => {
    return total + emp.getAnnualSalary();
}, 0);

console.log("Total Annual Payout of Company: ₹" + totalAnnualPayout);
