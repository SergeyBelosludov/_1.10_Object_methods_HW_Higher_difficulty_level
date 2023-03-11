public class Book {

    private final String nameBook;
    private final Author authorBook;
    private int publishingYear;

    public Book(String nameBook, Author authorBook, int publishingYear) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book: " + this.nameBook + " by " + this.authorBook;
    }

    @Override
    public int hashCode() {
        return this.nameBook.hashCode() + this.authorBook.hashCode() + this.publishingYear;
    }

    @Override
    public boolean equals(Object obj) {
        Book ob = (Book) obj;
        if (this == obj) {
            return true;
        } else if (this.nameBook == ob.nameBook && this.authorBook == ob.authorBook && this.publishingYear == ob.publishingYear && this.hashCode() == ob.hashCode()) {
            return true;
        } else {
            return false;
        }
    }
}
