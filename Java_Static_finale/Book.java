class Book {
    static String libraryName = "Central Library";

    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

class main {
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book b1 = new Book("1984", "George Orwell", "ISBN1001");
        Book b2 = new Book("The Alchemist", "Paulo Coelho", "ISBN1002");

        if (b1 instanceof Book) {
            b1.displayDetails();
        }
        System.out.println("----------------");
        if (b2 instanceof Book) {
            b2.displayDetails();
        }
    }
}
