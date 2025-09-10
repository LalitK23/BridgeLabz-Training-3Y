public class Book_2 {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book_2(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Book_2 b1 = new Book_2("1984", "George Orwell", 399.99, true);
        Book_2 b2 = new Book_2("The Alchemist", "Paulo Coelho", 499.50, false);

        b1.displayBook();
        System.out.println();
        b2.displayBook();

        System.out.println("\n--- Borrowing Attempts ---");
        b1.borrowBook();
        b2.borrowBook();

        System.out.println("\n--- After Borrowing ---");
        b1.displayBook();
        b2.displayBook();
    }
}
