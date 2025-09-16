package oops;

// Abstract Base Class
abstract class Productt {
    private String productId;
    private String name;
    private double price;

    public Productt(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayProductDetails() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Price      : $" + price);
    }

    public double getPrice() { return price; }
    public void setPrice(double price) { if (price >= 0) this.price = price; }
}

// Interface for Taxable products
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class implementing Taxable
class Electronics extends Productt implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;  // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.15;  // 15% tax
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 15%";
    }
}

// Clothing class (no tax)
class Clothing extends Productt {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;  // 20% discount
    }
}

// Groceries class (no tax)
class Groceries extends Productt {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;  // 5% discount
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Productt[] products = new Productt[3];

        products[0] = new Electronics("E001", "Smartphone", 800);
        products[1] = new Clothing("C001", "Jeans", 60);
        products[2] = new Groceries("G001", "Rice Pack", 40);

        for (Productt p : products) {
            p.displayProductDetails();

            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;

            System.out.println("Discount: $" + discount);
            System.out.println("Tax     : $" + tax);
            System.out.println("Final Price: $" + (p.getPrice() + tax - discount));
            System.out.println("----------------------------");
        }
    }
}

