import java.util.ArrayList;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() { return 14; }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            this.borrower = borrowerName;
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is not available.");
        }
    }

    @Override
    public boolean checkAvailability() { return isAvailable; }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() { return 7; }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            this.borrower = borrowerName;
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is not available.");
        }
    }

    @Override
    public boolean checkAvailability() { return isAvailable; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() { return 3; }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            this.borrower = borrowerName;
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is not available.");
        }
    }

    @Override
    public boolean checkAvailability() { return isAvailable; }
}


class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B101", "Java Programming", "Krish"));
        items.add(new Magazine("M201", "Tech Monthly", "Ravi"));
        items.add(new DVD("D301", "Inception", "Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("John");
            }
            System.out.println();
        }
    }
}
