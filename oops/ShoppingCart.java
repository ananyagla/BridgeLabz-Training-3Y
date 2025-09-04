package oops;

import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }
}

public class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalCost();
        }
        System.out.println("Total Cart Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Shoes", 1500, 2));
        cart.addItem(new CartItem("T-shirt", 800, 1));
        cart.displayTotalCost();
        cart.removeItem("Shoes");
        cart.displayTotalCost();
    }
}

