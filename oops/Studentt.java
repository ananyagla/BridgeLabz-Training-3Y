package oops;

public class Studentt {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Studentt(int rollNumber, String name, double cgpa) {
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

public class PostgraduateStudent extends Studentt {
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    public void displayPostgradDetails() {
        System.out.println("Postgrad Student Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }
}

