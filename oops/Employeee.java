package oops;

public class Employeee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employeee(String employeeID, String department, double salary) {
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
}

public class Manager extends Employeee {
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Salary: $" + getSalary());
    }
}

