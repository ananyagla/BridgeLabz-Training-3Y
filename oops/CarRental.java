package oops;
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateCost();
    }

    private double calculateCost() {
        double ratePerDay = 50.0;
        return rentalDays * ratePerDay;
    }

    public void displayRentalDetails() {
        System.out.println(customerName + " rented a " + carModel + " for " + rentalDays + " days. Total cost: $" + totalCost);
    }
}

