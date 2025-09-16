package oops;

// Abstract Base Class
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID  : " + itemId);
        System.out.println("Title    : " + title);
        System.out.println("Author   : " + author);
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}

// Interface for Reservable items
interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

// Book Class
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;  // 14 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            System.out.println(borrower + " reserved the book '" + getTitle() + "'");
            isAvailable = false;
        } else {
            System.out.println("Book '" + getTitle() + "' is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Magazine Class
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;  // 7 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            System.out.println(borrower + " reserved the magazine '" + getTitle() + "'");
            isAvailable = false;
        } else {
            System.out.println("Magazine '" + getTitle() + "' is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// DVD Class (Non-reservable for demonstration)
class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;  // 3 days
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book("B001", "Effective Java", "Joshua Bloch");
        items[1] = new Magazine("M001", "Time Magazine", "Time Editors");
        items[2] = new DVD("D001", "Inception", "Christopher Nolan");

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                System.out.println("Availability: " + (((Reservable) item).checkAvailability() ? "Available" : "Not Available"));
                ((Reservable) item).reserveItem("John Doe");
                System.out.println("Availability after reservation: " + (((Reservable) item).checkAvailability() ? "Available" : "Not Available"));
            } else {
                System.out.println("This item cannot be reserved.");
            }

            System.out.println("-----------------------------");
        }
    }
}

