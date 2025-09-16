package oops;

// Abstract Base Class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : $" + price);
        System.out.println("Quantity  : " + quantity);
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { if (quantity >= 0) this.quantity = quantity; }
}

// Interface for Discountable
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// VegItem Class
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;  // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

// NonVegItem Class
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + 5) * getQuantity();  // Additional non-veg charge of $5 per item
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;  // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        FoodItem[] orderItems = new FoodItem[2];

        orderItems[0] = new VegItem("Paneer Butter Masala", 8.0, 2);
        orderItems[1] = new NonVegItem("Chicken Biryani", 12.0, 1);

        for (FoodItem item : orderItems) {
            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = (item instanceof Discountable) ? ((Discountable) item).applyDiscount() : 0;

            System.out.println(((Discountable) item).getDiscountDetails());
            System.out.println("Total Price before discount: $" + totalPrice);
            System.out.println("Discount Applied          : $" + discount);
            System.out.println("Final Price               : $" + (totalPrice - discount));
            System.out.println("----------------------------");
        }
    }
}

