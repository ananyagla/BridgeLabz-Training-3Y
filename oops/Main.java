package oops;
public class Main {
    public static void main(String[] args) {

        // Person class demo
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person(person1);
        person1.display();
        person2.display();

        // HotelBooking class demo
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Bob", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2);
        booking1.displayBooking();
        booking2.displayBooking();
        booking3.displayBooking();

        // LibraryBook class demo
        LibraryBook libBook = new LibraryBook("The Alchemist", "Paulo Coelho", 15.0);
        libBook.displayInfo();
        libBook.borrowBook();
        libBook.borrowBook();
        libBook.displayInfo();

        // CarRental class demo
        CarRental rental = new CarRental("Charlie", "Toyota Corolla", 4);
        rental.displayRentalDetails();
    }
}

