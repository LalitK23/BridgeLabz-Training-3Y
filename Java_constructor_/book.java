public class book {

    private String title;
    private String author;
    private double price;

    public book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        // Using default constructor
        book book1 = new book();
        book1.displayBook();

        System.out.println();
        book book2 = new book("The Alchemist", "Paulo Coelho", 499.99);
        book2.displayBook();
    }
}
