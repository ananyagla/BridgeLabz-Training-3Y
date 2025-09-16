package oops;

// Abstract Base Class
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }

    public String getName() { return name; }
}

// Interface for Medical Record
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient Subclass
class InPatient extends Patient implements MedicalRecord {
    private int numberOfDays;
    private String[] records = new String[10];
    private int recordCount = 0;

    public InPatient(String patientId, String name, int age, int numberOfDays) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return numberOfDays * 500;  // $500 per day
    }

    @Override
    public void addRecord(String record) {
        if (recordCount < records.length) {
            records[recordCount++] = record;
        }
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for InPatient:");
        for (int i = 0; i < recordCount; i++) {
            System.out.println("- " + records[i]);
        }
    }
}

// OutPatient Subclass
class OutPatient extends Patient implements MedicalRecord {
    private String[] records = new String[10];
    private int recordCount = 0;

    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return 100;  // Flat fee for outpatient visit
    }

    @Override
    public void addRecord(String record) {
        if (recordCount < records.length) {

