package oops;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket() {
        System.out.println("Ticket booked for " + movieName + " | Seat: " + seatNumber + " | Price: " + price);
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", 12, 250);
        ticket.bookTicket();
        ticket.displayDetails();
    }
}

