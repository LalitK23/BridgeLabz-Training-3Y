class Book {
    constructor(title, author, ISBN, isIssued = false) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isIssued = isIssued;
    }

    issueBook() {
        if (!this.isIssued) {
            this.isIssued = true;
            console.log(`Book Issued: ${this.title}`);
        } else {
            console.log(`Already Issued: ${this.title}`);
        }
    }

    returnBook() {
        if (this.isIssued) {
            this.isIssued = false;
            console.log(`Book Returned: ${this.title}`);
        } else {
            console.log(`Book was not issued: ${this.title}`);
        }
    }
}

const books = [
    new Book("Atomic Habits", "James Clear", "1111"),
    new Book("The Alchemist", "Paulo Coelho", "2222"),
    new Book("Think and Grow Rich", "Napoleon Hill", "3333"),
    new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "4444", true)
];

console.log("Available Books:");
books
    .filter(book => !book.isIssued)
    .forEach(book => console.log(`${book.title} - ${book.author} (ISBN: ${book.ISBN})`));

function issueBookByISBN(isbn) {
    const book = books.find(b => b.ISBN === isbn);
    if (book) {
        book.issueBook();
    } else {
        console.log("Book not found");
    }
}

issueBookByISBN("3333");
