class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("---------------------");
    }
}

class EBook extends Book {
    private String fileFormat;

    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN); // public
        System.out.println("Title: " + title); // protected
        System.out.println("Author (via getter): " + getAuthor()); // private accessed via public method
        System.out.println("File Format: " + fileFormat);
        System.out.println("---------------------");
    }
}

class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("978-1234567890", "Java Basics", "Alice");
        b1.displayBookDetails();

        EBook eb1 = new EBook("978-0987654321", "Advanced Java", "Bob", "PDF");
        eb1.displayEBookDetails();
    }
}
