package oops;

abstract class Vehiclee {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehiclee(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type          : " + type);
        System.out.println("Rental Rate   : $" + rentalRate + " per day");
    }

    public double getRentalRate() { return rentalRate; }
}

// Interface for Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehiclee implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;  // Flat insurance rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: $200";
    }
}

class Bike extends Vehiclee {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}

class Truck extends Vehiclee implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: $500";
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("CAR123", 100);
        vehicles[1] = new Bike("BIKE456", 50);
        vehicles[2] = new Truck("TRK789", 300);

        for (Vehiclee v : vehicles) {
            v.displayInfo();
            System.out.println("Rental Cost for 5 days: $" + v.calculateRentalCost(5));

            if (v instanceof Insurable) {
                System.out.println(((Insurable) v).getInsuranceDetails());
                System.out.println("Insurance Cost: $" + ((Insurable) v).calculateInsurance());
            } else {
                System.out.println("No Insurance Available");
            }

            System.out.println("----------------------------");
        }
    }
}

