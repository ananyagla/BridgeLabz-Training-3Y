import java.util.Random;

public class ZaraBonus {

    // Method to generate salaries & years of service (2D Array)
    public static int[][] generateEmployees(int n) {
        Random rand = new Random();
        int[][] employees = new int[n][2]; // [salary, years of service]

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000);  // 5-digit salary
            int years = 1 + rand.nextInt(15);          // 1 to 15 years
            employees[i][0] = salary;
            employees[i][1] = years;
        }
        return employees;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employees) {
        double[][] result = new double[employees.length][2]; // [newSalary, bonus]

        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];

            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to display results in table
    public static void displayResults(int[][] employees, double[][] updated) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-12s %-12s %-12s\n",
                "ID", "Salary", "Years", "New Salary", "Bonus", "Increase");

        for (int i = 0; i < employees.length; i++) {
            int oldSalary = employees[i][0];
            int years = employees[i][1];
            double newSalary = updated[i][0];
            double bonus = updated[i][1];

            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;

            System.out.printf("%-5d %-10d %-10d %-12.2f %-12.2f %-12.2f\n",
                    (i + 1), oldSalary, years, newSalary, bonus, bonus);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-5s %-10.2f %-10s %-12.2f %-12.2f\n",
                "Total", totalOld, "", totalNew, totalBonus);
    }

    public static void main(String[] args) {
        int n = 10; // 10 employees
        int[][] employees = generateEmployees(n);
        double[][] updated = calculateBonus(employees);
        displayResults(employees, updated);
    }
}

