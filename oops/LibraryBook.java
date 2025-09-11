package oops;
public class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book is not available.");
            return false;
        }
    }

    public void displayInfo() {
        System.out.println("Library Book: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + isAvailable);
    }
}

