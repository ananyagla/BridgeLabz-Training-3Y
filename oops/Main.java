package oops;
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Product Inventory ===");
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Smartphone", 800.0);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();

        System.out.println("\n=== Online Course Management ===");
        Course c1 = new Course("Java Programming", 40, 500.0);
        Course c2 = new Course("Python Basics", 30, 300.0);
        c1.displayCourseDetails();
        Course.updateInstituteName("XYZ Academy");
        c2.displayCourseDetails();

        System.out.println("\n=== Vehicle Registration ===");
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorbike");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(150.0);
        v2.displayVehicleDetails();

        System.out.println("\n=== University Management System ===");
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "John Doe", 3.8);
        pgStudent.displayPostgradDetails();
        pgStudent.setCGPA(3.9);
        pgStudent.displayPostgradDetails();

        System.out.println("\n=== Book Library System ===");
        EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch");
        ebook.displayEBookDetails();
        ebook.setAuthor("Joshua J. Bloch");
        ebook.displayEBookDetails();

        System.out.println("\n=== Bank Account Management ===");
        SavingsAccount savings = new SavingsAccount("ACC123", "Jane Smith", 2000.0);
        savings.displaySavingsAccount();
        savings.setBalance(2500.0);
        savings.displaySavingsAccount();

        System.out.println("\n=== Employee Records ===");
        Manager manager = new Manager("EMP001", "IT", 75000.0);
        manager.displayManagerDetails();
        manager.setSalary(80000.0);
        manager.displayManagerDetails();
    }
}

// ---- Supporting Classes ----

class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println(courseName + " | Duration: " + duration + " hrs | Fee: $" + fee + " | Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 100.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    public void displayPostgradDetails() {
        System.out.println("Postgrad Student Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }
}

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }
}

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccount() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: $" + getBalance());
    }
}

class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
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

class Manager extends Employee {
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Salary: $" + getSalary());
    }
}


